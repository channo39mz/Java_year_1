num = int(input())
lis = []
for i in range(num):
    a , b = int(input()) , int(input())

    if a > b:lis.append(">")
    elif b>a:lis.append("<")
    else:lis.append("=")
for y in lis:
    print(y)