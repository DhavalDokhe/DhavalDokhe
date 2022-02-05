package program;

public class LargestSmallestNo {
    public static void main(String[] args) {
        int a[]={22,66,77,555,999,7,-5};

        int largest=a[0];
        int smallest=a[0];

        for (int i=1;i<a.length;i++){
            if (a[i]>largest){
                largest=a[i];
            }
            else if (a[i]<smallest){
                smallest=a[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}
