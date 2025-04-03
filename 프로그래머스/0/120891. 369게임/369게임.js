function solution(order) {
    var answer = 0;
    var str = order.toString();  // 숫자를 문자열로 변환
    for (var i = 0; i < str.length; i++) {
        var digit = parseInt(str[i]);  // 각 자릿수를 숫자로 변환
        if (digit === 3 || digit === 6 || digit === 9) {
            answer++;
        }
    }
    return answer;
}