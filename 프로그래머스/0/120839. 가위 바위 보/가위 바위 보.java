class Solution {
    public String solution(String rsp) {
        String answer = "";
        char r='2'; //가위    
        char s='0'; //바위
        char p='5'; //보자기
        for(int i=0; i<rsp.length(); i++){
            if (rsp.charAt(i) == r) { // rsp가위
                answer += s; // 바위
            }
            else if (rsp.charAt(i) == s) { // rsp바위
                answer += p; // 보자기
            }
            else if (rsp.charAt(i) == p) { // rsp보자기
                answer += r; // 가위
            }
        }
        return answer;
    }
}