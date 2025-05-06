


 interface   one {
  int a=2;
  int b= 20;
   
  void valuesin1();


}

 interface  two {

    int c =12;
    int d=90;

    void Valuesin2();
}


 class three implements one,two{
    public void valuesin1() {
        System.out.println("values in one interface are a= "+a+" b= "+b);
        
    }

    @Override
    public void Valuesin2() {
    
        System.out.println("values in two interface are c= "+c+" d= "+d);
    }
}


public class exam extends three {

   
    public static void main(String[] args) {

       three r= new three();
       r.valuesin1();
       r.Valuesin2();
      
            
        System.out.println("a from one=  "+one.a);
        System.out.println("b from one=  "+one.b);
        

        
        
            System.out.println("c from two=  "+two.c);
            System.out.println("d from two=  "+two.d);

        
   
}
}
