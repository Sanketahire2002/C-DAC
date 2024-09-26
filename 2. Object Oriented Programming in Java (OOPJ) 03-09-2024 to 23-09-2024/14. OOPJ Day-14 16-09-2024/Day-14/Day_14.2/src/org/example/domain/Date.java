package org.example.domain;

import java.time.LocalDate;

public class Date extends Object implements Cloneable{
	private int day;
	private int month;
	private int year;

	public Date() {
		LocalDate ldt = LocalDate.now();
		this.day = ldt.getDayOfMonth();
		this.month = ldt.getMonthValue();
		this.year = ldt.getYear();
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	// protected native Object clone() throws CloneNotSupportedException;
	public Date clone( ) {
		//By convention, the returned object should be obtained by calling super.clone.
		try {
			Date other = (Date) super.clone();	//Creating clone of dt1 instance: Shallow Copy of Instance
			return other;
		} catch (CloneNotSupportedException e) {
			throw new InternalError(e);
		}
	}
	
	@Override
	public String toString() {
		return this.day + " / " + this.month + " / " + this.year;
	}
}
