import numpy as np
tug = input().split()
tug = list(map(int, tug))
tug2 =  []
final = []
roun = int(len(tug)/3)
for i in range(roun):
    splis = []
    splis.append(tug[0])
    splis.append(tug[1])
    splis.append(tug[2])
    tug2.append(splis)
    tug.remove(tug[2])
    tug.remove(tug[1])
    tug.remove(tug[0])
r = 0
for t in tug2:
    splistug = []
    splistug.append(tug2[r][0])
    splistug.append(tug2[r][1])
    splistug.append(tug2[r][2])
    splistug.append(tug2[r][1])
    final.append(splistug)
    r+=1


print(tug2)
print(final)