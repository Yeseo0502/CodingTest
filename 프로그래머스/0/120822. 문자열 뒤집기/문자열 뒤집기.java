class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=my_string.length()-1; i>=0; i--){ //String 문자 길이만큼 & 음수나 0이 되면 종료 아니면 반복
            answer+=my_string.charAt(i);
            
        }
        return answer;
    }
}