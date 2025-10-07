def solution(s):
    arr = list(map(int, s.split()))
    sMin = min(arr)
    sMax = max(arr)
    return "{} {}".format(sMin, sMax)