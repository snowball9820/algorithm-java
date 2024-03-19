class Solution {
    public String solution(String s) {
        //단어(공백을 기준)별로 짝/홀수 인덱스를 판단
        //첫 번째 글자는 0번째 인덱스로 보고 짝수 알파벳 처리
        //for문 안에 charAt함수 사용
        //ch가 공백이면 cnt를 0으로 초기화
        //cnt%2의 나머지가 0이면 짝수 -> 대문자
        //answer는 String.valueOf 함수 사용 Char->String
        //cnt ++
        //홀수면 소문자로 바꾸기
       String answer = "";
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
           char ch = s.charAt(i);
            if(ch == ' '){
                answer += " ";
                cnt = 0;
                continue;
            }
            if((cnt%2) == 0){
                answer += String.valueOf(Character.toUpperCase(ch));
                cnt++;
            }else{
                answer += String.valueOf(Character.toLowerCase(ch));
                cnt++;
            }
        }
        return answer;
    }
}