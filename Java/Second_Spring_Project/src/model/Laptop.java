package model;

import java.util.Objects;

public class Laptop {

	private Long laptopSerial;
	private String cpu,hdd,ram,bran,model;
	public Long getLaptopSerial() {
		return laptopSerial;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(Long laptopSerial, String cpu, String hdd, String ram, String bran, String model) {
		super();
		this.laptopSerial = laptopSerial;
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.bran = bran;
		this.model = model;
	}

	public void setLaptopSerial(Long laptopSerial) {
		this.laptopSerial = laptopSerial;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getBran() {
		return bran;
	}
	public void setBran(String bran) {
		this.bran = bran;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bran, cpu, hdd, laptopSerial, model, ram);
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
		return Objects.equals(bran, other.bran) && Objects.equals(cpu, other.cpu) && Objects.equals(hdd, other.hdd)
				&& Objects.equals(laptopSerial, other.laptopSerial) && Objects.equals(model, other.model)
				&& Objects.equals(ram, other.ram);
	}
	@Override
	public String toString() {
		return "Laptop [laptopSerial=" + laptopSerial + ", cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + ", bran="
				+ bran + ", model=" + model + "]";
	}
}
