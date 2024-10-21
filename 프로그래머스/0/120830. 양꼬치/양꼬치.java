class Solution {
    public int solution(int n, int k) {
        double count=n/10;
        int answer = (int)count*2000;
        System.out.print(count+" "+answer);
        return (n*12000)+(k*2000)-answer;
    }
}