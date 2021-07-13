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
		
		
		
		Airline line = new Airline("�����", 123, "���������", LocalTime.parse( "19:40" ), 1);
		
		air.add(new Airline("�����", 123, "���������", LocalTime.parse( "19:40" ), 1));
		air.add(new Airline("������", 1234, "�������", LocalTime.parse( "20:40" ), 2));
		air.add(new Airline("�����", 1334, "�������", LocalTime.parse( "13:40" ), 3));
		air.add(new Airline("������", 5234, "�������", LocalTime.parse( "10:40" ), 3));
		air.add(new Airline("�����", 12224, "�������", LocalTime.parse( "15:40" ), 2));
		
		
//		System.out.println("1 �������: ");
//		logic.printByWeekDay(air);
//		System.out.println("2 �������: ");
//		logic.printByDestination(air);
		System.out.println("3 �������: ");
		logic.printByTimeAndWeekday(air);
		
	}

}
