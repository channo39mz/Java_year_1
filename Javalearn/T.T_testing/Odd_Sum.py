num = int(input())
lis = []
con = 0
cut = 0
for i in range(num):
    a = int(input())
    b = int(input())
    while a<=b:
        if a%2!=0:
            cut += a
        else:
            pass
        a+=1
    lis.append(cut)
    cut = 0
for y in lis:
    con += 1
    print("Case",str(con) +":", y)

