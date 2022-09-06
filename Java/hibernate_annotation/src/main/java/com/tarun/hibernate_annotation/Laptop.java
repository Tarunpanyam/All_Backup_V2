package com.tarun.hibernate_annotation;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Laptop implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = -8376055644692455614L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long laptopId;
    private String brand,cpu,ram,hdd;
	public Long getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(Long laptopId) {
		this.laptopId = laptopId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
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
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand, cpu, hdd, laptopId, ram);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(cpu, other.cpu) && Objects.equals(hdd, other.hdd)
				&& Objects.equals(laptopId, other.laptopId) && Objects.equals(ram, other.ram);
	}
	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", brand=" + brand + ", cpu=" + cpu + ", ram=" + ram + ", hdd=" + hdd
				+ "]";
	}
}
