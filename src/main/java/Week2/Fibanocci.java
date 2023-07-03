package src.main.java.Week2;

public class Fibanocci {

    int count=0;
    int n=10;
    int n1=0;
    int sum;
    int n2=1;


    public void fib(){

        while (count<n){
            sum=n1+n2;
            System.out.println(sum);
            n1=n2;
            n2=sum;


            count++;


        }
    }



}
