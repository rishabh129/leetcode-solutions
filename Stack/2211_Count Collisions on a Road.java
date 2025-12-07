class Solution {
    public int countCollisions(String directions) {
        Stack<Character> cars = new Stack<>();

        int n=directions.length();
        int count=0;

        for(int i=0;i<n;i++){
            
            char curr=directions.charAt(i);

            if(cars.isEmpty()){
                if(curr=='L')
                continue;
                cars.push(curr);
                continue;
            }
            
            char prev=cars.peek();
            if(curr=='L'){
                if(prev=='S'){
                    count++;
                }
                else if(prev=='R'){
                    cars.pop();
                    cars.push('S');
                    count+=2;
                }
                
            }
            else if(curr=='R'){
                cars.push(curr);
            }
            else{
                if(prev=='R'){
                    cars.pop();
                    count++;
                }
                cars.push(curr);
            }
        }

        while(!cars.isEmpty()){
            if(cars.peek()=='S'){
                cars.pop();
                while(!cars.isEmpty() && cars.peek()=='R'){
                    count++;
                    cars.pop();
                }
            }
            else
            cars.pop();
        }

        return count;
    }
}