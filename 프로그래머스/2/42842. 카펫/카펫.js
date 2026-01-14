function solution(brown, yellow) {
    var answer = []; //"가로" or "세로" but 가로가 더 길어야함. 아니면 같거나
    let pp = brown+yellow;
    for(let i = pp; i >= 3; i--){
        if(pp%i==0 && (i-2)*((pp/i)-2)==yellow){
            answer.push(i);
            answer.push(pp/i);
            return answer;
        }
    }
}