def solution(my_string):
    answer = []
    for i in my_string :
        if ord(i) < 63 :
            answer.append(int(i))
    answer.sort()
    return answer