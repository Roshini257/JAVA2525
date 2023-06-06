package Week2.src;

public class Buzz {
//    int x;


    public void Fizz(){

        for(int i=0;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");

            }else if(i%5==0){
                System.out.println("Buzz");
            }else if(i%3==0){
                System.out.println("Fizz");

            }else{
                System.out.println(i);

            }
        }

    }

}
