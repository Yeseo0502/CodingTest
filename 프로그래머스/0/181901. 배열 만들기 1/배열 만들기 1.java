class Solution {
    public int[] solution(int n, int k) {
        int count=0;
        int answer_count=0;
        for(int i=1; i<=n; i++){
            if(i%k==0){
                answer_count++;
            }
        }
        int[] answer = new int[answer_count];
        for(int i=1; i<=n; i++){
            if(i%k==0){
                answer[count]=i;
                count++;
            }
        }
        return answer;
    }
}