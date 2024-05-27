import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicateinarray {
    public static void main(String[] args) {
        int[] a = { 1, 3, 2, 3, 4, 6, 4, 7, 8 };
        // Map<Integer> hm= new HashMap<> ();
        // for(int no:a){
        // Integer count = hm.get(no);
        // if(count == null){
        // hm.put(no,1);
        // }
        // else {
        // count=count+1;
        // hm.put(no,count);
        // }
        // }
        // Set<Map.Entry<Integer,Integer>> es=hm.entryset();
        // for(Map.Entry<Integer,Integer> me:es){
        // if(me.getValue() >= 2){
        // System.out.println(me.getKey());
        // }
        // }

        Set<Integer> s = new HashSet<>();
        for (int no : a) {
            boolean n = s.add(no);
            if (n == false) {
                System.out.print(no + " ");
            }
        }

    }
}
