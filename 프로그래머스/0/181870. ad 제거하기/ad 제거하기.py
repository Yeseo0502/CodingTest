def solution(strArr):
    answer = []
    for i in strArr :
        if "ad" in i :
            print(i)
        else : 
            answer.append(i)
    return answer