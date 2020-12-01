import random
word_string='''a
Almsgiver Authoring Angelfish Anxiously

Anchovies Abolished Awestruck Ablutions

Alchemist Absolving Algorithm Amplitude

Blockhead Betraying Bleaching Benchmark

Bohemians Breathing Burnished Binocular

Birdcages Breaching Bifurcate Brimstone

Blackouts Broaching Brightens Breakdown

Campfires Capturing Curtained Cambering

Countries Contrived Captioned Cylinders

Costumier Companies Cremating Copyright

Compliant Compilers Chemistry Clampdown

Chandlers Cavorting Carousing Chortling

Dystopian Diplomats Deploying Dishwater

Decathlon Deviators Ducklings Discovery

Duplicate Driveways Declaring Durations

Earthling Employing Eucharist Exclusion

Falconers Fathering Fractious Fragments

Favourite Flagstone Furnished Farmhouse

Facetious Flounders Flavoured Farthings

Groundsel Garnished Grumpiest Greyhound

Gourmands Galumphed Gumshield Guardsmen

Hypocrite Hampering Hungriest Hamstring

Herbalist Hectoring Hypocaust Hangovers

Incurable Ignoramus Integrals Intervals


REPORT THIS AD

Jangliest Jokesmith Jockeying Jocundity

Kyboshing Keyboards Kvetching Knitwears

Liveryman Lecturing Locksmith Lunchtime

Masterful Makeshift Megaliths Manifesto

Merchants Marigolds Machinery Mavericks

Meltdowns Mothering Menstrual Megabucks

Nefarious Nostalgic Nightwear Normality

Overnight Orientals Ownership Oversight

Painterly Parchment Posturing Parsimony

Pinafores Producing Proactive Ponytails

Porcelain Preaching Practised Pectorals

Quavering Quelching Quatching Quackling

Randomize Revolting Rhapsodic Reactions

Regionals Recouping Relations Revulsion

Sprightly Subaltern Searching Scrubland

Swordplay Sparingly Sketching Supernova

Screaming Sparkling Snowdrift Something

Tenacious Tapeworms Trampling Triangles

Terminals Tarnished Trapezium Tramlines

Unearthly Uploading Universal Undershot

Vexatious Verbalist Vocalized Vainglory

Weaklings Welcoming Westbound Workbench

Xylograph Yearlings Youngster Zealotism
'''
word_list=[]
word_string1=word_string.split()
for x in word_string1:
    x=x.lower()
    word_list.append(x)
rand=random.randint(0, 191)
hangman_word=(word_list[rand])
counting=0
tries=20
for letters in hangman_word:
    counting+=1
fin=""
for g in range(1, counting+1):
    fin+=str(g)
print(hangman_word)
done={}
o=1
finale=""
print("\nOur word has {} letters".format(counting))
while tries!=0:
    if fin.isalpha()==True:
        break
    else:
        userinput=input("Enter a letter here:    ")
        userinput=userinput.lower()
        indices=hangman_word.find(userinput)
        if len(userinput)>1:
            print("One letter at a time!")
        elif userinput in hangman_word:
            fin=fin.replace(fin[indices], userinput)
            print(fin)
        elif userinput not in hangman_word:
            print("That letter's not in the word!")
            tries-=1
            print("You have {} tries left!".format(tries))
print("You won! Great job!")
            

