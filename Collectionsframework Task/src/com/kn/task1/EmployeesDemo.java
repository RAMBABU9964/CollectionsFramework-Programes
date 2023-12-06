package com.kn.task1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class EmployeesDemo {
	public static void main(String[] args) {
     Employee e1=new Employee(11, "Ram", 520000);
     Employee e2=new Employee(13, "Revanth", 320000);
     Employee e3=new Employee(14, "Shashi", 220000);
     Employee e4=new Employee(12, "Shyam", 820000);
     
     ArrayList<Employee> lst=new ArrayList<Employee>();
     lst.add(e1);
     lst.add(e2);
     lst.add(e3);
     lst.add(e4);
     
     System.out.println("Before Sorting========>");
     System.out.println(lst);
     System.out.println("******************************************************************");
     
     Collections.sort(lst, new Comparator<Employee>() {

		@Override
		public int compare(Employee s1, Employee s2) {
			if(s1.empId>s2.empId) {
				return 1;
			}else if(s1.empId<s2.empId) {
				return -1;
			}else {
			return 0;
			
		}}
	});
     
     System.out.println("After ID Sorting ascending Order ======>");
     System.out.println(lst);
     System.out.println("******************************************************************");
     
     Collections.sort(lst, new Comparator<Employee>() {

 		@Override
 		public int compare(Employee s1, Employee s2) {
 			if(s1.empId>s2.empId) {
 				return -1;
 			}else if(s1.empId<s2.empId) {
 				return 1;
 			}else {
 			return 0;
 			
 		}}
 	});
      
      System.out.println("After ID Sorting descending Order ======>");
      System.out.println(lst);
      System.out.println("******************************************************************");
     
      
      Collections.sort(lst, new Comparator<Employee>() {

		@Override
		public int compare(Employee t1, Employee t2) {
			
			return t1.getEmpName().compareTo(t2.getEmpName());
		}
	});
      System.out.println("After Name Sorting ascending Order ======>");
      System.out.println(lst);
      System.out.println("******************************************************************");
	
      Collections.sort(lst, new Comparator<Employee>() {

  		@Override
  		public int compare(Employee t1, Employee t2) {
  			
  			return t2.getEmpName().compareTo(t1.getEmpName());
  		}
  	});
        System.out.println("After Name Sorting decscending Order ======>");
        System.out.println(lst);
        System.out.println("******************************************************************");
  	
      Collections.sort(lst, new Comparator<Employee>() {

   		@Override
   		public int compare(Employee s1, Employee s2) {
   			if(s1.salary>s2.salary) {
   				return 1;
   			}else if(s1.salary<s2.salary) {
   				return -1;
   			}else {
   			return 0;
   			
   		}}
   	});
        
        System.out.println("After Salary Sorting ascending Order ======>");
        System.out.println(lst);
        System.out.println("******************************************************************");
      
        Collections.sort(lst, new Comparator<Employee>() {

     		@Override
     		public int compare(Employee s1, Employee s2) {
     			if(s1.salary>s2.salary) {
     				return -1;
     			}else if(s1.salary<s2.salary) {
     				return 1;
     			}else {
     			return 0;
     			
     		}}
     	});
          
          System.out.println("After Salary Sorting descending Order ======>");
          System.out.println(lst);
          System.out.println("******************************************************************");
	}

}
