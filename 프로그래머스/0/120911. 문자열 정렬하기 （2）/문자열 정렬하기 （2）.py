def solution(my_string):
    down=my_string.lower()
    my_list = list(down)
    my_list.sort()
    answer=""
    for i in my_list :
        answer+=i
    return answer