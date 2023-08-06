binoder = input().split()
import math
y = 0
lis = []
binoder = list(map(int, binoder))
# BGC
# 0 1 2   3 4 5   6 7 8
# BGC 048
lis.append(binoder[3]+binoder[6]+binoder[1]+binoder[7]+binoder[2]+binoder[5])
# BCG 057
lis.append(binoder[3]+binoder[6]+binoder[2]+binoder[8]+binoder[1]+binoder[4])
# GBC 138
lis.append(binoder[4]+binoder[7]+binoder[0]+binoder[6]+binoder[2]+binoder[5])
# GCB 156
lis.append(binoder[4]+binoder[7]+binoder[2]+binoder[8]+binoder[0]+binoder[3])
# CBG 237
lis.append(binoder[5]+binoder[8]+binoder[0]+binoder[6]+binoder[1]+binoder[4])
# CGB 246
lis.append(binoder[5]+binoder[8]+binoder[1]+binoder[7]+binoder[0]+binoder[3])

for i in lis:
    # print(y)
    y+=1
    if i == min(lis):
        if y == 1:
            print("BGC", min(lis))
            break
        if y == 2:
            print("BCG", min(lis))
            break
        if y == 3:
            print("GBC", min(lis))
            break
        if y == 4:
            print("GCB", min(lis))
            break
        if y == 5:
            print("CBG", min(lis))
            break
        if y == 6:
            print("CGB", min(lis))
            break
    


