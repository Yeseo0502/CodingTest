function solution(n) {
    let str_n = String(n).split("");
    var answer = [];
    for(let i = str_n.length-1; i>=0; i--){
        answer.push(Number(str_n[i]));
    }
    return answer;
}