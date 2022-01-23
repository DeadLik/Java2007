package lesson7;

import java.util.Arrays;
import java.util.Locale;

public class StringApp {

    public static void main(String[] args) {
        String str = "String";
        System.out.println(Arrays.toString(str.toCharArray()));

        String str2 = new String(str.toCharArray());


        //str += str.toUpperCase();

        str.toUpperCase(Locale.ROOT);

        System.out.println(str + " " + str.toUpperCase());

        System.out.println(str.startsWith("S"));

        System.out.println(str.contains("ing"));

        System.out.println(str.equalsIgnoreCase("STrIng"));

        System.out.println(str.equals("STrIng"));

        String stringUpper = "STrInG";
        System.out.println(str.equals(stringUpper));//false
        System.out.println(str.equalsIgnoreCase(stringUpper));//true

        //String s = 1 +" " + 2 + " smth else   "+ 3; - плохая оптимизация(но можно использовать)

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append(1).append(" ").append(2);

        String newString = stringBuilder.toString();

        System.out.println(newString);

    }

}
