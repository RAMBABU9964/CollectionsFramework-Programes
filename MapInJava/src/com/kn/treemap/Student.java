package com.kn.treemap;

public class Student {
int id;
String name;
double cgp;
public Student(int id, String name, double cgp) {
	this.id = id;
	this.name = name;
	this.cgp = cgp;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", cgp=" + cgp + "]";
}

}
