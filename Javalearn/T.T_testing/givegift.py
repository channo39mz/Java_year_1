while True:
    num = int(input())
    name = input().split()
    name = list(map(str, name))
    oder = []
    money = []
    for i in range(num):
        oder.append(input().split())
    for u in oder:
        # print(u[0])
        n = 0
        for t in name:
            if u[0] == t:
                name[n] = [u[0],int(u[1])*-1 ]
                break
            n+=1
        if int(u[2])>0 and int(u[1]) > 0:
            name[n][1] += int(u[1])%int(u[2])

    print(name)

    for y in oder:
        l = 1
        m = 0
        if int(y[2]) == 0 or int(y[1]) == 0:
            pass
        else: 

            # print(y)
            # print(y[2+l])
            for p in range(int(y[2])):
                # print(y[2+l])
                for r in name:
                    # print(y[2+l] , r[0])
                    if y[2+l] == r[0]:
                        # print(int(y[1])//int(y[2]) ,name[m][1] )
                        name[m][1] += int(y[1])//int(y[2]) 
                        # print(name[m][1] )
                    m+=1
                m = 0
                l+=1

    for i in range(len(name)):
        print(name[i][0],name[i][1])

    print("\n")
