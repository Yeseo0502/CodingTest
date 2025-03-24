class Solution {
    public String solution(String my_string) {
        char[] UpDown=my_string.toCharArray();
        for(int i=0; i<UpDown.length; i++){
            if(UpDown[i]>=65 && UpDown[i]<=90){//대문자라면? UpDown[i]>='A' UpDown[i]<='Z'작성도 가능
                UpDown[i]=(char)(UpDown[i]+32); //소문자로 변환
            }
            else if(UpDown[i]>=97  && UpDown[i]<=122){ //소문자라면? UpDown>='a' &&  UpDown[i]<='z'
                UpDown[i]=(char)(UpDown[i]-32);
            }
        }
        String answer = String.valueOf(UpDown);
        return answer;
    }
}