import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        int len = my_string.length();
        String[] answer = new String[len];
        for(int i=0; i<answer.length; i++){
            answer[i]=my_string.substring(i);
            System.out.println(my_string.substring(i));
        }
        Arrays.sort(answer);
        return answer;
    }
}