roundd = int(input())
lis = []
ans = []
con = 0
for i in range(roundd):
    lis.append(int(input()))
    lis.append(int(input()))
    lis.append(int(input()))
    lis.sort()
    ans.append(lis[1])
    lis.clear()
    print(ans)
for y in ans:
    con += 1
    print("Case",str(con) +":" , y)