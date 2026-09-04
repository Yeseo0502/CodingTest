using System;

public class Solution {
    public int[] solution(int n) {
        int count = (n+1)/2;
        int[] answer = new int[count];
        int num =0;
        for(int i=1; i<=n; i++){
            if(i%2==1){
                answer[num]=i;
                num++;
            }
        }
        return answer;
    }
}