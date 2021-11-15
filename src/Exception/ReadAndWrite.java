package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite
{
    File file=new File("C:\\Users\\Dhaval D\\IdeaProjects\\untitled\\src\\Exception\\xyz.txt");
  void readFile() throws FileNotFoundException
          {
      FileInputStream fileInputStream=new FileInputStream(file);
  }
  void WriteFile() throws FileNotFoundException
  {
      FileOutputStream fos=new FileOutputStream(file);
  }

    public static void main(String[] args)
    {
        ReadAndWrite rw=new ReadAndWrite();
       try {
           rw.readFile();
       }catch (FileNotFoundException e)
       {
           e.printStackTrace();
       }
       try {
           rw.WriteFile();
       }catch (FileNotFoundException e){
           e.printStackTrace();
       }
        System.out.println("hello");

    }
}
