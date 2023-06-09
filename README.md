# magicBoxes

This is a very interesting program I wrote in Java where you are displayed 6 boxes - each box has 32 numbers and those numbers are between 1 and 63. All you need to do is think of a number between 1 and 63. And tell the program which boxes your number is in. The program does its magic and prints out the number you thought of!

I have also added a recorded video of the program which shows how the program works. There is a bunch of validation that the program does, which is shown in the recording magicBoxDemoWithValidations.mov as well
Some of the examples are-
- User has to enter a nunber between 1 and 6 when program asks it about the number of boxes user sees his number in
- User can't enter special characters or alphabets
- Program validates the user input in both cases when each input is separated by space or is in a new line

Open Issue-
If user sees his number in n boxes, but inputs >n boxes in the next prompt, then program takes first n inputs and calculates the number for user rather than exiting or displaying a validation message. This is not a huge issue, but something that I will work on fixing later.
Example -
Now tell me how many boxes out of the above you see your number in...
2
Perfect! You see your number in 2 boxes above
Now tell me the 2 boxes you see your number in:
1 3 4 5 6
I am pretty sure your number is: 5.

See how user gave input as 1 3 4 5 6 (even though user said in the beginning that she sees the number in only 2 boxes), in this case I would want the program to exit, and give a message to user - You did not input the correct number of boxes.

Credit-

My 4th grader because I heard about this magic box trick in his Math night at school.
chatGPT, for helping me out with questions I had about Syntax and github.