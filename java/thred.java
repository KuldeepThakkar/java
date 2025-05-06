public class thred {
    public static void main (String [] args)
    {
        
        Thread t = new Thread();
        t.start();
        try{
            t.sleep(5000);
        for (int i=0; i<10;i++)
    {
        System.out.println(" "+i);

    }}
        catch(Exception e){
            System.out.println("Thread is not sleeping");
        }
        
    }
}
