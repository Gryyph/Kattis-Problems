cases = int(input())
case_number = 0
while case_number < cases:
    output = 0
    problem_input = int(input())
    if problem_input == 0 or problem_input == 100 or problem_input == 1000 or problem_input == 10000 or problem_input == 100000:
        output = 0
    elif problem_input % 10000 == 0:
        output = problem_input - 10000
    elif problem_input % 1000 == 0:
        output = problem_input - 1000
    elif problem_input % 100 == 0:
        output = problem_input - 100
    elif problem_input % 10 == 0:
        output = problem_input - 10
    else:
        output = problem_input - 1
    case_number += 1
    print(str(output))
