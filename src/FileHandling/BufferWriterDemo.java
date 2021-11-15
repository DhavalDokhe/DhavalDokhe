package FileHandling;

import java.io.*;

public class BufferWriterDemo {
    public static void main(String[] args) {
        try{
            FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\Dhaval D\\IdeaProjects\\untitled\\src\\FileHandling\\BufferWriterDemo.javaBufferDemo.txt");
            BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);

            String str="i am in pune";
            byte[] arr=str.getBytes();
            bufferedOutputStream.write(arr);
            System.out.println("File Write successfully");

            bufferedOutputStream.close();;
            fileOutputStream.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        try {
            FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Dhaval D\\IdeaProjects\\untitled\\src\\FileHandling\\BufferDemo.txt");
            BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);

            int i=fileInputStream.read();
            while (i>0){
                System.out.print((char) i);
                i=fileInputStream.read();
            }bufferedInputStream.close();
            fileInputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
