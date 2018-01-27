package com.app.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.Sf.util.SingleTonSessionFactory;

public class ManyToManyDAO {
	public static void main(String[] args) {

		// create multiple objects of Bus

		BusDTO bus1 = new BusDTO();
		bus1.setType("BMTC");
		bus1.setColor("Green");
		bus1.setNoOfSeats(52);
		bus1.setNumber("KA 03 AA 1234");

		BusDTO bus2 = new BusDTO();
		bus2.setType("KSRTC");
		bus2.setColor("RED");
		bus2.setNoOfSeats(60);
		bus2.setNumber("KA 01 AX 2364");

		
		//create multiple objects of passengers
		PassengerDTO passenger1 = new PassengerDTO();
		passenger1.setId(1234567);
		passenger1.setDestination("Basavanagudi");

		PassengerDTO passenger2 = new PassengerDTO();
		passenger2.setId(0374753);
		passenger2.setDestination("Electronic city");

		// create collection of passengers
		List<PassengerDTO> l1 = new ArrayList<>();
		l1.add(passenger1);
		l1.add(passenger2);

		// relate Each Bus with the collection of passengers
		bus1.setPassengers(l1);
		bus2.setPassengers(l1);

		// create collection of buses
		List<BusDTO> buses = new ArrayList<>();
		buses.add(bus1);
		buses.add(bus2);

		// relate each passenger with collection of Buses

		passenger1.setBuses(buses);
		passenger2.setBuses(buses);

		// components of hibernate
		Session sess = SingleTonSessionFactory.getSF().openSession();

		sess.save(bus1);
		sess.save(bus2);
		sess.save(passenger1);
		sess.save(passenger2);

		sess.beginTransaction().commit();

	}
}
