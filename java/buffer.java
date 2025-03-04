public class buffer {
   public static void main(String[] args) {
       StringBuffer sd = new StringBuffer("i  do  not  know");
      sd.insert(2, " sertenly");
      sd.replace(10, 14, "knew");
      sd.delete(0, 1);
      System.out.println(" "+ sd);
   } 
}

 
