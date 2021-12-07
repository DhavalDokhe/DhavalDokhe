package Collection;

public class TreeSet {
    public static void main(String[] args) {
        java.util.TreeSet<String> treeSet=new java.util.TreeSet<>();
        treeSet.add("pune");
        treeSet.add("nashik");
        treeSet.add("mumbai");
        treeSet.add("nagpur");

        System.out.println(treeSet.floor("mumbai"));
    }
}
