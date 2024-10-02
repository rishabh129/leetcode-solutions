class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();

        HashMap<Integer, Integer> freq=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(freq.containsKey(nums[i])){
                freq.put(nums[i], freq.get(nums[i])+1);
            }
            else{
                freq.put(nums[i], 1);
            }
        }

        Set<Integer> keys=new HashSet<>();

        keys=freq.keySet();

        for(int key:keys){
            if(freq.get(key) > nums.length/3){
                ans.add(key);
            }
        }
        return ans;
    }
}