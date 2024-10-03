class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length]; //strlist와 같은 배열 길이 설정
        for(int i=0; i<strlist.length; i++){
            answer[i]=strlist[i].length(); //현재 문자열의 길이를 answer 배열의 해당 인덱스에 저장
        }
        return answer;
    }
}