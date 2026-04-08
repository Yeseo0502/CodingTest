def solution(array):
    count = [0] * (max(array) + 1)

    for i in array:
        count[i] += 1

    max_count = max(count)

    if count.count(max_count) > 1:
        return -1

    return count.index(max_count)