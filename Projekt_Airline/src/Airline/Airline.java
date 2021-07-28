package Airline;// именование пакетов?

import java.time.LocalTime;

public class Airline {
	String destination;//куда делись атрибуты доступа?
	int flightNumber;
	String aircraftType;
	LocalTime time;
	int dayOfWeek;
	
	public Airline(String destination, int flightNumber, String aircraftType, LocalTime time, int dayOfWeek) {
		super();
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.aircraftType = aircraftType;
		this.time = time;
		this.dayOfWeek = dayOfWeek;
	}
	
	

	@Override
	public String toString() {
		return "Airline [Ïóíêò íàçíà÷åíèÿ=" + destination + ", Íîìåð ðåéñà=" + flightNumber + ", òèï ñàìîëåòà="
				+ aircraftType + ", Âðåìÿ=" + time + ", Äåíü íåäåëè=" + dayOfWeek + "]";
	}



	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public int getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aircraftType == null) ? 0 : aircraftType.hashCode());
		result = prime * result + dayOfWeek;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightNumber;
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (aircraftType == null) {
			if (other.aircraftType != null)
				return false;
		} else if (!aircraftType.equals(other.aircraftType))
			return false;
		if (dayOfWeek != other.dayOfWeek)
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNumber != other.flightNumber)
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}
	
	
	
}
