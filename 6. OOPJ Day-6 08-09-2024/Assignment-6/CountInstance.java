/** 
* @author Sanket Ahire
*/

public class CountInstance 
{
    public static void main(String[] args) 
    {
        
        InstanceCounter obj1 = new InstanceCounter();
        InstanceCounter obj2 = new InstanceCounter();
        InstanceCounter obj3 = new InstanceCounter();

        System.out.println("Number of instances created: " + InstanceCounter.getInstanceCount());

        InstanceCounter obj4 = new InstanceCounter();

        System.out.println("Number of instances created: " + InstanceCounter.getInstanceCount());
    }
}

class InstanceCounter 
{
    private static int instanceCount = 0;

    public InstanceCounter() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
