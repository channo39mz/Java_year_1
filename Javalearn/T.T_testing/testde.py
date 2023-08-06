lisfocity = [2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17]
re = []

cout = 0

for i in range(16):
    for y in range(4):
        cout+=1
        if cout >= len(lisfocity):
            cout = cout-len(lisfocity)
    if len(lisfocity) == 1:break
    # print(cout)
    re.append(lisfocity[cout])
    # print(re)
    lisfocity.remove(lisfocity[cout])
    print(lisfocity)
