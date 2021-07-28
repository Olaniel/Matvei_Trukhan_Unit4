package Airport;

import java.util.ArrayList;
import java.util.List;

import Airline.Airline;

public class Airport {
	private List<Airline> planes;

	public Airport() {
		planes = new ArrayList<Airline>();
	}

	public List<Airline> getPlanes() {
		return planes;
	}

	public void setPlanes(List<Airline> planes) {
		this.planes = planes;
	}
	
	public void add (Airline plane) {
		planes.add(plane);
	}

	@Override
	public String toString() {
		return "Airport [planes=" + planes + "]";
	}

	public void get(int index) {
		// а метод чего пустой?
	}
	
	

}
