function solution(my_string) {
    var answer = '';
    const down=my_string.toLowerCase();
    let my_list=down.split('');
    my_list.sort();
    for(let i=0; i<my_list.length; i++){
        answer+=my_list[i];
    }
    return answer;
}