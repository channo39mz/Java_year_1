inp = input().split()
cout1 = 0
cout2 = 0
notjoy = 0
inp.remove(inp[0])
for i in range(len(inp)-2):
    if int(inp[i])>int(inp[i+1]):
        count1 = int(inp[i])-int(inp[i+1])
    if int(inp[i+1])>int(inp[i+2]):
        count2 = int(inp[i+1])-int(inp[i+2])
    if int(inp[i])<=int(inp[i+1]):
        count1 = int(inp[i+1])-int(inp[i])
    if int(inp[i+1])<=int(inp[i+2]):
        count2 = int(inp[i+2])-int(inp[i+1])

    if count1-count2 > 1 or  count2-count1 > 1 or count1 == count2 or count2 > count1:
        notjoy+=1
if notjoy == 0:
    print("Jolly")
else:print('Not jolly')