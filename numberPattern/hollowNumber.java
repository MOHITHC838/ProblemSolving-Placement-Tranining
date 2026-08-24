package numberPattern;

public class hollowNumber {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<n;i++){
            int val =0;
            for(int j=1;j<i;j++){
                if(i<=n/2){
                    System.out.print(++val);
                }
                else if(j<=i){
                    System.out.print(--val);
                }else{
                    System.out.print(val);
                }
                
              
            }   
            System.out.println();
    }
}
}
