number_of_words = int(input())
count=0
successful_words = 0
a= []
dict = {'2':'abc', '3':'def', '4':'ghi', '5':'jkl','6':'mno', '7':'pqrs', '8':'tuv','9':'wxyz'}
while count < number_of_words:
    a.append(input())
    count += 1
phone_input = str(input())

for x in a:
    if len(x) != len(phone_input):
        a.remove(x)

for x in a:
    i = 0
    y = 0
    while i < len(x):
        if x[i] in dict[phone_input[y]]:
            i += 1
            y += 1
        else:
            break
    if i == len(x):
        successful_words += 1

print(str(successful_words))