class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length(); i++){
            char ch = myString.charAt(i);
            if(ch<108)
                answer+="l";
            else
                answer+=myString.charAt(i);
        }
        return answer;
    }
}