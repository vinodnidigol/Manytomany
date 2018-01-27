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
@Table(name = "passenger_table")
public class PassengerDTO implements Serializable {
	@Id
	@Column(name = "pas_id")
	private int passId;
	@Column(name = "pass_destination")
	private String destination;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Collection<BusDTO> buses;

	public int getId() {
		return passId;
	}

	public void setId(int id) {
		this.passId = id;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getPassId() {
		return passId;
	}

	public void setPassId(int passId) {
		this.passId = passId;
	}

	public Collection<BusDTO> getBuses() {
		return buses;
	}

	public void setBuses(Collection<BusDTO> buses) {
		this.buses = buses;
	}

}
