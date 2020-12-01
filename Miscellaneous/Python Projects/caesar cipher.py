alphabet="abcdefghijklmnopqrstuvwxyz"
alpha_list=[]
beta_list=[]
listy={}
anddone=[]
for a in alphabet:
    alpha_list.append(a)
x=input("Enter a message here: ")
key=input("Enter a key here from 0-25: ")
x=x.lower()
for d in range(int(key), len(alphabet)):
    beta_list.append(alphabet[d])
for f in range(0, int(key)):
    beta_list.append(alphabet[f])
            
one_list={m:n for m,n in zip(alpha_list, beta_list)}
for y in x:
    for z in y:
        finder=(alphabet.find(z))
        anddone.append(beta_list[int(finder)])

print("".join(anddone))
print(one_list)
