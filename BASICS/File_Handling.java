package BASICS;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling {
    public static void main(String[] args) throws IOException {
        //Code to create a new file
        /*
        File myFile = new File("Harshit.txt");
        try {
            myFile.createNewFile();
        }
        catch (IOException e){
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
         */

        //Code to write to a file
        /*
        try {
            FileWriter fileWriter = new FileWriter("Harshit.txt");
            fileWriter.write("This is our first file of this java Course");
            fileWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
         */

        //Reading a file
        /*
        File myfile = new File("Harshit.txt");
        Scanner sc = new Scanner(myfile);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
         */

        File myfile = new File("Harshit.txt");

        if(myfile.delete()){
            System.out.println("I have deleted : " + myfile.getName());
        }
        else{
            System.out.println("Some problem occured while deleting the file");
        }


    }
}
