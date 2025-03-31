function solution(n) {
    let count=0;
    let array=0;
    for(let i=1; i<=n; i++){
        if(n%i==0){
            count++;
        }
    }
    var answer = [count];
    for(let i=1; i<=n; i++){
        if(n%i==0){
            answer[array]=i;
            array++;
        }
    }
    return answer;
}