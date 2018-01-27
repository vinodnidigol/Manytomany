package com.app.manytomany;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bus_table")
public class BusDTO implements Serializable {
	@Id
	@Column(name = "bus_number")
	private String number;

	@Column(name = "bus_color")
	private String color;

	@Column(name = "bus_type")
	private String type;

	@Column(name = "bus_noOfSeats")
	private int noOfSeats;

	@ManyToMany(cascade=CascadeType.ALL)
	private Collection<PassengerDTO> passengers;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public Collection<PassengerDTO> getPassengers() {
		return passengers;
	}

	public void setPassengers(Collection<PassengerDTO> passengers) {
		this.passengers = passengers;
	}

}
