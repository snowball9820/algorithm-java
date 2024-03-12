class Solution {
    public int solution(int n) {
    int answer = 0;
    int getSum;
 
    for(int i=1; i<=n; i++) {
      getSum = 0;
 
      for(int j=i; j<=n; j++) {
        getSum += j;
 
        if(getSum==n) {
          answer++;
          break;
 
          }else if (getSum > n) {
            break;
        }
            
      }
    }
 
    return answer;
  }
}