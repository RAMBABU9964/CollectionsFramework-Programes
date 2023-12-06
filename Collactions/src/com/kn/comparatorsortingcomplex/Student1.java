package com.kn.comparatorsortingcomplex;

public class Student1 {
	 int id;
	  String name;
	  double Percentage;
	  
	public Student1(int id, String name, double percentage) {
		this.id = id;
		this.name = name;
		Percentage = percentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return Percentage;
	}

	public void setPercentage(double percentage) {
		Percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Percentage=" + Percentage + "]";
	}

}
