package EliteTrainningTasks;

public class copySting {
    static void main() {
        String input  = "hello";
        String output = "";
        for (int i=0;i<input.length();i++){
            output +=input.charAt(i);
        }
        System.out.print(output);
    }
}
