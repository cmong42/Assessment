n1 = 0
n2 = 1
count = 0
sums=0
nterms=40-7
lists=[]
while nterms>=count:
       # update values
       nth = n1 + n2
       n1 = n2
       n2 = nth
       count += 1
       if n1%2==0:
           lists.append(n1)
print(lists)
print(sum(lists))
