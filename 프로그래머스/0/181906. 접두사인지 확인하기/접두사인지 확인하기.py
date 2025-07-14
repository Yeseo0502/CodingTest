def solution(my_string, is_prefix):
    jub = ["b","ba","ban","bana","banan","banana"]
    answer = 0
    # for i in jub :
    #     if is_prefix == i :
    #         if my_string[0] == is_prefix[0] :
    #             answer+=1
    #             break
    for i in range(1, len(my_string)+1):
        if my_string[:i] == is_prefix:
            answer=1
            break
    return answer   