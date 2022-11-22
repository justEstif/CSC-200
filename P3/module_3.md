# Module 3
Problem 1
This program prompts the user for a measurement in meters, and then converts it
into miles, feet, and inches.

begin
    import Scanner
    double meters, miles, feet, inches
    Scanner keyboard

    display "Hello out there."
    display "I will change meters to miles, feet, and inches for you."
    display "Enter your measurement in meters: "

    accept input into meters
    miles = meters / 1609
    feet = meters * 3.28
    inches = meters * 39.37

    display meters + "m = " + miles + "mi"
    display meters + "m = " + feet + "ft."
    display meters + "m = " + inches + "in"
end




Problem 2
This program reads in an integer, and breaks it into a sequence of individual digits.
It displays each digit on a separate line.

begin
    import Scanner
    int number
    String numberString
    Scanner keyboard

    display "Hello out there."
    display "I will read an integer, and breaks it into a sequence of individual digits for you."
    display "Enter your number: "

    accept input into number
    numberString = number into String

    for(i = 0; i < length of numberString; i++)
    begin
        display char at i in numberString
    end
end




Problem 3
The program will asks the user to input:
   the number of gallons of gas in the tank,
   the fuel efficiency in miles per gallon, and
   the price of gas per gallon.
Then it prints the cost per 100 miles and how far the car can go with the gas in the car.

begin
    import Scanner
    double gallons, efficiency, price, perHundred, distance
    Scanner keyboard

    display "Hello out there."
    display "I will read an integer, and breaks it into a sequence of individual digits for you."
    display "Enter the number of gallons of gas in the tank: "
    accept input into gallons
    display "Enter the fuel efficiency in miles per gallon: "
    accept input into efficiency
    display "Enter the price of gas per gallon: "
    accept input into price
    perHundred = (100 / efficiency) * dollar
    distance = gallons * efficiency

    display "The car can go "+ distance + "mi with the gas in the tank."
    display "The cost per 100 miles is " + perHundred
end
Problem 4
This program asks the user to enter the name of his or her favorite city. It uses a String variable to
store the input. The program will display the following:
    the number of characters in the city name,
    the name of the city in all uppercase letters,
    the name of the city in all lower-case letters, and
    the first character in the name of the city.

begin
    import Scanner
    String city, cityUc, cityLc
    char cityFl
    int cityLength
    Scanner keyboard

    display "Hello out there."
    display "What is your favorite city?"
    display "Enter name of city: "
    accept input into city

    cityLength = city length
    cityUc = city to Upper Case
    cityLc =  city to Lower Case
    cityFl = character at 0 in city

    display "The number of characters in the city name is " + cityLength
    display "The name of the city in all uppercase letters " + cityUc
    display "The name of the city in all lowercase letters " + cityLc
    display "The first character in the name of the city " + cityFl
end

Problem 5
This will read a word from the user and display the string with the letters shifted to the right by two positions and with the letters shifted to the left by two positions in the string.
begin
    import Scanner
    String word, last2, first4, last4, first2, right, left
    Scanner keyboard
    display "Enter a word: "
    accept input into word

    last2 = substring of last 2 letters of word
    first4 = substring of first 2 letters of word
    last4 = substring of last 2 letters of word
    first2 = substring of first 2 letters of word

    right = last2 + first4;
    left = last4 + first2;

    display "Given Term: " + word
    display "Right-Shifted: " + right
    display "Left-Shifted: " + left
end

