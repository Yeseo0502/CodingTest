class Solution {
    public int solution(String binomial) {
        String[] parts = binomial.split(" "); // 공백 기준으로 나눔
        int a = Integer.parseInt(parts[0]);
        String op = parts[1];
        int b = Integer.parseInt(parts[2]);
        if (op.equals("+")) 
            return a+b;
        else if (op.equals("-"))
            return a-b;
        else 
            return a*b;
    }
}