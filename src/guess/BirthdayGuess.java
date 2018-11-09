package guess;

import java.util.Scanner;

public class BirthdayGuess {

	public static void main(String[] args) {
		//set up scanner
		Scanner input =new Scanner(System.in);
		
		//Binary numbers
		final int num128 = 128;
		final int num64 = 64;
		final int num32 = 32;
		final int num16 = 16;
		final int num8 = 8;
		final int num4 = 4;
		final int num2 = 2;
		final int num1 = 1;
		
		//sets of numbers
		String set1 = "";
		String set2 = "";
		String set3 = "";
		String set4 = "";
		String set5 = "";
		
		String mset1 = "";
		String mset2 = "";
		String mset3 = "";
		String mset4 = "";
		
		String yset1 = "";
		String yset2 = "";
		String yset3 = "";
		String yset4 = "";
		String yset5 = "";
		String yset6 = "";
		String yset7 = "";

		
		
		//input number
		
		int inputnum = 0;
		
		//Conversion placeholder
		int whatsLeft;
		
		
		
		for(int i=0 ;i<100;i++) {
		String biannum = "";
		
		inputnum = inputnum+1;
		
		//Initialize what's left
		whatsLeft = inputnum;
		
		//creating binary number in string format 
		if (inputnum >= num128) {
			whatsLeft = inputnum - num128;
			biannum = biannum+"1";
		}
		else {
			biannum = biannum+"0";
		}
		if (whatsLeft>= num64) {
			whatsLeft = whatsLeft - num64;
			biannum = biannum+"1";
		}
		else {
			biannum = biannum+"0";
		}
		if (whatsLeft >= num32) {
			whatsLeft = whatsLeft - num32;
			biannum = biannum+"1";
		}
		else {
			biannum = biannum+"0";
		}
		if (whatsLeft >= num16) {
			whatsLeft = whatsLeft - num16;
			biannum = biannum+"1";
		}
		else {
			biannum = biannum+"0";
		}
		if (whatsLeft >= num8) {
			whatsLeft = whatsLeft - num8;
			biannum = biannum+"1";
		}
		else {
			biannum = biannum+"0";
		}
		if (whatsLeft >= num4) {
			whatsLeft = whatsLeft - num4;
			biannum = biannum+"1";
		}
		else {
			biannum = biannum+"0";
		}
		if (whatsLeft >= num2) {
			whatsLeft = whatsLeft - num2;
			biannum = biannum+"1";
		}
		else {
			biannum = biannum+"0";
		}
		if (whatsLeft >= num1) {
			whatsLeft = whatsLeft - num1;
			biannum = biannum+"1";
		}
		else {
			biannum = biannum+"0";
		}
		//display 
		
		
		// check indexing of binary number
		char xnum7 = biannum.charAt(7);
		char xnum6 = biannum.charAt(6);
		char xnum5 = biannum.charAt(5);
		char xnum4 = biannum.charAt(4);
		char xnum3 = biannum.charAt(3);
		char xnum2 = biannum.charAt(2);
		char xnum1 = biannum.charAt(1);
		char xnum0 = biannum.charAt(0);
		
		if (xnum7=='1') {
			yset1=yset1+inputnum+" ";
		}
		if (xnum6=='1') {
			yset2=yset2+inputnum+" ";
		}
		if (xnum5=='1') {
			yset3=yset3+inputnum+" ";
		}
		if (xnum4=='1') {
			yset4=yset4+inputnum+" ";
		}
		if (xnum3=='1') {
			yset5=yset5+inputnum+" ";
		}
		if (xnum2=='1') {
			yset6=yset6+inputnum+" ";
		}
		if (xnum1=='1') {
			yset7=yset7+inputnum+" ";
		}

		
		if(inputnum <= 31) {
			//assign to sets
			if (xnum7=='1') {
				set1=set1+inputnum+" ";
			}
			if (xnum6=='1') {
				set2=set2+inputnum+" ";
			}
			if (xnum5=='1') {
				set3=set3+inputnum+" ";
			}
			if (xnum4=='1') {
				set4=set4+inputnum+" ";
			}
			if (xnum3=='1') {
				set5=set5+inputnum+" ";
			}
		}
		if (inputnum<=12) {
			if (xnum7=='1') {
				mset1=mset1+inputnum+" ";
			}
			if (xnum6=='1') {
				mset2=mset2+inputnum+" ";
			}
			if (xnum5=='1') {
				mset3=mset3+inputnum+" ";
			}
			if (xnum4=='1') {
				mset4=mset4+inputnum+" ";
			}
		}
		
		//display

		}
		
		int year = 0;
		int month = 0;
		int day = 0;
		
		System.out.println("set1 is: "+yset1);
		System.out.println("is the last 2 of your birth year in this list? y/n");
		String answer = input.nextLine();
		if (answer.equals("y")) {
			year = year +1;
		}
		System.out.println("set2 is: "+yset2);
		System.out.println("is the last 2 of your birth year in this list? y/n");
		answer = input.nextLine();
		if (answer.equals("y")) {
			year = year +2;
		}
		System.out.println("set3 is: "+yset3);
		System.out.println("is the last 2 of your birth year in this list? y/n");
		answer = input.nextLine();
		if (answer.equals("y")) {
			year = year +4;
		}
		System.out.println("set4 is: "+yset4);
		System.out.println("is the last 2 of your birth year in this list? y/n");
		answer = input.nextLine();
		if (answer.equals("y")) {
			year = year +8;
		}
		System.out.println("set5 is: "+yset5);
		System.out.println("is the last 2 of your birth year in this list? y/n");
		answer = input.nextLine();
		if (answer.equals("y")) {
			year = year +16;
		}
		System.out.println("set1 is: "+yset6);
		System.out.println("is the last 2 of your birth year in this list? y/n");
		answer = input.nextLine();
		if (answer.equals("y")) {
			year = year +32;
		}
		System.out.println("set2 is: "+yset7);
		System.out.println("is the last 2 of your birth year in this list? y/n");
		answer = input.nextLine();
		if (answer.equals("y")) {
			year = year +64;
		}
		System.out.println("set1 is: "+mset1);
		System.out.println("is your your birth month in this list? y/n");
		answer = input.nextLine();
		if (answer.equals("y")) {
			month = month +1;
		}
		System.out.println("set1 is: "+mset2);
		System.out.println("is your your birth month in this list? y/n");
		answer = input.nextLine();
		if (answer.equals("y")) {
			month = month +2;
		}
		System.out.println("set1 is: "+mset3);
		System.out.println("is your your birth month in this list? y/n");
		answer = input.nextLine();
		if (answer.equals("y")) {
			month = month +4;
		}
		System.out.println("set1 is: "+mset4);
		System.out.println("is your your birth month in this list? y/n");
		answer = input.nextLine();
		if (answer.equals("y")) {
			month = month +8;
		}
		System.out.println("set1 is: "+set1);
		System.out.println("is your your birth day in this list? y/n");
		answer = input.nextLine();
		if (answer.equals("y")) {
			day = day +1;
		}
		System.out.println("set1 is: "+set2);
		System.out.println("is your your birth day in this list? y/n");
		answer = input.nextLine();
		if (answer.equals("y")) {
			day = day +2;
		}
		System.out.println("set1 is: "+set3);
		System.out.println("is your your birth day in this list? y/n");
		answer = input.nextLine();
		if (answer.equals("y")) {
			day = day +4;
		}
		System.out.println("set1 is: "+set4);
		System.out.println("is your your birth day in this list? y/n");
		answer = input.nextLine();
		if (answer.equals("y")) {
			day= day +8;
		}
		System.out.println("set1 is: "+set5);
		System.out.println("is your your birth day in this list? y/n");
		answer = input.nextLine();
		if (answer.equals("y")) {
			day = day +16;
		}
		
		String yearf = Integer.toString(year);
		if (year <= 9 ) {
			yearf = "0"+yearf;
		}
		String monthf = Integer.toString(month);
		String dayf = Integer.toString(day);

		
		System.out.println("your birthday is "+monthf+"/"+dayf+"/"+yearf);

	}

}
