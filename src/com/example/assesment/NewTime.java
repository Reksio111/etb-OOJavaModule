package com.example.assesment;


import java.time.LocalDate;
import java.util.Date;

public class NewTime {

	// values
	private int hour;
	private int mins;

	// default constructor
	public NewTime() {

	}

	//Parameterised constructor
	public NewTime(int h, int min) {
		this.hour = h;
		this.mins = min;
	}

//getters and setters
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMins() {
		return mins;
	}

	public void setMins(int mins) {
		this.mins = mins;
	}

	// check if minutes are in range between 0 and 59
	// and hours are in range between 0 and 12
	public boolean valid24Time(int h, int m) {
		boolean validate = false;
		if (h >= 0 && h < 24 && m >= 0 && m <= 59) {
			validate = true;
		}
		return validate;
	}

	public int addTime(int hh1, int mm1, int hh2, int mm2) {
		int time = 0;
		if (valid24Time(hh1, mm1) && (valid24Time(hh2, mm2))) {
			time = hh1 + hh2;
			int min = mm1 + mm2;
			if (min > 59) {
				time++;
			}
			if (time > 23) {
				time = time - 24;
			}
		}
		return time;

	}

	public int substractTime(int hh1, int mm1, int hh2, int mm2) {
		int time = -1;
		int minsdif;
		int hourdif = 0;
		if (valid24Time(hh1, mm1) && (valid24Time(hh2, mm2))) {
			minsdif = mm1 - mm2;
			hourdif = hh1 - hh2;
			if (minsdif < 0) {
				hourdif = hourdif - 1;
			}
			if (hourdif < 0) {
				time = 24 + hourdif;
			} else {
				time = hourdif;
			}
		}
		return time;
	}

}
