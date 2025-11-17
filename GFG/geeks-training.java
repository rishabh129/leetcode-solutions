//Ninja's training;

//Recursion - TLE
// User function Template for Java

class Solution {
    
    int f(int day, int last, int[][] task){
        if(day==0){
            int maxi=0;
            for(int i=0;i<=2;i++){
                if(i!=last)
                maxi=Math.max(maxi, task[0][i]);
            }
            return maxi;
        }
        
        int maxi=0;
        for(int i=0;i<=2;i++){
            if(i!=last){
                int point=task[day][i]+f(day-1, i, task);
                maxi=Math.max(maxi, point);
            }
        }
        return maxi;
    }
    
    public int maximumPoints(int arr[][]) {
        return f(arr.length-1, 3, arr);
        
    }
}