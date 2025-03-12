class Solution {
    public String solution(String my_string) {
        String answer="";
        char a='a';
        char e='e';
        char i='i';
        char o='o';
        char u='u';
        for(int j=0; j<my_string.length(); j++){
            char my=my_string.charAt(j); //나의 문자를 가져옴
            if(my !=a && my !=e && my !=i && my !=o && my !=u) {
                //만약 넣은 단어와 다르다면? 저장하기
                answer+=my;
            }
        }
        return answer;
    }
}