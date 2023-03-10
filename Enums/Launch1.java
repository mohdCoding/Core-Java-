// No Modifiers allowed at enum level,
// when enum is not written within a class
enum Weeks
{
	/*
	Internally: public static final SUNDAY = new Weeks();
	            public static final TUESDAY = new Weeks();
				etc......................................

	The object is getting created that means
	one class is getting created here it is 
	class Weeks extends Enum{

         
	} -> will get created
	and it extending the Enum class
	and it has some methods. Week class has some specialized methods like:
	values() and valueOf() it will not written by us JVM will do all this
	things. 
	*/
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

enum Students{
    TAMIL, ENGLISH, MATHS, SCIENCE, SOCIAL;
    
	private  int marks;
	public void setMarks(int marks){
       this.marks = marks;
	}

	public int getMarks(){
		return marks;
	}
}

class EnumDemo{

	public static void execute(){
		
		Launch1.Results pass = Launch1.Results.PASS;
		System.out.println(pass);

		
	}
}
public class Launch1 {

  //enum is within class "EXCEPT FINAL MODIFIER" other 
  // "Modifiers are allowed"
	
	static int marks;
	int length;
   enum Results
   {
	PASS,FAIL,NORESULT;
	  
	   
	   public void set() {
		   
	   }
	   
   }

    static enum Gender{
	    MALE,FEMALE,OTHERS;
	  
	   public static void set() {
		   marks = 90;
	   }
   }

	public static void main(String[] args) {
		
		// New Object is getting created for the right side code
		// Weeks.SUNDAY; -> which is equal to new Weeks();
		Weeks sunday = Weeks.SUNDAY;
		Weeks monday = Weeks.MONDAY;
		Weeks tuesday = Weeks.TUESDAY;
		System.out.println(sunday + ", " + monday + ", " + tuesday);
        System.out.println();

		Results pass=Results.PASS;
		Results fail=Results.FAIL;
		Results nr = Results.NORESULT;

		System.out.println(pass + ", " + fail + ", " + nr);
		System.out.println();

		int sp = sunday.ordinal();
		int mp = Weeks.MONDAY.ordinal();
		int tp = tuesday.ordinal();
		System.out.println(sp + ", " + mp + ", " + tp);
        System.out.println();

		for(Weeks day:Weeks.THURSDAY.values())
		{
            System.out.println(day+ " :: " + day.ordinal());
		}
		
		Weeks[] arr= sunday.values();
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i].ordinal());
		}

		EnumDemo.execute();
       
	    System.out.println();

		Students.TAMIL.setMarks(78);
		Students.ENGLISH.setMarks(95);
		Students.MATHS.setMarks(45);
		Students.SCIENCE.setMarks(93);
		Students.SOCIAL.setMarks(97);
        int tamilMark = Students.TAMIL.getMarks();
		 System.out.println("Tamil Mark: " + tamilMark);
		 System.out.println("Other subject marks: " + 
		 Students.ENGLISH.getMarks()+ ", " + Students.MATHS.getMarks() + 
		 ", " + Students.SCIENCE.getMarks() + ", " + Students.SOCIAL.getMarks());


	}

}
