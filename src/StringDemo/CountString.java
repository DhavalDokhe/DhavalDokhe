package StringDemo;
//count the number of charecter occurance
public class CountString {
    public static void main(String[] args) {
        //String str="dhaval";
        String str ="my name is dhaval";
        char c='a';
        int count =0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==c){
                count++;
            }
        System.out.println("a is count in "+count+ " times");
    }}
}
