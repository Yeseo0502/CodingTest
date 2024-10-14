class Solution {
    public int[] solution(int n, int[] numlist) {
        int countINDEX=0;
        int answer_index=0;
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n == 0){
                countINDEX ++;
            }
        }
        int[] answer = new int[countINDEX];
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n == 0){
                answer[answer_index]=numlist[i];
                answer_index ++;
            }
        }
        return answer;
    }
}