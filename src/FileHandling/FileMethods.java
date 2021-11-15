package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileMethods {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\Dhaval D\\IdeaProjects\\untitled\\src\\FileHandling\\test.txt");
        System.out.println(file.isFile());
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile());    //if file path is not found then it will give the ans of null.
        System.out.println(file.getCanonicalPath());    //if file path is not found then it  gives exception directly.
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
        System.out.println(file.isDirectory());
        System.out.println(file.getPath());

        File file1=new File("C:\\Users\\Dhaval D\\IdeaProjects\\untitled\\src\\FileHandling\\sample.txt");
        boolean flag=file1.createNewFile();
        System.out.println(flag);
        if (file1.createNewFile()){
            System.out.println("file created");
        }else {
            System.out.println("already exist");
        }

        boolean dir=new File("C:\\Users\\Dhaval D\\IdeaProjects\\untitled\\newDir").mkdir();
        System.out.println(dir);

        File file2=new File("C:\\Users\\Dhaval D\\IdeaProjects\\untitled\\newDir\\sample2.txt");
        boolean f=file2.createNewFile();
        System.out.println(f);

        System.out.println();
        File file3=new File("C:\\Users\\Dhaval D\\IdeaProjects\\untitled");
        String[] arr=file3.list();
        for (String ar:arr){
            System.out.println(ar);
        }


    }
}
