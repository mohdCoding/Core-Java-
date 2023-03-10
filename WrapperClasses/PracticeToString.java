package WrapperClasses;

class Movies {
	private String name;
	
	public Movies(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}

class Apartment {
	private String name;
	
	public Apartment(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.getClass());
	}
}

class Car {
	private String name;
	public Car(String name) {
		this.name = name;
	}
	
}
public class PracticeToString {

	public static void main(String[] args) {
		
		Movies movies = new Movies("John Wick 4");
		System.out.println(movies);
		
		Apartment ap = new Apartment("Park");
		System.out.println(ap);
		
		Car car = new Car("RollsRoyce");
		System.out.println(car);

	}

}
