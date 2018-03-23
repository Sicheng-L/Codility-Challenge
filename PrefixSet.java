// First attempt
import java.util.ArrayList;

// Make use of ArrayList methods to identify non-duplicates
// Take the last non-duplicate's index as the return value

class Solution {
    public int solution(int[] A) {
        int index = 0;
        ArrayList<Integer> notDup = new ArrayList<Integer>();
        for(int i = 0; i < A.length ; i ++) {
            if(!notDup.contains(A[i])) {
                notDup.add(A[i]);
                index = i;
            }
        }
        return index;
    }     
}
