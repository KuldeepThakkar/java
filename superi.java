class noo {
    int i = 90;
    int j = 10;
    int k = i + j;

    public  void show(){
        System.out.println(k);
    }
}


public class superi extends noo {
  public static void main(String[] args) {

 superi s = new superi();
 s.show();
 int k = 29;
 System.out.println(k +" is main class variable");
 s.sshow();

    }

    void sshow(){
        System.out.println(super.k+ " is super class variable");

    }
    
}

