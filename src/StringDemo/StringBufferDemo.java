package StringDemo;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("Dhaval");     //16+string lenth
        System.out.println(stringBuffer.capacity());

        System.out.println(stringBuffer.append(" Dokhe"));
        System.out.println(stringBuffer.charAt(3));
        System.out.println(stringBuffer.delete(3,6));
        System.out.println(stringBuffer.deleteCharAt(3));
        System.out.println(stringBuffer.indexOf("l"));
        System.out.println(stringBuffer.lastIndexOf("e"));
    }
}
