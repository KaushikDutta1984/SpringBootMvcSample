package com.kaushik.SpringBootMvcSample.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {

	@Id
	int Aid;
	String Name;
	//String location;
	
	public Alien() {
		// TODO Auto-generated constructor stub
	}
	
	public int getAid() {
		return Aid;
	}

	public Alien(int aid, String name) {
		
		Aid = aid;
		Name = name;
	}

	public void setAid(int aid) {
		Aid = aid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Alien [Aid=" + Aid + ", Name=" + Name + "]";
	}
	
	
}
