def solution(myString):
    answer = myString.split("x")
    Newanswer=list(filter(None, answer))
    Newanswer.sort()
    return Newanswer