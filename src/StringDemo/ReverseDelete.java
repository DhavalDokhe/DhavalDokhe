package StringDemo;

public class ReverseDelete {
    public static void main(String[] args) {                 //use stringbuilder for this program

        String obj = "abbccde";
        StringBuffer stringBuffer = new StringBuffer(obj);

        //  stringBuilder.deleteCharAt(2);
        //  System.out.println(stringBuilder);

        for (int i = 0; i <= stringBuffer.length(); i++) {
            for (int j = i + 1; j < stringBuffer.length(); j++) {
                if (stringBuffer.charAt(i) == stringBuffer.charAt(j)) {
                    stringBuffer.deleteCharAt(i);
                }
            }
        }
        System.out.println(stringBuffer);
    }
}
