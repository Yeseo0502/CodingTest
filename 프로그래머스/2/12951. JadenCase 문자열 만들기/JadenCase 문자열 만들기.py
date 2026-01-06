def solution(s):
    answer = list(s.lower())
    answer[0] = answer[0].upper()
    for i in range(len(answer)-1) :
        if answer[i]==' ' :
            answer[i+1]=answer[i+1].upper()
    return ''.join(answer)