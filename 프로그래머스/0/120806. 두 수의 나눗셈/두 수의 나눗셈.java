class Solution {
    public int solution(int num1, int num2) {
        double answer =(double) num1/num2;
        System.out.print(answer);
        answer*=1000;
        return (int)answer;
    }
}