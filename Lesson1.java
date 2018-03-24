// Lesson 1 Binary Gap
// Find longest sequence of zeros in binary representation of an integer.

class Solution {
    public int solution(int N) {
        // Indicates the start of the first 1 in binary presentation
        boolean start = false;
        // Stroe the max length of 0 sequence
        int maxLength = 0;
        // The current length of 0 sequence
        int length = 0;
        
        // Could be deleted
        int n = N;
        while(n != 1) {
            if(n % 2 == 0 && start) {
                length ++;
            }
            if(n % 2 == 1 && !start){
                start = true;
            } else if (n % 2 == 1 && start) {
                if(maxLength < length) {
                    maxLength = length;
                }
                length = 0;
            }
            n = n/2;
        }
        // Check whether the last 0 sequece's length is larger than the ones before it
        if(maxLength < length) {
            maxLength = length;
        }
        return maxLength;
    }
}
