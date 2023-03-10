enum Phone1
{
    // public static final VIVO = new Phone();
    VIVO, SAM, OOPO, IPHONE, REALME, REDMI;

    private  Phone1(){
       System.out.println("Constructor called: " + this);
    }
    
    


}

class Launch3{

    public static void main(String ...args)
    {
      Phone1 vivo=Phone1.VIVO;
      System.out.println(vivo);
    }
}