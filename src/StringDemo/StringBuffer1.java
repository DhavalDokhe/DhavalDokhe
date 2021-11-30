package StringDemo;

public class StringBuffer1 {
    public static void main(String[] args) {


        StringBuilder stringBuilder = new StringBuilder("pune");
        stringBuilder.append("city");
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer("pune");
        stringBuffer.append("city");
        System.out.println(stringBuffer);

        String str ="pune";
        str.concat("city");
        System.out.println(str);

    }
}
