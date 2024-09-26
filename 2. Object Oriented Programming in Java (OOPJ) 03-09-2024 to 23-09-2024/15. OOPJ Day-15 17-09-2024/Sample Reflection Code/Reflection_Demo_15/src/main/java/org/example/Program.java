package org.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Account{
    int getId( );
    void setId( int id );
    double getBalance( );
    void setBalance( double balance );
    void deposit( float amount );
    void withdraw( float amount );
}

class AccountImpl implements  Account{
    private int id;
    private double balance;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(float amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(float amount) throws RuntimeException{
        if( this.balance < amount )
            throw new RuntimeException("Insufficient balance.");
        this.balance -= amount;
    }
}

class AccountProxyHandler implements InvocationHandler{
    private Account target;
    public AccountProxyHandler(Account target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] arguments) throws Throwable {
        //Pre-Processing logic
        if( method.getName().equals("deposit") || method.getName().equals("withdraw") ) {
            float amount = (float) arguments[0];
            if (amount <= 0.0f)
                throw new RuntimeException("Invalid amount");
        }
        //call business logic
        method.invoke( this.target, arguments );

        //Post-Processing logic
        System.out.println(method.getName()+" on account "+this.target.getId());
        return null;
    }
}

public class Program {
    public static Account getAccountProxy( Account account){
        AccountProxyHandler accountProxyHandler = new AccountProxyHandler( account );
        Account proxy = (Account) Proxy.newProxyInstance(Account.class.getClassLoader(), new Class[]{Account.class}, accountProxyHandler);
        return proxy;
    }
    public static void main(String[] args) {
        AccountImpl account = new AccountImpl();
        account.setId(1001);
        account.setBalance( 50000);

        /* AccountProxyHandler accountProxyHandler = new AccountProxyHandler( account );
        
        Account proxy = (Account) Proxy.newProxyInstance(Account.class.getClassLoader(), new Class[]{Account.class}, accountProxyHandler); */

        Account proxy = Program.getAccountProxy(account);

        //System.out.println( proxy.getClass().getName());    //org.example.$Proxy0

        proxy.deposit( 2000 );

        proxy.withdraw( 3000 );

        proxy.withdraw( -1000 );
    }
}