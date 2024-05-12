class Solution {
    public int[] evenOddBit(int n) {
        int[] answer = new int[2]; // 0th index for even bits and 1st index for odd bits
        int mask=0, m=n;
        while(n!=0){
            if((n&1)==1){ // check if the last bit is 1
                if((mask&1)==0) // check if the mask is even
                    answer[0]++; // increment the even bit count
                else
                    answer[1]++; // increment the odd bit count
            }
            mask++; // increment the mask
            n=m>>mask; // right shift the number by mask
        }
        return answer;   
    }
}