num1 = int(input())
num2 = int(input())
maxval = 0

while num1!=num2:
    lopnum1 = num1
    stk = 1
    while lopnum1 != 1:
        if lopnum1 % 2 == 0:
            lopnum1 /= 2
        else:
            lopnum1 = (lopnum1*3)+1
        stk += 1
    if stk > maxval:
        maxval = stk
    num1 += 1
print(maxval)