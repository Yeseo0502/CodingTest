def solution(number):
    answer = 0
    pp=0
    for i in range(len(number)) :
        pp+=int(number[i])
    answer=int(pp%9)
    return answer