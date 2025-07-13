def solution(myString):
    answer = ''
    for i in myString :
        if i in 'a' :
            answer+=i.upper()
        elif i in 'A' :
            answer+=i
        else :
             answer+=i.lower()
    return answer