def middle_element(lst):
    if len(lst)%2==0:
        one=int((len(lst)/2)-1)
        two=int((len(lst)/2))
        one=lst[one]
        two=lst[two]
        return(int(one+two)/2)
    elif len(lst)%2!=0:
        one=int((len(lst)/2))
        one=lst[one]
        return one



      
print(middle_element([5, 2, -10, 4, 5]))
