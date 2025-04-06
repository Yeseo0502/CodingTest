def solution(s1, s2):
    answer = 0
    for i in s1:
        for j in s2:
            if (i==j) : #문자열은 ==를 사용해도 된다!
                answer+=1
                print(i)
    return answer