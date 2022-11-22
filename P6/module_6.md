# Module 6
Problem 1
This program will allow the user to save and display airline flight information.
begin
    class Flight{
        initalize airline, origin, destination
        function Flight(String airline, String origin, String destination, int flightNumber){
            save the arguments into the respective variables of the class
        }
        function getAirline(){
            returns airline
        }
        function setAirline(String airline){
            updates the argument airline as the value of the airline in the class
        }
        function getOrigin(){
            returns origin
        }
        function setOrigin(){
            updates the argument origin as the value of the origin in the class
        }
        function getDestination(){
            returns destination
        }
        function setDestination(){
            updates the argument destination as the value of the destination in the class
        }
        function getFlightNumber(){
            returns flightNumber
        }
        function setFlightNumber(){
            updates the argument flightNumber as the value of the flightNumber in the class
        }
        function toString(){
            returns (airline) (flightNumber) from (origin) to (destination)
        }
    }
End

Program 2
This program will allow the user to count and reset count.
begin
    class Counter{
        initalize count = 0
        function resetCount(){
            count = 0
        }
        function increaseCounter(){
            count = count + 1
        }
        function decreaseCounter(){
            if count > 0
                count = count - 1
            else
                display "Counter is zero. A negative counter is not allowed."
        }
        function getCounterValue(){
            return int
        }
        function toString(){
            return "Counter = " + counter
        }
    }
end

Program 3
This program will stimulate a pair of dice.
begin
    class PairOfDice{
        initiate num1, num2
        initiate Die die1, die2
        function PairOfDice(num1, num2){
            save num1 and num2 as the value of num1 and num2 of the class
            create the 2 objects die1 and die2 using the 2 numbers
        }
        function setValue1(num){
            set num as argument of die1
        }
        function setValue2(num){
            set num as argument of die2
        }
        function getValue1(){
            return value of die1
        }
        function getValue2(){
            return value of die2
        }
        function rollDice(){
            roll both die
        }
        function getSumSides(){
            return getValue1 + getValue2
        }
    }
End

Program 4
This program will stimulate a hang man game.
begin
    class HangMan{
        initiate SecretWord = "abracadabra", disguisedWord = "???????????", name
        create secretLetters as a char array of the letters in SecretWord
        create disguisedLetters as a char array of the letters in disguisedWord
        initiate c, numberOfGuesses = 0, numberOfIncorrectGuesses = 0,
            maxNumberOfGuesses = 15
        function HangMan(name){
            save this name as name of the function
        }
        function getDisguisedWord(){
            save disguisedLetters as a string into disguisedWord
            return disguisedWord
        }
        function getSecretWord(){
            return SecretWord
        }
        function getGuessCount(){
            return numberOfGuesses
        }
        function getNumberOfGuesses(){
            return maxNumberOfGuesses - numberOfGuesses
        }
        function MakeGuess(c){
            save this c as c of class
            run gameDone()
        }
        funtion isWordFound{
            if the disguisedLetters and secretLetters match
                returns true
            return false
        }
        function gameOn(){
            if getNumberOfGuesses() != 0 or isWordFound() == false
                return true
            return false
        }
        function isLetterFound(){
            for int i = 0, i < secretLetters.length, i++ {
                if secretLetters[i] == c {
                    display "Correct Guess"
                    run ifLetterFound()
                    return true
                }
            }
            display "Incorrect Guess"
            numberOfIncorrectGuesses++
            return false
        }
        function ifLetterFound(){
            for int i = 0, i < secretLetters.length, i++ {
                if secretLetters[i] == c && disguisedLetters[i] != c{
                    disguisedLetters[i] = c
                    break
                }
            }

        }
        function gameDone(){
            numberOfGuesses++
            if gameOn(){
                isLetterFound()
            }
            else{
                display (name) " has guessed the word wrong and ran out of guesses."
            }
        }
    }
End

Program 5
This program can store and display movie title and rating.
begin
    class Movie{
        initiate movieName, mpaaRating
        initiate terribleCount, badCount, okCount, goodCount, greatCount, count = 0, sum = 0
        function Movie(movieName){
            save this movieName as movieName
        }
        function getMovieName(){
            return movieName
        }
        function setMovieName(movieName){
            save this movieName as movieName of the class
        }
        function getMpaaRating(){
            return getMpaaRating
        }
        function setMpaaRating(mpaaRating){
            save this mpaaRating as mpaaRating
        }
        function addRating(rating){
            if rating >= 1 and rating <= 5{
                count++
                if rating == 1 {
                    terribleCount++
                    sum = sum + (terribleCount * 1)
                } else if rating == 2 {
                    badCount++
                    sum = sum + badCount * 2
                } else if rating == 3 {
                    okCount++
                    sum = sum + okCount * 3
                } else if rating == 4 {
                    goodCount++
                    sum = sum + goodCount * 4
                } else if rating == 5 {
                    greatCount++
                    sum = sum + greatCount * 5
                } else {
                    display "A value not equal to 1 - 5 was enter."
                }
            }
        }
        function getAverage(){
            average = sum / count
            return average
        }
    }



