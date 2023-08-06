from math import pow
import math

while True:
    h0,numworkers = list(map(int,input().split()))

    if h0 == numworkers == 0:
        break
    if h0 == numworkers:
        v1,v2 = 0,h0
    else:
        N = -1
        for k in range(1,1000):
            n = pow(numworkers, 1/k)
            N = int(n)
        if N**k == numworkers:
            if (N+1)**k == h0:
                break
        elif (N+1)**k == numworkers:
            if (N+2)**k == h0:
                N= N+1
                break
        elif (N-1)**k == numworkers:
            if (N)**k == h0:
                N = N-1
                break
        v1 = sum(N**i for i in range(k))
        v2 = sum((h0 // ((N+1)**i))*(N)**i for i in range(k+1))
    print(v1,v2)