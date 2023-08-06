while True:
    tesnum = 2;
    a = int(input())    
    bol = False
    lis = []
    while True:
        cout = 0
        removeciity = [1]
        for i in range(len(lis)):
            for y in range(tesnum-1):
                cout+=1
                if cout >= len(lis):
                    cout = cout-len(lis)
            if len(lis) == 1:
                
                # print(tesnum) // เลขที่เอามาลอง
                # print(lis[0]) เลขเมืองสุดท้ายที่เลือก
                if lis[0] == 13:
                    bol = True
                    # print("yasss")บอกว่าได้แล้ววว

                    break
                else:
                    tesnum+=1
                    break
            # print(lis)
            removeciity.append(lis[cout])
            # print(re)
            lis.remove(lis[cout])
        if bol:
            print(tesnum)
            break
        lis.clear()
        for p in range(2,a+1):
            lis.append(p)

        
        
    
    
        # tesnum+=1
        
