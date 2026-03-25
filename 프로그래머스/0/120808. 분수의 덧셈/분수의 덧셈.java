class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int one = (numer1*denom2) + (numer2*denom1);    //분자
        int two = denom1*denom2; //분모를 공통으로 처리 //8
        int suu = suu(one,two); //14  8
        //기약분수 (끝까지 나눈다.)
        answer[0] = one/suu;
        answer[1] = two/suu;
        return answer;
    }
    public int suu(int a,int b){ //14 8
        while(b!=0){
            int temp = a%b; //10
            a=b; //10
            b=temp; 
        }
        return a;
    }
}