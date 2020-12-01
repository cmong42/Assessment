letters = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"]
points = [1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 4, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10]
letter_to_points={x:y for x, y in zip(letters, points)}
letter_to_points[""]=0
def score_word(word):
  point_total=0
  for alpha in word:
    point_total+=letter_to_points.get(alpha)
  return point_total
brownie_points=score_word("BROWNIE")
print(brownie_points)
player_to_words={"player1":["BLUE", "TENNIS", "EXIT"], "wordNerd":["EARTH", "EYES", "MACHINE"], "LexiCon":["ERASER", "BELLY", "HUSKY"], "ProfReader":["ZAP", "COMA", "PERIOD"]}
player_to_point={}
for player, words in player_to_words.items():
  player_points=0
  for word in words:
    player_points+=score_word(word)
  player_to_point[player]=player_points
  
  
def play_word(playa, wordie):
    player_to_word=player_to_words[playa]
    player_to_word.append(wordie)
    for t in player_to_word:
        sw=score_word(t)
    player_to_point[playa]+=sw
    

(play_word("player1", "BROWNIE"))
print(player_to_point)

