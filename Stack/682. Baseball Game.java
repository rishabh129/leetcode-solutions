class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> score = new Stack<>();

        for(int i=0;i<operations.length;i++){

            if(operations[i].equals("C")){
                score.pop();
            }
            else if(operations[i].equals("D")){
                score.push(score.peek() * 2);
            }
            else if(operations[i].equals("+")){
                int temp = score.pop();
                int top = score.peek();
                score.push(temp);
                score.push(temp+top);
            }
            else{
                score.push(Integer.parseInt(operations[i]));
            }

        }

        int sum = 0;

        while(!score.isEmpty()){
            sum+=score.pop();
        }
        return sum;
    }
}