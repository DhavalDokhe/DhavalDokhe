package FileHandling;

import java.io.*;

public class NewFile {
    public static void main(String[] args) {

      //code to create file.
        /*
        File myfile = new File("abcd.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }

        //code to write the file
        try {
            FileWriter fileWriter=new FileWriter("abcd.txt");
            fileWriter.write("this is our first java  file \n okay now bye");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

         */

        //create to read file.

        try {
            FileReader fileReader=new FileReader("abcd.txt");
            int i=fileReader.read();
            while (i>0){
                System.out.print((char) i);
                i=fileReader.read();
            }fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}