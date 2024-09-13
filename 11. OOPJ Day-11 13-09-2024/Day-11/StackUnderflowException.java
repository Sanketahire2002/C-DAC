package org.example.exception;

@SuppressWarnings("serial")
public class StackUnderflowException extends Exception{
	public StackUnderflowException(String message) {
		super(message);
	}
}