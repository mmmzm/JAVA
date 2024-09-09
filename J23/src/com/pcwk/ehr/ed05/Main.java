package com.pcwk.ehr.ed05;

public class Main {

	public static void main(String[] args) {
		Day toDay = Day.THURSDAY;
		
		System.out.println("To day is "+toDay);

		Day[] dayArray = Day.values();
		
		for(Day d :dayArray) {
			System.out.printf("%s=%d%n",d.name(),d.ordinal());
		}
		
	}

}
//To day is THURSDAY
//SUNDAY=0
//MONDAY=1
//TUESDAY=2
//WEDNSDAY=3
//THURSDAY=4
//FRIDAY=5
//SATURDAY=6