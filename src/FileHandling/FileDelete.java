package FileHandling;

import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        File file=new File("xyx.txt");
        if (file.delete()){
            System.out.println("I have deleted: "+file.getName());
        }else {
            System.out.println("some problem occured in deleting file");
        }
    }
}
