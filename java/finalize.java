public class finalize extends mi {
    public static void main(String[] args) {
        mi w= new mi();
        w.show();
        w=null;
        System.gc();
        
    }
    
}

 class mi{
    
    String s= "Hola";
    int e=12;
    public  void show(){
        System.out.println("Constructor"+ " "+ e  +s);
    }

}