package com.dbs.tarun.one2one_bidirectional;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Mobile implements Serializable{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long phoneID;
    private String os;
    private String cpu;
    private String ram;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Charger charger;

	public Long getPhoneID() {
		return phoneID;
	}

	public void setPhoneID(Long phoneID) {
		this.phoneID = phoneID;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public Charger getCharger() {
		return charger;
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	@Override
	public String toString() {
		return "Mobile [phoneID=" + phoneID + ", os=" + os + ", cpu=" + cpu + ", ram=" + ram + ", charger=" + charger
				+ "]";
	}
    
}
