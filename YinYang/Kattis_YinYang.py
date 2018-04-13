string = input()
b_count = 0
w_count = 0
for i in string:
    if i == 'B':
        b_count += 1
    elif i == 'W':
        w_count += 1

if b_count == w_count:
    print("1")
else:
    print("0")
