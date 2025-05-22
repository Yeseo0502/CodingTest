class Solution {
    public String solution(String str1, String str2) {
        String[] one=str1.split("");
        String[] two=str2.split("");
        String answer = "";
        for(int i=0; i<one.length; i++){
            answer+=one[i]+two[i];
        }
        return answer;
    }
}