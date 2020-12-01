y=range(1,101)
z=0
w=[]
p=[]
m=0
for x in y:
   w.append(x**2)
for i in w:
    z+=i
print(z)


for n in y:
    p.append(n)
for o in p:
   m+=o
print(m**2)

print(m**2-z)
