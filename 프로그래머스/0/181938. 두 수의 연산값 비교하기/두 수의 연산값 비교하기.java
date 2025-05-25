class Solution {
    public int solution(int a, int b) {
        int answer = 2*a*b;
        int pp=Integer.parseInt(""+a+b);
        if(answer>pp)
            return answer;
        else
            return pp;
    }
}