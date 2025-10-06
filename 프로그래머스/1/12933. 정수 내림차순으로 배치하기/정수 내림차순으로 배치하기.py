def solution(n):
    answer = ""
    bear = []
    for i in str(n) :
        bear.append(int(i))
    bear.sort(reverse=True)
    for i in bear :
        answer+=str(i)
    return int(answer)