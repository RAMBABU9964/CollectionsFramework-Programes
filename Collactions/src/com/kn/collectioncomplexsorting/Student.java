package com.kn.collectioncomplexsorting;

public class Student implements Comparable<Student> {
  int id;
  String name;
  double Percentage;
  
public Student(int id, String name, double percentage) {
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

//public int compareTo(Object o) {
//	if(this.id>((Student)(o)).id) {
//		return 1;
//	}else if(this.id<((Student)(o)).id){
//		return -1;
//	}else {
//	return 0;
//	}
//}
@Override
public int compareTo(Student s) {
	if(this.id>s.id) {
		return 1;
	}else if(this.id<s.id){
		return -1;
	}else {
	return 0;
	}
}
  //for desendingorder
//@Override
//public int compareTo(Student s) {
//	if(this.id>s.id) {
//		return -1;
//	}else if(this.id<s.id){
//		return 1;
//	}else {
//	return 0;
//	}
//}
  
}
