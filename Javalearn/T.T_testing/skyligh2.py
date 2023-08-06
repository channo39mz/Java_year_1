tug = input().split()
tug = list(map(int, tug))
newlis = []
dimention = []
n = 0
trap = True


for i in range(len(tug)):
    n+=1
    newlis.append(tug[i])
    if n % 3 == 0:
        newlis.append(tug[i-1])

roun = int(len(newlis)/2)
p = 0
for i in range(roun):
    splis = []
    splis.append(newlis[p])
    splis.append(newlis[p+1])
    dimention.append(splis)
    p+=2
dimention.sort()

# print(dimention)
xmax = 0
lismax = [0]
ans = ""
for k in dimention:
    # print(k)
    lismax.sort()
    if k[1] == xmax and trap:
        lismax.remove(k[1])
        ans += str(k[0])+ " "+ str(lismax[-1])+ " "
        xmax = lismax[-1]
        trap = False
    if k[1] > xmax and trap:
        ans += str(k[0])+ " "+ str(k[1])+ " "
        xmax = k[1]
        lismax.append(k[1])
        trap = False
        
    if k[1] in lismax and trap:
        lismax.remove(k[1])
        trap = False
    if k[1] not in lismax and trap:
        # print("a")
        lismax.append(k[1])
    # print(ans,lismax,xmax)
    trap = True

# ans += str(dimention[-1][0]) + " 0"
ans = ans.strip()
# print(lismax)
print(ans)