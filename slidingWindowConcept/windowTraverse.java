package slidingWindowConcept;

public class windowTraverse {
    static void main() {

        String input1 = "helloworld";
        String target ="moj";
        int len=target.length();
        boolean isBool = true;


        for(int i=0;i<=(input1.length()-len);i++){
            String  output ="";
            for (int j=i;(j<len+i);j++){
                output +=input1.charAt(j);
            }
            if (output.equals(target)){
                System.out.print("Sub String");
                isBool = false;
            }
        }
        if (isBool){
            System.out.print("Not a subString");
        }

    }
}
