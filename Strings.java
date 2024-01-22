// import java.util.*;

public class Strings {
    // // String declaration
    // String name = "Arif Ali";
    // String fullName = "SRK";
    // String sentence = "My name is Arif Ali";
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is:" + name);
        // sc.close();

        // // Concatenation
        // String firstName = "Tony";
        // String lastName = "Stark";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.length());

        // // charAt(index)
        // for (int i = 0; i < fullName.length(); i++) {
        // System.out.println(fullName.charAt(i));
        // }

        // // compare strings (compares each character from both strings)
        // // Note: pehla unequal character ka ASCII value check kiya jaata hai
        // // 3 cases:
        // // 1. s1 > s2 --> returns a positive value
        // // 2. s1 == s2 --> returns 0
        // // 3. s1 < s2 --> returns a negative value
        // String name1 = "Tony";
        // String name2 = "Tony";
        // if (name1.compareTo(name2) == 0) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }
        // // Remember not to use '==' at the time of comparison because it gets failed
        // in
        // // most of the cases
        // if (name1 == name2) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }
        // if (new String("Arif") == new String("Arif")) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        // // subString
        // String sentence1 = "I am not a Terrorist";
        // // substring(beg index, end index);
        // // ending index is non-inclusive
        // String name1 = sentence1.substring(11, sentence1.length());
        // System.out.println(name1);
        // String sentence2 = "I am not a Terrorist";
        // String name2 = sentence2.substring(0,2);
        // System.out.println(name2);
        // String name3 = sentence2.substring(3);
        // System.out.println(name3);

        // StringBuilder
        StringBuilder sb = new StringBuilder("Arif");
        System.out.println(sb);

        // char at index 2
        System.out.println(sb.charAt(2));

        // set char at index 0 with 'x'
        sb.setCharAt(2, 'o');
        System.out.println(sb);

        // insert a character at a speific index and shifting all the characters at the
        // right side
        sb.insert(0, 'w');
        System.out.println(sb);

        // delete a character from a range
        sb.delete(1, 3);
        System.out.println(sb);

        // append
        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append("d");
        System.out.println(sb);

        // length of the string
        System.out.println(sb.length());
        // sc.close();
    }
}