package Week2.src;

public class Vowels {

    String s ="hello this is java";
    int len=s.length();
    int count=0;

    public void vow(){
        for(int i=0; i<len;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){

            count++;
        }


        }

        System.out.println("Number:" +count);

    }
}
