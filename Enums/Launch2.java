enum Phone
{
    // public static final VIVO = new Phone();
    VIVO, SAM, OOPO, IPHONE, REALME, REDMI;

    private String model;
    private int cost;

    private Phone(){
       System.out.println("Constructor called: " + this);
    }

    Phone(String model, int cost){
      this.model = model;
      this.cost = cost;
    }

    public String getModel(){
      return model;
    }

    public int getCost(){
       return cost;
    }
}

class Launch2{

    public static void main(String ...args)
    {
      Phone vivo=Phone.VIVO;
      System.out.println(vivo);


        System.out.println(vivo.getCost());
       System.out.println(vivo.getModel());

    }
}