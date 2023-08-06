tex = input()
num = tex.count("\"")
# print(num)
tex = tex.replace("\"","\'\'")

print(tex)