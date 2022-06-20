package com.Generic;

import java.util.Random;

public class Utilities {
	
	public static String getMobileNumber(int intLength) {

		String allowChars="0123456789";
		String randomString="";

		for(int intIndex=0; intIndex<intLength;intIndex++) {
			
			int intNum= (int) Math.floor(Math.random()*allowChars.length());
			randomString+=allowChars.substring(intNum, intNum+1);
		}
		
		String strStartDigit[] = {"99","98","97","96","95","94","93","92","91","90"};
		
		String strRandomDigit = strStartDigit[new Random().nextInt(strStartDigit.length)];
		
		return strRandomDigit+randomString;
		
		
	}
	
	public static String getDay() {
		
		String strRandomDate = "";
		int intRandom = (int) (Math.random()*30);
				
		if(intRandom == 0) {
			intRandom = (int) (Math.random()*30);
		}
		
		strRandomDate = String.valueOf(intRandom).trim();
		
		
		return strRandomDate;
	}
	
	public static String getMonth() {
		
		String strMonth[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		String strRandomMonth = strMonth[new Random().nextInt(strMonth.length)];
		
		return strRandomMonth;
	}
	
	public static String getYear() {
		
		String strYear[] = {"1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998"};
		
		String strRandomYear = strYear[new Random().nextInt(strYear.length)];
		
		return strRandomYear;
	}

}

