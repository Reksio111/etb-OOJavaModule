package com.example.assesment;

public class NewTime {

	private int hour;
	private int mins;

	public NewTime() {
		
	}
	public NewTime(int h, int min) {
		this.hour = h;
		this.mins = min;
	}
	

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
	public boolean valid24Time(int h, int m) {
		boolean validate = false;
		if (h >= 0 && h < 24 && m >= 0 && m <= 69) {
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
		int time = 0;
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
		

		 }

		// time=hh1-hh2;
		
	}
			return hourdif;
}
}
