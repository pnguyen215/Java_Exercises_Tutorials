package com.phuocnguyen.lab1;

public class Time {

	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		super();
		setTime(hour, minute, second);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 23) {
			throw new IllegalArgumentException("Not valid hour's value");
		}
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			throw new IllegalArgumentException("Not valid minute's value");
		}
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59) {
			throw new IllegalArgumentException("Not valid second's value");
		}
		this.second = second;
	}

	public void setTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	@Override
	public String toString() {
		return this.hour + ":" + this.minute + ":" + this.second;
	}

	public Time nextSecond() {

		try {
			setTime(hour, minute, ++second);
			return this;
		} catch (IllegalArgumentException e) {
		}
		second = 0;
		return nextMinute();

	}

	public Time nextMinute() {
		try {
			setTime(hour, ++minute, second);
			return this;
		} catch (IllegalArgumentException e) {
		}

		minute = 0;
		return nextHour();
	}

	public Time nextHour() {
		try {
			setTime(++hour, minute, second);
			return this;
		} catch (IllegalArgumentException e) {
		}

		hour = 0;
		return this;
	}

	public Time previousSecond() {
		try {
			setTime(hour, minute, --second);
			return this;
		} catch (IllegalArgumentException e) {
		}

		second = 59;
		return previousMinute();
	}

	public Time previousMinute() {
		try {
			setTime(hour, --minute, second);
			return this;
		} catch (IllegalArgumentException e) {
		}

		minute = 59;
		return previousHour();
	}

	public Time previousHour() {
		try {
			setTime(--hour, minute, second);
			return this;
		} catch (IllegalArgumentException e) {
		}

		hour = 23;
		return this;
	}
}
