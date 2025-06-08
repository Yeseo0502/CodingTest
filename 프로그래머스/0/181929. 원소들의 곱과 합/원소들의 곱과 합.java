class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int pp=0;
        int x=1;
        for(int i=0; i<num_list.length; i++){
            pp+=num_list[i];
            x*=num_list[i];
        }
        if(pp*pp>x){
            answer+=1;
        }
        return answer;
    }
}