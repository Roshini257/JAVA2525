package src.main.java.Week2;

public class MinMax {

    int numbers[] = {40, 4, 87, 99, 1200, 60};
    int s = numbers[0];
    int l = numbers[0];

    public void sort()

    {

        for (int i = 0; i < numbers.length; i++){

            if(numbers[i]<s){
                s=numbers[i];

            }else if(numbers[i]>l){
                l=numbers[i];
            }

        }
        System.out.println("Smallest number is "+s);
        System.out.println("Larger number is "+l);

    }
}
