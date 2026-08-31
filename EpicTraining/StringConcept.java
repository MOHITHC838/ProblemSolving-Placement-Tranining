package EpicTraining;

public class StringConcept {
    static void main() {
//        100 same memory addres both
        String str1 =  "hello";
        String str2 =  "hello";
        System.out.println(str1 == str2);

//        200
        String str3 = new String("hello");
//        300 different memory address
        String str4 = new String("hello");

        System.out.println(str3 == str4);

    }
}
