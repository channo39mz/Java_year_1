import sys


H_firstcat = 216#int(input())
allworkcat = 125#int(input())

for i in range(2,sys.maxsize):
    workcat = 0
    catnow = 1
    auucat = 0
    totalcat = 0
    curheig = H_firstcat
    while((curheig%i) == 0):
        totalcat += curheig*catnow
        auucat += catnow
        curheig = curheig/i
        catnow = catnow * (i-1)

    if (catnow == allworkcat):
        totalcat+= catnow
        print(auucat , int(totalcat))
        # print(i)
        break
        

    print(catnow)
