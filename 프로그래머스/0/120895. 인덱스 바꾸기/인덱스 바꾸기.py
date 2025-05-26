def solution(my_string, num1, num2):
    answer = []
    for i in my_string :
        answer.append(i)
    answer[num1]=my_string[num2];
    answer[num2]=my_string[num1];
    return ''.join(answer)