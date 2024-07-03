class Solution {
    public int minDifference(int[] nums) {
        if(nums.length <= 4){
            return 0;
        }

        Arrays.sort(nums);

        Deque<Integer> q = new LinkedList<>();
        
        for(int i=0;i<nums.length;i++){
            q.addLast(nums[i]);
        }

        int temp[] = new int[3];
        for(int i=0;i<3;i++){
            temp[i]=q.removeLast();
        }

        int minD=q.getLast() - q.getFirst();

        for(int i=2;i<3;i++){
            q.addLast(temp[i]);
            temp[i] = q.removeFirst(); 
        }

        if(q.getLast() - q.getFirst() >= 0)
        minD = Math.min(minD, q.getLast() - q.getFirst());

        for(int i=1;i<2;i++){
            q.addLast(temp[i]);
            temp[i] = q.removeFirst(); 
        }

        if(q.getLast() - q.getFirst() >= 0)
        minD = Math.min(minD, q.getLast() - q.getFirst());

        for(int i=0;i<1;i++){
            q.addLast(temp[i]);
            temp[i] = q.removeFirst(); 
        }

        if(q.getLast() - q.getFirst() >= 0)
        minD = Math.min(minD, q.getLast() - q.getFirst());

        return minD;
    }
}