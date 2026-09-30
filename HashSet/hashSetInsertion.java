package HashSet;

import java.util.HashMap;
import java.util.HashSet;

public class hashSetInsertion {
    public static void main(String[] args){
        HashSet<Integer> sets= new HashSet<>();
        sets.add(1);
        sets.add(2);
        sets.add(3);
        sets.add(1);
        System.out.println(sets);
    }
}

