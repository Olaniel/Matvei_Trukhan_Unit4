package logic;

import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

import Airline.Airline;
import Airport.Airport;

public class Logic {
	
	
	public void print (Airport planes) {	
		for (Airline s : planes.getPlanes()) {
	        System.out.println(s);
	    }
	}
	
	public void printByWeekDay (Airport planes) {
		System.out.println(">Введите день недели от 1 до 7");
		Scanner sc = new Scanner(System.in);
		int weekday = sc.nextInt();
		boolean check = false;
		
		for (Airline s : planes.getPlanes()) {
	       if (s.getDayOfWeek()==weekday) {
	    	   System.out.println(s);  
	    	   check = true;
	       }
	    }
		
		if (!check) {
			System.out.println("В этот день нет вылетов");
		}
	}
	
	public void printByDestination (Airport planes) {
		System.out.println(">Введите место назначения");
		Scanner sc1 = new Scanner(System.in);
		String Destination = sc1.nextLine();
		boolean check = false;
		
		for (Airline s : planes.getPlanes()) {
	       if (s.getDestination().compareTo(Destination)==0) {
	    	   System.out.println(s);  
	    	   check = true;
	       }
	    }
		
		if (!check) {
			System.out.println("В это место нет вылетов");
		}
	}
	
	public void printByTimeAndWeekday (Airport planes) {
		System.out.println(">Введите день недели от 1 до 7");
		Scanner sc1 = new Scanner(System.in);
		int DayOfTheWeek = sc1.nextInt();
		
		boolean check = false;
		LocalTime time = null;
		sc1 = new Scanner(System.in);

		System.out.println(">Введите время в формате XX:XX");
		time = LocalTime.parse(sc1.nextLine());
		
		for (Airline s : planes.getPlanes()) {
	       if (s.getDayOfWeek()==DayOfTheWeek && s.getTime().compareTo(time)>=0) {
	    	   System.out.println(s);  
	    	   check = true;
	       }
	    }
		
		if (!check) {
			System.out.println("Нет вылетов");
		}
	}

}
