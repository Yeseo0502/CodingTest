def solution(my_string):
    answer = []
    my_string=list(my_string)
    my_string.reverse()
    my_string2=''.join(my_string)
    print(my_string2)

    answer.append(my_string[0])
    for i in range(0, len(my_string)-1):
        answer.append(my_string[i+1]+answer[i])
    answer.sort()
    return answer