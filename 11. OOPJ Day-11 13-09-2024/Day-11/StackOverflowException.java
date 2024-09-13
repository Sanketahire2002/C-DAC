package org.example.exception;

@SuppressWarnings("serial")
public class StackOverflowException extends Exception{
	public StackOverflowException(String message) {
		super(message);
	}
}
