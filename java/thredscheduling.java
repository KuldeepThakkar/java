
class mthred extends Thread{


public void run(){
    for(int i=1;i<=10;i++){
        System.out.println("count= "+i);
   
    try{
        mthred.sleep(500);
    }
    catch(Exception e){
        System.out.println("is interupted" );
    }
    System.out.println( "finished");
}
}
}


public  class thredscheduling {
    public static void main(String [] args){
        mthred th1 = new mthred();
        mthred th2 =new mthred();
        mthred th3 =new mthred();

    th1.start();
    th2.start();
    th3.start();

    try{
        th1.join();
        th2.join();
        th3.join();

    }
      catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All threads finished.");

    }
}