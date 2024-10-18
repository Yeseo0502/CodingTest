class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int c=5500;
        int su=money;
        int buy=0;
        while(su>=c){
            su-=c;
            buy++;
        }
        answer[0]=buy;
        answer[1]=su;
        return answer;
    }
}