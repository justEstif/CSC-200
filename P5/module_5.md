# Module 5
Problem 1
A program that reads a set of floating-point values and returns the max, min, average and range.
begin
      import Scanner
      float userInput, average = 0, max = min float value,
            min = min float value, range = 0
      int expected, count = 0
      Scanner keyboard

      display "H0w many numbers will you be entering?"
      input value into expected

      while count < expected{
            display "Enter a number"
            accept input into userInput
            average = userInput + average
            if userInput <= min {
            min = userInput
            }
            if userInput >= max {
            max = userInput
            }
            range = max - min
            count++
      }
      display "max = " + max
      display "min = " + min
      display "average = " + average
      display "range = " + range
end
Problem 2
A program that reads a word and prints the letters in separate lines/
begin
      import Scanner
      Scanner keyboard
      String word
      display "Enter a word: "
      accept input into word
      for(int i = 0, i < word.length(), i++){
            display(word.charAt(i))
      }
end
Problem 3
A program that accepts a number and prints the Fibonacci number at at location.
begin
      import Scanner
      int userInput, fold1 = 0, fold2 = 1, foldNew = 0, counter
      Scanner keyboard
      display "Enter an integer"
      accept input into userInput
      for (counter = 0; counter < userInput; counter ++){
            foldNew = fold1 + fold2
            fold2 = fold1
            fold1 = foldNew
      }
      display "The" + counter + "th Fibonacci is: " + foldNew
end
Problem 4
A program that prints a 10x10 multiplication table.
begin
      int product = 0
      for(int n = 1; n<=10; n++) {
            for(int i=1; i <= 10; i++)
            {
                  product = n * i;
                  display (product + " ");
            }
                  if(product % 10 == 0) {
                  System.out.println();
            }
end
Problem 5
A program that finds the final x and y coordinate of a random walk.
begin
      import Random
      Random generator
      int x = 0, y = 0, intersections =0;
      boolean traveling = true
      int[] directions = {-1, 1}
      while(traveling){
            intersections++
            if(intersections == 100){
                  break
            }
            int xRandomDirections = random number from directions
            x = x + xRandomDirections
            int yRandomDirections = random number from directions
            y = y + yRandomDirections
      }
      display "(" + x "," + y +")"

