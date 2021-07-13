package Main;

import Airport.Airport;

import java.time.LocalTime;
import logic.Logic;


import Airline.Airline;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Airport air = new Airport();
		Logic logic = new Logic();
		
		
		
		Airline line = new Airline("Минск", 123, "Маленький", LocalTime.parse( "19:40" ), 1);
		
		air.add(new Airline("Минск", 123, "Маленький", LocalTime.parse( "19:40" ), 1));
		air.add(new Airline("Гродно", 1234, "Большой", LocalTime.parse( "20:40" ), 2));
		air.add(new Airline("Минск", 1334, "Средний", LocalTime.parse( "13:40" ), 3));
		air.add(new Airline("Гродно", 5234, "Большой", LocalTime.parse( "10:40" ), 3));
		air.add(new Airline("Минск", 12224, "Средний", LocalTime.parse( "15:40" ), 2));
		
		
//		System.out.println("1 задание: ");
//		logic.printByWeekDay(air);
//		System.out.println("2 задание: ");
//		logic.printByDestination(air);
		System.out.println("3 задание: ");
		logic.printByTimeAndWeekday(air);
		
	}

}
