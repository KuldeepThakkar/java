class box<T>{
    private T item;

    public void setitem(T item){
        this.item=item;
    }

    public T getitem(){
 return item;
    }

 
}

public class jenricclass {
    public static void main(String[] args) {
        box<String> sb  =new box<>();
        sb.setitem("weeeee");
        System.out.println(sb.getitem());
    box<Integer> in =new box<>();
        in.setitem(12);
        System.out.println(in.getitem());

     

      
    }

}
