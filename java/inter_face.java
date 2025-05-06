public class inter_face {
    public static void main(String[] args) {
        tri q= new tri();
        q.area();
        q.draw();
    }
}
 interface shape{
    
    int i= 10; // is public static final by default
    void draw(); // is public abstract by default
    void area();
}

class  tri implements shape{
    public void draw(){
        System.out.println("Drawing a triangle");
        }
        public void area(){
            System.out.println("Area of circle=" + (Math.PI*i*i));
        }
}