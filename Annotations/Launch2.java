import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Student{
   
   String getName() default "name";
   int getAge() default 1;
    
}

@Student(getName="Haroon",getAge=19)
class Haroon{

     private String name;
     private int age;

     public void getDetails() {
         Haroon haroon=new Haroon();
         Class c = haroon.getClass();
         Annotation annotation= c.getAnnotation(Student.class);
         Student s =(Student) annotation;
         name =  s.getName();
         age= s.getAge();
         
       }

     public String getName(){
        return name;
     }

     public int getAge(){
        return age;
     }
}

class Launch2{

    public static void main(String ...args){
        Haroon haroon=new Haroon();
        haroon.getDetails();
        System.out.println(haroon.getName());
        System.out.println(haroon.getAge());
    }
}