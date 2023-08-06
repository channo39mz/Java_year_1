from sqlalchemy import null, true
# a = [ 'Aa', 'aaa', 'aaaaa', 'BbBb', 'Aaaa', 'AaAaAa', 'a']
a = [ 'abc', 'acb', 'bac', 'foo', 'bca', 'cab', 'cba' ]
# a = [ '    ', 'a', '  ' ]
# b = [ 'Aa', 'aaa', 'aaaaa', 'BbBb', 'Aaaa', 'AaAaAa', 'a']

b = a.copy()
def nocopy(a):
    j = 0
    for i in range(len(a)):
        a[i] = a[i].lower()
        a[i] = sorted(a[i])
        a[i] = "".join(a[i])
        a[i] = "".join(dict.fromkeys(a[i]))
    for p in a:
        if a.count(p) == 1:
            break
        j += 1

    return(j)
# print(a[a.count == 0])
print(b[nocopy(a)])
    
