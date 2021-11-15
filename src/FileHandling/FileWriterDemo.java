package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter=new FileWriter("filewriterTest.txt");
            fileWriter.write("today is thursday");
            System.out.println("File write successfully");
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            FileReader fileReader=new FileReader("filewriterTest.txt");
            int i=fileReader.read();
            while (i>0){
                System.out.print((char) i);
                i=fileReader.read();
            }
            fileReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
