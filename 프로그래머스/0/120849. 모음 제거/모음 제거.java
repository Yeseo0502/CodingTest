class Solution {
    public String solution(String my_string) {
        char my='\0';
        my=my_string.charAt(0);
        char a='a';
        char e='e';
        char i='i';
        char o='o';
        char u='u';
        my=a-e-i-o-u;
        String answer =String.valueOf(my);;
        return answer;
    }
}