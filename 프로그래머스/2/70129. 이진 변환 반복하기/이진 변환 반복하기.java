class Solution {
    public int[] solution(String s) {
        //이진변환 횟수와 제거된 0의 개수를 구해야함
        //문자열이 1이 될 때까지 반복문
        //문자열에 있는 0을 ""로 바꿔서 저장
        //입력 받은 문자열 길이에서 text 길이를 뺀 후 0의 개수 누적 계산
        //text 길이를 이진수로 바꿔서 저장
        //반복문을 돌 때 마다 이진변환 횟수 1증가
        //이진변환 횟수와 제거된 0의 개수 return
        int[] answer = {};
        int cnt = 0;
        int cntZero = 0;
        String binary="";
        
        while(!s.equals("1")){
            String text = s.replace("0","");
            
            cntZero+=s.length()-text.length();
            int txtLen = text.length();
            
            binary = Integer.toBinaryString(txtLen);
            s=binary;
            cnt++;
        }
        
        answer=new int[]{cnt,cntZero};
        return answer;
    }
}

//1.replace()
//패턴이 일치하는 일부 or 모든 부분이 교체된 새로운 문자열 반환
//2.s 문자열 안에 있는 0의 개수
//s문자열안에 포함된 0을 ""로 대체
//s문자열 길이에서 0을 모두 제거한 문자열 길이를 빼면 s문자열 안에 들어있는 0의 개수가 나옴