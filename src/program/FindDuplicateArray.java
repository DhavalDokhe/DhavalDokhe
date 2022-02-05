package program;

public class FindDuplicateArray {
    //find the duplicate element in array

    public static void main(String[] args) {
        String a[]={"java","javascript","python","java"};

        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i].equals(a[j])){
                    System.out.println("duplicate elements is "+a[i]);
                }
            }
        }
    }
}
