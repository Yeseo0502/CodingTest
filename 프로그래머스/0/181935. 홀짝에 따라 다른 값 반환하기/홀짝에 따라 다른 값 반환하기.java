class Solution {
    public int solution(int n) {
        int answer = 0;
        int check=0; //짝수면 0
        if(n%2==1){
            check=1; //홀수면 변경으로 1
        }
        for(int i=0; i<=n; i++){
            if(check==1){ //홀수
                if(i%2==1){
                    answer+=i;
                }
            }
            else if (i%2==0){
                answer+=i*i;
            }
        }
        return answer;
    }
}