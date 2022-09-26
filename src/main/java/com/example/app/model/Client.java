package com.example.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	//attribut de la table 
	
	@Column(name = "name")
	private String name;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "adresse")
	private String adresse;
	@Column(name = "cin")
	private String cin;
	
	
	//getter and setter
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public Client() {
		super();
	}
	//constructeur avec parametre
	public Client(long id, String name, String lastname, String adresse, String cin) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.adresse = adresse;
		this.cin = cin;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", lastname=" + lastname + ", adresse=" + adresse + ", cin="
				+ cin + "]";
	}
	
	
	
	

}
