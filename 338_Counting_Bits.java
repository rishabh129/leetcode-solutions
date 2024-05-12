// solution 1

class Solution {
    public int[] countBits(int n) {
        int[] countOnes = new int[n+1];
        int count=0;
        countOnes[0]=0;
        for(int i=1;i<=n;i++){
            int curr=i;
            while(curr!=0){ // counting the number of 1's in the binary representation of the number for each number
                if((curr&1) == 1){
                    count++;
                }
                curr=curr>>1;
            }
            countOnes[i]=count;
            count=0;
        }
        return countOnes;
    }
}

// solution 2

class Solution {
    public int[] countBits(int n) {
        int[] countOnes = new int[n+1];
        
        for(int i=1;i<=n;i++){
            countOnes[i] = countOnes[i>>1] + (i&1); // retrieving the count of 1's from the previous number and adding the last bit of the current number
        }
        return countOnes;
    }
}