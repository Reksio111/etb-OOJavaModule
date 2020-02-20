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

	// Parameterized constructor
	public NewTime(int h, int min) {
		this.hour = h;
		this.mins = min;
	}

	// getters and setters
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

	/*
	 * addTime() method -adds two enterd times 
	 * -add minutes and hours. If sum of
	 * hours or minutes exceeds correct range the add 1 to hours. 
	 * -to minutes by multiply by 60, add value of mjnutes and return it
	 * -if entered values of minutes or hours is out of determined range return -1
	 */

	public int addTime(int hh1, int mm1, int hh2, int mm2) {
		int time = -1;
		if (valid24Time(hh1, mm1) && (valid24Time(hh2, mm2))) {
			int hours = hh1 + hh2;
			int min = mm1 + mm2;
			if (min > 59) {
				min = min - 60;
				hours++;
			}
			if (hours > 23) {
				hours = hours - 24;

			}

			int hoursInMins = hours * 60;

			time = min + hoursInMins;
		}
		return time;

	}

	/*
	 * substracTime() this method logic is the same like addTime() method but
	 * instead adding time, substract them and return integer value
	 * 
	 */
	public int substractTime(int hh1, int mm1, int hh2, int mm2) {
		int time = -1;

		if (valid24Time(hh1, mm1) && (valid24Time(hh2, mm2))) {
			int min = mm1 - mm2;
			int hour = hh1 - hh2;
			if (hh1 > hh2) {
				hour = hh1 - hh2;

			} else {
				hour = 24 - (hh1 + hh2);
			}
			if (min < 0) {
				hour = hour - 1;
			}

			if (hour < 0) {
				time = 24 + hour;

			} else {
				time = hour;
			}

			time = (hour * 60) + min;
		}
		return time;
	}

}
