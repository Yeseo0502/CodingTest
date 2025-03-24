function solution(my_string) {
    word=my_string.split('');
    for(let i=0; i<word.length; i++){
        if(word[i]>='A' && word[i]<='Z'){
            word[i]=String.fromCharCode(word[i].charCodeAt(0)+32);
        }
        else if(word[i]>='a' && word[i]<='z'){
            word[i]=String.fromCharCode(word[i].charCodeAt(0)-32);
        }
    }
    let answer = word.join(''); // 배열을 다시 문자열로 변환
    return answer;
}