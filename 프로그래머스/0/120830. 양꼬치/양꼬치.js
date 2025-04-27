function solution(n, k) {
    let count = parseInt(n/10);
    var answer = count*2000;
    return (n*12000)+(k*2000)-answer;
}