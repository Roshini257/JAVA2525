package src.main.java.Week2;

public class Rotation {


        int[] rotate(int array[],int position){
            int n=array.length;
            int b[]=new int[position];
            for(int i=0;i<position;i++){
                b[i]=array[i];
            }
            for(int i=0;i<(n-position);i++){
                array[i]=array[position+i];
            }
            for(int i=n-position;i<n;i++){
                array[i]=b[i-(n-position)];
            }
            return array;

        }

    }



