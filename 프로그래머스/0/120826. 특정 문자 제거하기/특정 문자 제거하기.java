class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        //Replace 함수는 자신이 바꾸고싶은 문자로 문자열을 치환시켜주는 기능을 합니다.
        answer = my_string.replace(letter, "");
        return answer;
    }
}