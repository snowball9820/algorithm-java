class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown + yellow;
        
         for (int row = 3; row < area; row++){//가로 세로 최소 3 이상
            int col = area/row; // 세로는 넓이/가로
            
            if (col >= 3 && area % row == 0){
                if(row>col){
                    break; //가로가 세로보다 길어야 함
                }
                if((row-2)*(col-2)==yellow){
                    answer[0]=col;
                    answer[1]=row;
                    return answer;
                }
            }
        }
        
        return answer;
    }
}