def pythagorean_triplet(a, b, c):
    if (a**2)+(b**2)==c**2:
        return True
    else:
        return False

def equals_1000(l, m, n):
    if l+m+n==1000:
        return True
    else:
        return False
x=[]
y=[]
z=[]
for a in range(100, 500):
    for b in range(100, 500):
        for c in range(500, 1000):
            if pythagorean_triplet(a, b, c)==True and equals_1000(a, b, c)==True:
                print(a, b, c)

        



