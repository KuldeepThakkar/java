
import java.util.Enumeration;

import java.util.Vector;
import javax.xml.validation.Validator;
class arr<T>  {

public static <T> void  printarr(T[] array) {
    Vector<T> v = new Vector<>();
    for(T elemnet : array ){
    v.add(elemnet);
    }

       Enumeration<T> enu = v.elements();
    while (enu.hasMoreElements()) {
        System.out.println( enu.nextElement());;
        
    }
}
}



public class genmethod {
    public static void main(String[] args) {
        String[] sr = {"i am","not ","giving up"};
       arr. printarr(sr);

       Integer[] ee ={1,2,3,4,6};
       arr.printarr(ee);
    }
   
}
