package com.cours.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ElHadji
 */
public class Personne {
	private int id;
	private String name;
	private String lastName;
	private double weight;
	private double height;
	private String street;
	private String city;
	private int zipCode;

	public Personne(int id, String name, String lastName, double weight, double height, String city, String street,
			int zipCode) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.weight = weight;
		this.height = height;
		this.city = city;
		this.street = street;
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		String ret;

		ret = "id = " + Integer.toString(id) + ",";
		ret += "name = " + name + ",";
		ret += "lastName = " + lastName + ",";
		ret += "weight = " + weight + ",";
		ret += "height = " + height + ",";
		ret += "street = " + street + ",";
		ret += "city = " + city + ",";
		ret += "zip = " + zipCode + ",";

		return ret;
	}

	@Override
	public boolean equals(Object obj) {
		Personne other;

		if (this == obj)
			return true;

		if (!(obj instanceof Personne))
			return false;

		other = (Personne) obj;

		if (other.street != street)
			return false;

		if (other.zipCode != zipCode)
			return false;

		if (other.weight != weight)
			return false;

		if (other.id != id)
			return false;

		if (other.name != name)
			return false;

		if (other.lastName != lastName)
			return false;

		if (other.height != height)
			return false;

		if (other.city != city)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		List<Object> properties;

		properties = new ArrayList<>();
		properties.add(street);
		properties.add(zipCode);
		properties.add(name);
		properties.add(lastName);
		properties.add(id);
		properties.add(height);
		properties.add(weight);
		properties.add(city);

		return Arrays.hashCode(properties.toArray());
	}

	public double getIMC() {
		return (weight / Math.pow(height, 2.0));
	}

	public boolean isMaigre() {
		return (getIMC() < 18);
	}

	public boolean isSurPoids() {
		double imc;

		imc = getIMC();

		return (imc > 25 && imc < 30);
	}

	public boolean isObese() {
		double imc;

		imc = getIMC();

		return (imc > 30 && imc < 40);
	}

}