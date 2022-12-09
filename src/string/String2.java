package string;

public class String2 {
        public static void main(java.lang.String[] args) {

            java.lang.String str1 = new java.lang.String("Hello");
            java.lang.String str2 = "Hello";

            java.lang.String str3 = str1 + str2;
            System.out.println(str3);

            str1 = "23423";

            java.lang.String str4 = str2.substring(0, 3);

            System.out.println(str4);

            java.lang.String str5 = "Hel";

            System.out.println(str4.equals(str5));
            System.out.println(str4.equalsIgnoreCase(str5));

            System.out.println(str5.toLowerCase());
            int ch = str5.length();
            System.out.println(ch);

            java.lang.String[] str6 = {"Hiii", "World", "People"};
            System.out.println(str6[2]);

            System.out.println(args[0] + " " + args[1]);


        }
}
