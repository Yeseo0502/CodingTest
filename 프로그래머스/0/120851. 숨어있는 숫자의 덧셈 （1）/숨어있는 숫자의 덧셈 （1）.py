def solution(my_string):
    answer = 0
    for i in range(len(my_string)) : 
        if my_string[i] in '123456789' : 
            answer+=int(my_string[i])
        else :
            continue
    return answer