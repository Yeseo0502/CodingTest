class Solution {
    public int solution(int n) {
        int answer = 2;
        //Math.sqrt는 double의 제곱근을 알려줌 double=16; Math.sqrt는 4임
        double a=Math.sqrt(n);
        if(a%1==0){
            answer=1;
        }
        return answer;
    }
}