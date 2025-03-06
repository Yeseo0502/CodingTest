class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int one=0;//x좌표
        int two=0;//y좌표
        if(dot[0]>answer){
            one++;
        }
        if(dot[1]>answer){
            two++;
        }
        if(one==1 && two==1){
            //1사분면
            answer=1;
        }
        else if(one==0 && two==1){
            //2사분면
            answer=2;
        }
        else if(one==0 && two==0){
            //3사분면
            answer=3;
        }
        else if(one==1 && two==0){
            //4
            answer=4;
        }
        return answer;
    }
}