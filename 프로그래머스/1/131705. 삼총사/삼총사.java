class Solution {
    public int solution(int[] number) {
        //[-2, 3, 0, 2, -5]
        //1,3,4번째 더하면 0/2,4,5번째 더하면 0 => 2 return
        //[-3, -2, -1, 0, 1, 2, 3]
        //(-3,0,3),(-2,0,2),(-1,0,1),(-2,-1,3),(-3,1,2) => 5 return
        
        int answer = 0;
        for(int i = 0; i<number.length; i++){
            for(int j = i+1; j<number.length; j++){
                for(int k = j+1; k<number.length; k++){
                    if(number[i]+number[j]+number[k] == 0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}