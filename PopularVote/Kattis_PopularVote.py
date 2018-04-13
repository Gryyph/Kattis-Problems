cases = int(input())
overall_case_count =0
result_string = ""
while overall_case_count < cases:
    total=0
    test_cases = int(input())
    overall_test_case_count = 0
    a = []
    while overall_test_case_count < test_cases:
        a.append(int(input()))
        overall_test_case_count += 1

    total = sum(a)
    total = total / 2
    max_num = max(a)
    min_num = min(a)
    if max_num == min_num:
        result_string += "no winner\n"
    elif a.count(max_num) > 1:
        result_string += "no winner\n"
    elif max_num > total:
        result_string = result_string + "majority winner " + str(a.index(max_num)+1)+ "\n"
    elif max_num <= total:
        result_string = result_string + "minority winner "+ str(a.index(max_num)+1)+ "\n"

    overall_case_count += 1
print(result_string)