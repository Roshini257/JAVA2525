package Week3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class custom extends Exception {


    public custom(String msg) {
        super(msg);

    }


    public String test1(String fileName) throws custom {

        try (Scanner file = new Scanner(new File(fileName))) {
            if (file.hasNextLine())
                return file.nextLine();
        } catch (FileNotFoundException e) {
            if (isCorrectFileName(fileName)) {
                throw new custom("Incorrect filename : " + fileName);
            }
            //...

        }
        return null;


    }


    private boolean isCorrectFileName(String fileName) {
        // Logic to determine if the file name is correct
        return true;
    }
}


