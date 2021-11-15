package FileHandling;

import java.io.*;

public class FileBufferWriter {
    public static void main(String[] args) {
        try {
        FileWriter    fileWriter = new FileWriter("FBWriter.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

            bufferedWriter.write("my name is dhaval");
            System.out.println("file write successfully");

            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader=new FileReader("FBWriter.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);

            int i=bufferedReader.read();
            while (i>0){
                System.out.print((char) i);
                i=bufferedReader.read();
            }
            bufferedReader.close();
            fileReader.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
