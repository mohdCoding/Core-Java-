@interface FootballPlayer{

}

@FootballPlayer
class Ronaldo
{
    @FootballPlayer
    private String name;

    @FootballPlayer
    private static int goals;

    

    @FootballPlayer
    Ronaldo(String name, int goals)
    {
        this.name = name;
        this.goals = goals;
    }

    @FootballPlayer
    public void display(){
        System.out.println("Hi im cristiano Ronaldo ...... normal method");
        System.out.println("SUIIIIIIIIIIIIIIIIIIIIIIII...........");
    }

    @FootballPlayer
    public static void show(){
        System.out.println("Hola madrid.......... static method");
    }

    @FootballPlayer
    @Override
    public String toString(){
        return "Ronaldo = [name = "+ name + ", goals = "+goals+"]";
    }
     
  
}

class Launch1{

    public static void main(String[] args)
    {
       
       Ronaldo ronaldo=new Ronaldo("Cristiano Ronaldo", 800);
       System.out.println(ronaldo);

       ronaldo.display();
       System.out.println();
       ronaldo.show();
    }

}