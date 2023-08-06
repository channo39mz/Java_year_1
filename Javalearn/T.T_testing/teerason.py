from ast import Add
from os import rename
from tkinter import W

a = int(input())
for i in range(a):
    arrM = []
    arrW = []
    ans = []
    roun = int(input())
    for i in range(roun):
        arrW.append(input().split())
        ans.append(0);
    for j in range(roun):
        arrM.append(input().split())
    
    wI = [-1]*roun
    mI = [1]*roun
    while -1 in wI:
        for m0 in range(roun):
            w0 = int(arrM[m0][mI[m0]])-1
            if (wI[w0]<0):
                wI[w0] = w0
            else:
                print(arrW[w0])
                print('m0+1',m0+1)
                p0 = arrW[w0][1:].index(wI[w0]+1)
                p1 = arrW[w0][1:].index(m0+1)
            

                if p1<p0:
                    mI[wI[w0]] = mI[wI[w0]]+1
                    wI[w0]= m0
                else:mI[m0] = mI[m0]+1
    