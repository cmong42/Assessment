a= range(100,1000)
b= range(100,1000)
c=[0,1]

for x in a:
    for y in b:
        answer= str(x*y)
        if answer == str(x*y)[::-1]:
            answer= int(answer)
            c.append(answer)
answer = max(c)
print(answer)
        
        
