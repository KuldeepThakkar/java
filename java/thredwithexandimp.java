

public class thredwithexandimp {
    public static void main(String[] args) {

      
     one thre = new one();
     thre.start();
     two thre2 = new two();
     Thread t1= new Thread(thre2);
     t1.start();

    }
    }

    class one extends Thread
    {
        public void run() {
            for(int i=0;i<5;i++) {
                System.out.println("one");
                
                }

            }
        }

   class two implements Runnable
    {
        public void run() {
            for(int i=0;i<5;i++) {
                System.out.println("two");
            }        
        }
    }

