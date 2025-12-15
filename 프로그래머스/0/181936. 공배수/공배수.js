function solution(number, n, m) {
    return number % n == 0 && number % m == 0 ? 1 : 0
    
    // var answer = number%n==0 ? 1 : 0;
    // answer = number%m==0? 1 : 0;
    // return answer;
}