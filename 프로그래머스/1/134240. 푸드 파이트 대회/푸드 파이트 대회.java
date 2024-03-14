class Solution {
    public String solution(int[] food) {
        //칼로리가 낮은 음식부터 차례로
        //좌우 대칭으로 (음식 수/2)로 배치
        //foodL에 food[0]을 제외하고 food[1]부터 food 배열의 값을 2로 나눈 몫만큼 반복, foodL에 food[i] 대입
        //foodR은 반대로
        //물은 0번째에 있고, 출력값 중앙에 배치
        
        String answer = "";
        String foodL="";
        String foodR="";
        
        for(int i=1; i<food.length; i++){
            int l=(food[i]/2);
            
            for(int j=1; j<=l; j++){
                foodL=foodL+Integer.toString(i);
            }
        }
        
        for(int i=food.length-1; i>=1; i--){
            int r=(food[i]/2);
            
            for(int j=r; j>=1; j--){
                foodR=foodR+Integer.toString(i);
            }
        }
        answer=foodL+"0"+foodR;
        return answer;
    }
}