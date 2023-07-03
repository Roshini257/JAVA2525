package src.main.java.Week3;

public class Numberthread extends Thread{
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.print(" "+i);
        }
       // System.out.println("This code is running in a thread");
    }
}
