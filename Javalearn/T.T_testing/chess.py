import math
num = int(input())
for i in range(num):
    q = input().split()
    if q[0] == 'r':
        print(min(q[1],q[2]))
    elif q[0] == 'Q':
        print(min(q[1],q[2]))
    elif q[0] == 'k':
        print((int((int(q[1])+1)/2)) * (int((int(q[2])+1)/2)) + int((int(q[1])/2))*int((int(q[2])/2)))
    elif q[0] == 'K':
        print(math.ceil(int(q[1])/2) * math.ceil(int(q[2])/2) )
