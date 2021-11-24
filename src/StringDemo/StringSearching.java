package StringDemo;

public class StringSearching {
    public static void main(String[] args) {
        String s="deepak";                            //searching methods

        System.out.println(s.indexOf("e"));    //1   //indexoff method  counting from start .give answer in integer
        System.out.println(s.lastIndexOf("e"));  //2   //lastindexoff method  counting from last give ans in integer
        System.out.println(s.charAt(4));            // charAt() method
        System.out.println(s.contains("e"));        //contains method gives answer in boolean /true or false
        System.out.println(s.startsWith("d"));      //startwith method gives aswer in boolean
        System.out.println(s.endsWith("f"));
     }
}
