package StringEasy;
public class replaceCharacter{
    public  static  void main(String[] args){
    String input = "banana";
    char charArray[] = input.toCharArray();
    int left =0;
    while (left<=charArray.length-1){
        if (charArray[left] == 'a'){
            charArray[left] = 'o';
            left++;
        }else{
            left++;
        }
    }
    System.out.print(charArray);


    }

}