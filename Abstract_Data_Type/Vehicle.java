package Abstract_Data_Type;

 abstract class Vehicle {
      
	 abstract void setName(String name);
	 abstract void setPrice(int price);
	 abstract String getName();
	 abstract int getPrice();
	 
	 abstract void checking();
	 1
	 public Vehicle(){
		 System.out.println("vehicle constructor");
	 }
	
	 public final  int wheels() {
		 return 4;
	 }
	 
	 public static void frontSeat() {
		 System.out.println("2 seats in front");
	 }
	 
	 
}
 
 
abstract class Bike extends Vehicle {
	
	private String name;
	private int price;
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	
	protected String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	
}

class honda extends Bike {
	
	public void checking() {
		
	}
	
}

class Car extends Vehicle{
	private String name;
	private int price;
	
	public Car(){
		System.out.println("car constructor");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	
	protected String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void tankCapacity() {
		System.out.println("car tank capacity");
	}
	
	public void checking() {
		
	}
}

class PassVehicles {
	
	public void permit(Vehicle vehicle) {
		
	System.out.println(vehicle.getName());
	System.out.println(vehicle.getPrice());
	System.out.println(vehicle.wheels());
    vehicle.frontSeat();
	
	}
}

class TestVehicles {
	
  public static void main(String[] args) {
	 
	  PassVehicles p = new PassVehicles();
	  
	  honda b1 = new honda();
	  b1.setName("Hero Honda");
	  b1.setPrice(80000);
	  b1.frontSeat();
	  Vehicle c1 = new Car();
	  c1.setName("Mahindra");
	  c1.setPrice(750000);
	  
	  
	  
	  p.permit(b1);
	  p.permit(c1);
}
	
	
	
	
}
class b {
	private String name;
	
	  void disp() {
		
	}
}
class a extends b {
	
	
}

class demo{
	public static void main(String[] args) {
		a a = new a();
		a.disp();
	}
}
/**
 * Notes for abstract data type
 * 
 * 1. we cannot create object for abstract class
 * 2. child class must need to implement every abstract method of parent class
 * 3. a class should be abstract even one method is abstract in that class
 * 4. Creating reference is possible in abstract class so that we can achieve polymorphism
 * 5. Constructor creating is possible in abstract class
 * 6. abstract + final method is not allowed
 * 7. abstract + final class is not allowed
 * 
 * 8. if a child class is unable to provide implementation to all abstract methods 
 *    of the parent class then we should declare the child class as abstract so that
 *    the next level child should provide implementation to the remaining 
 *    abstract method
 *    
 *    5. explanation:
 *       => child hava constructor it call parent class with the help of super()
 *          that class extending object so it will call object class contructor
 *          thats why constructor creating allowed in abstract class
 * 
 */



