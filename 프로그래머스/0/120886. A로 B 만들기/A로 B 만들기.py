def solution(before, after):
    answer = 1
    hiLen = list(after)
    for i in before :
        if i in hiLen :
            hiLen.remove(i)
    if len(hiLen)>0 :
        answer = 0
    return answer