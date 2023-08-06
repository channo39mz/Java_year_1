#n = 253031
#e = 33311

# n = 442523
# e = 319699

# n=119387
# e=101533

n=1133
e=613

# n=173939
# e=419

#cypher = [192718, 44207, 92345, 198194, 209885, 145673, 158195, 162891, 209885, 197432, 251143, 174163, 92345, 209885, 162891, 154788, 179792, 209885, 120588, 44207, 98836, 120588, 132369, 114740, 209885, 105496, 44207, 92345, 198194, 209885, 120588, 44207, 92345, 209885, 197432, 98836, 157424, 92345, 209885, 92345, 198194, 43326, 114740, 205085]
#cypher = [224476, 294163, 367725, 367725, 216835, 367725, 135507, 254755, 303589, 135507, 216835, 218849, 416081, 406146, 416081, 90895, 90895, 416081, 299359, 294163, 39364, 216835, 180334, 90895, 416081, 410593, 367725, 135507, 406146, 39364, 216835, 218849, 416081, 216835, 218849, 416081, 406146, 416081, 90895, 90895, 416081, 299359, 294163, 39364, 216835, 406146, 135507, 431006]
#cypher = [86359, 81019, 114792, 116312, 34966, 81019, 92384, 57020, 73822, 15671, 114792, 57020, 110149, 57446, 116159, 72045, 96789, 57020, 96789, 15671, 84595, 114792, 73822, 57020, 86867, 114792, 33756, 81019, 96789, 15671, 83707, 116159, 23742, 57020, 83707, 33756, 116312, 114792, 84595, 96789, 57446, 116159, 96789, 57020, 57446, 73822, 57446, 59751, 92384, 57020, 110149, 57446, 116159, 57020, 116159, 81019, 31823, 81019, 84595, 57020, 15671, 114792, 116312, 81019, 57020, 96789, 114792, 57020, 110149, 15671, 57446, 116159, 23742, 81019, 57020, 57446, 116159, 59751, 96789, 15671, 83707, 116159, 23742, 57719]
cypher = [805, 928, 414, 110, 622, 414, 110, 515, 32, 121, 111, 838, 348,526, 822, 32, 110, 111, 45, 515, 111, 111, 100, 32, 509, 110, 100, 32, 531, 111, 526, 425, 928, 520, 822, 939, 939, 32, 414, 939, 32, 425, 928, 822, 32, 531, 111, 526, 939, 425, 32, 425, 928, 414, 110, 515, 32, 121, 111, 838, 32, 99, 509, 110, 32, 100, 111, 767]
# cypher = [22015, 79396, 72281, 44319, 63140, 96864, 25396, 73635, 148871, 62908, 168859, 44319, 15713, 96864, 70703, 44319, 172672, 72281, 25396, 151324, 72281, 168793, 70703, 7670, 44319, 65711, 43567, 70703, 44319, 109499, 70703, 62908, 168859, 44319, 70703, 79396, 72281, 25396, 72281, 44319, 151324, 96864, 25396, 44319, 43567, 168859, 44319, 70703, 25396, 154341, 109499, 15713, 145588, 44319, 70703, 79396, 72281, 44319, 65711, 72281, 168859, 70703, 44319, 109499, 70703, 44319, 168793, 65557, 15713, 87617, 44319, 22015, 79396, 65557, 70703, 62908, 168859, 44319, 63140, 79396, 65557, 70703, 44319, 135326, 65557, 52568, 72281, 168859, 44319, 109499, 70703, 44319, 168859, 96864, 44319, 148871, 65557, 135326, 15713, 44319, 65711, 72281, 65557, 43567, 70703, 109499, 151324, 43567, 73635, 87617]

def gcdExtended(a, b):
    if a == 0:
        return b, 0, 1
    # print(a,b);
    gcd, x1, y1 = gcdExtended(b % a, a) # เอา e ที่มีหาร z ไปเรื่อยๆ แล้วใส่ตัว  e ที่หารกลับไปด้วย
    
    x = y1 - (b//a) * x1 
    # print("ba" ,b//a)
    y = x1
    print(gcd , x ,y)
    return gcd, x, y

pq = []
for i in range(2,n):
    if n % i == 0:
        pq.append(i)
print(pq)

phi = (pq[0]-1) * (pq[1]-1)
d = gcdExtended(e, phi)[1]
# print(d)
d = d % phi
print(d)
if d < 0:
	d += phi
print(d)
print("p =" , pq[0] ,"\nq = ",pq[1],"\nd = ",d)

for i in cypher:
	text = int((i**d) % n)
	print(chr(text), end="")
 