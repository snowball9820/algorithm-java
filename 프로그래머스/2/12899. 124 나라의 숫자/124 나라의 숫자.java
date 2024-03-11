class Solution {
    public String solution(int n) {
       
        //n=7이면...
        //7%3=1 answer=num[1]+""="1"
        //n=7/3=2 2%3=2 answer=num[2]+"1"="21"
        
        //n=9라면
        //9%3=0 answer=num[0]+""="4" 나머지가 0이면 n-1 (9-1=8)
        //n=8/3=2 2%3=2 answer=num[2]+"4"="24"
        String answer = "";
        String numbers[]={"4","1","2"};
        
        while(n>0){
            int num=n%3;
            
            if(num==0){
                n--;
            }
            answer=numbers[num]+answer;
            n/=3;
        }
        
        return answer;
    }
}