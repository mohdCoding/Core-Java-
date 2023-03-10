package checking;

import java.util.Scanner;

class Student {
   private int id;
   private double cpi;
   private  String name;
public Student(int id, double cpi, String name) {
	super();
	this.id = id;
	this.cpi = cpi;
	this.name = name;
}
public int getId() {
	return id;
}
public double getCpi() {
	return cpi;
}
public String getName() {
	return name;
}

public static void show() {
	
}
public static void input() {
	  show();
}

static {
	input();
}

 
   
  }

class test{
	public static void main(String[] args) {
		Student s[] = new Student[3];
		Scanner sc = new Scanner(System.in);
	     for(int i=0; i<s.length; i++) {
	    	 int id = sc.nextInt();
	    	 double cpi = sc.nextDouble();
	    	 String name = sc.nextLine();
	    	 s[i] = new Student(id, cpi, name);
	    	 
	     }
	     
	     for(int i=0; i<s.length; i++) {
	    	 System.out.println(s[i].getName() + " " + s[i].getCpi() + " " + s[i].getId());
	     }
		
		
	}
}
