// Second Attempt

// Use a large array to store if a certain value has occured or not
// (The value itself is the index of the occured value in this boolean array)
// It is feasible because we already know that the number will not be bigger than 1,000,000

class Solution {
    public int solution(int[] A) {
        int index = 0;
        boolean[] occur = new boolean[1000000];
        for(int i = 0; i < A.length; i++) {
            if(!occur[A[i]]) {
                occur[A[i]] = true;
                index = i;
            }
        }
        return index;
    }
}

//Detected time complexity: O(N) or O(N*log(N))
