class Solution {
    public int[] solution(int[] num_list, int n) {
        int count=0;
        for(int i=0; i<num_list.length; i+=n) {
            count++;
        }
        int[] answer = new int[count];
        int answer_count=0;
        for(int i=0; i<num_list.length; i+=n) {
            answer[answer_count]=num_list[i];
            answer_count++;
        }
        return answer;
    }
}