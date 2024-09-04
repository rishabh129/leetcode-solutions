class Solution {
    public int romanToInt(String s) {
        int sum=0;
        int len=s.length();
        for(int i=0;i<len;i++){

            char curr=s.charAt(i);

            if(curr=='I'){
                if(i<len-1 && s.charAt(i+1)=='V'){
                    sum+=4;
                    i++;
                }
                else if(i<len-1 && s.charAt(i+1)=='X'){
                    sum+=9;
                    i++;
                }
                else{
                    sum+=1;
                }
            }
            else if(curr=='V'){
                sum+=5;
            }
            else if(curr=='X'){
                if(i<len-1 && s.charAt(i+1)=='L'){
                    sum+=40;
                    i++;
                }
                else if(i<len-1 && s.charAt(i+1)=='C'){
                    sum+=90;
                    i++;
                }
                else{
                    sum+=10;
                }
            }
            else if(curr=='L'){
                sum+=50;
            }
            else if(curr=='C'){
                if(i<len-1 && s.charAt(i+1)=='D'){
                    sum+=400;
                    i++;
                }
                else if(i<len-1 && s.charAt(i+1)=='M'){
                    sum+=900;
                    i++;
                }
                else{
                    sum+=100;
                }
            }
            else if(curr=='D'){
                sum+=500;
            }
            else{
                sum+=1000;
            }

        }
        return sum;
    }
}