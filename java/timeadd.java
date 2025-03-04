import java.util.Scanner;
class time{
    int m,hr,sec;
  
  void getdata(){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter time hr= ");
    hr= sc.nextInt();
    System.out.println("enter time min= ");
    m= sc.nextInt();
    System.out.println("enter time second= ");
    sec= sc.nextInt();
  
  }

  void display(){
    System.out.println("time is "+m+"hr "+hr+"min "+sec+"sec");
  }

time add(time t1){
    int totalSec = (hr * 3600 + m * 60 + sec) + (t1.hr * 3600 + t1.m * 60 + t1.sec);
    int totalHr = totalSec / 3600;
    int remainingSec = totalSec % 3600;
    int totalMin = remainingSec / 60;
    int remainingSec1 = remainingSec % 60;
    hr = totalHr;
    m = totalMin;
    sec = remainingSec1;
    return this;
}
     



 }
 
 public class timeadd{
public static void main(String[] args) {
    time t1, t2,t3;
    
    t1 = new time();
    t2 = new time();
    t3= new time();
    t1.getdata();
    t2.getdata();
    t1.display();
    t2.display();

    t3=t1.add(t2);
    t3.display();

}

}