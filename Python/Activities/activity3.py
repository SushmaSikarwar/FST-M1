user1 = input("What is First Player name? ")
user2 = input("What is Second Player name? ")

user1_ans = input(user1 + " Do you want to choose Rock,Paper or Scissors? ").lower()
user2_ans = input(user2 + " Do you want to choose Rock,Paper or Scissors?").lower

if user1_ans == user2_ans:
    print("It's a tie!")
elif user1_ans == 'rock':
    if user2_ans == 'scissors':
        print("Rock Wins!")
    else:
        print("Paper Wins!")

elif user1_ans == 'scissors':
        if user2_ans == 'paper':
          print("Scissors wins!")
        else:
            print("Rock Wins!")

elif user1_ans == 'paper':
        if user2_ans == 'rock':
            print("Paper wins!")
        else:
             print("Scissors Win!")
else:
    print("Invalid input! You have not entered Rock,Paper or Scissors, try again.")
