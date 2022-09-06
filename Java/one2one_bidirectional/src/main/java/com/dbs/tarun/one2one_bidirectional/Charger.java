package com.dbs.tarun.one2one_bidirectional;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;



@Entity
public class Charger {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long chargerID;
    private String inputVolt;
    private String outputVOlt;
    private String amp; //wireless or wired
    
    @OneToOne
    private Mobile mobile;

	public Long getChargerID() {
		return chargerID;
	}

	public void setChargerID(Long chargerID) {
		this.chargerID = chargerID;
	}

	public String getInputVolt() {
		return inputVolt;
	}

	public void setInputVolt(String inputVolt) {
		this.inputVolt = inputVolt;
	}

	public String getOutputVOlt() {
		return outputVOlt;
	}

	public void setOutputVOlt(String outputVOlt) {
		this.outputVOlt = outputVOlt;
	}

	public String getAmp() {
		return amp;
	}

	public void setAmp(String amp) {
		this.amp = amp;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Charger [chargerID=" + chargerID + ", inputVolt=" + inputVolt + ", outputVOlt=" + outputVOlt + ", amp="
				+ amp + ", mobile=" + mobile + "]";
	}
    
}
