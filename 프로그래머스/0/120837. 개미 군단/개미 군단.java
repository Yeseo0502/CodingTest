class Solution {
    public int solution(int hp) {
        int answer = 0;
        //장군개미 5공격
        //병정개미 3공격
        //일개미 1공격
        //최소한의 병력 구성.
        
        while(hp>0){
            if(hp>=5){ //장군
                hp-=5;
                answer++;
            }
            else if(hp>=3){
                hp-=3;
                answer++;
            }
            else {
                hp-=1;
                answer++;
            }
        }
        return answer;
    }
}