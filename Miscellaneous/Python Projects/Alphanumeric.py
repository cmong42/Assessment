if __name__ == '__main__':
    s = input()
    for letter in s:
        if letter.isalnum() == True:
            print(True)
            continue
        elif letter.isalnum() ==False:
            print(False)
            break
    for letter in s:
        if letter.isalpha() == True:
            print(True)
            continue
        elif letter.isalpha() ==False:
            print(False)
            break
    for letter in s:
        if letter.isdigit() == True:
            print(True)
            continue
        elif letter.isdigit() ==False:
            print(False)
            break
    for letter in s:
        if letter.islower()==True:
            print(True)
            continue
        elif letter.islower()==False:
            print(False)
            break
    for letter in s:
        if letter.isupper()==True:
            print(True)
            continue
        elif letter.islower()==False:
            print(False)
            break
