def find(a):
    a.sort()
    print(a)
    rag = (len(a-1)-a[0])/len(a-1)
    for i in range(len(a)-1):
        if a[i+1] - a[i] != rag:
            print(a[i]+rag)
            break
