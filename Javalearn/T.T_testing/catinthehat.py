import sys
# โจทย์จริงๆคือถามว่ามีแมวได้กี่ตัวในหมวกที่ถ้าเพิ่มขึ้นด้วยจำนวนเดิมแล้วจะ = จำนวนแมวที่ทำงาน
# เริ่มจาก 2

def catcathat():
    while True:
        H_firstcat,allworkcat = input().split()
        # allworkcat = int(input())
        if H_firstcat == allworkcat == "0":
            break
        catauu(int(H_firstcat),int(allworkcat))
        
def catauu(a,b):
    for i in range(2,sys.maxsize):
        workcat = a
        catnow = 1
        auucat = 0
        totalcat = 0 
        while((workcat%i) == 0):# สบัดหมวกเมื่อ i หารลงตัว คือจะมีแมว i ตัวในหมวกแมว 1 ตัว
            # print(totalcat , i ,catnow , auucat)
            totalcat += workcat*catnow # ความสูงแมวรวม = แมวตัวที่สบัดหมวก * จำนวนแมวณปัจจุบัน
            auucat += catnow #แมวที่สบัดหมวกไปแล้วคือแมวอู้
            workcat = workcat/i # สบัดหมวกแล้วแมวที่ต้องมาทำงาน หารด้วย i เพราะตอนนี้แมวที่มีเพิ่มขึ้น = iเท่า
            catnow = catnow * (i-1) # แมว ณ ปัจจุบัน = แมวที่มีอยู่ * จน. แมวที่สบัดออกมาจากหมวกได้ - 1(แมวตัวที่สบัด)
            # print(totalcat , i ,catnow , auucat)
        if (catnow == b):
            totalcat += catnow #บวกจำนวนแม้วที่อู้งานกลับเข้าไป
            print(auucat , int(totalcat))
            # print(i)
            break

catcathat()
