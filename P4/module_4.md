# Module 4
Problem 1
This program reads the ages of three persons from the user, and decides who is the oldest, and who the youngest person is.

begin
    import Scanner
    int max = min int val, min = max int value,count = 0, age
    Scanner keyboard
    
while count < 3{
        display "Enter age: "
        accept input into age
        if age >= max{
            max = age
        }
        else if age <= min{
            min = age
        }
        count++
    }

    display "Max age = " + max
    display "Min age = " + min
end



Problem 2
The program that reads in the name, hourly wage and hours worked of an employee and prints the salary including overtime.

begin
    import Scanner
    String name
    double hourlyWage, hours, salary = 0
    Scanner keyboard

    display "Enter name: "
    accept input into name
    display "Enter hourly wage: "
    accept input into hourlyWage
    display "Enter hours: "
    accept input into hours

    if(hours <= 40){
        salary = hours * hourlyWage;
    }
    if(hours > 40) {
        salary = (40 * hourlyWage) + ((hours - 40) * (hourlyWage * 1.5));
    }
    
display "name" + " earned $" + salary + " this week."
end 

Problem 3
The program prints the income tax based on the original US income tax of 1913. 

Begin
    import Scanner
    double income, tax = 0
    Scanner keyboard

    display “Enter income: “
    accept input into income
    tax = returnTax(income)
    display “Tax = “ + tax
    returnTax(income){
        if income <= 50000 { 
            taxes = income * 0.01
        }
        else if income > 50000 || income <= 75000{
            taxes = income * 0.02
        }
        else if income > 75000 || income <= 100000{
            taxes = income * 0.003
        } 
        else if income > 100000 || income <= 250000{
            tax es= income * 0.04
        }
        else if income > 250000 || income <= 500000{
            taxes = income * 0.005
        } 
        else if income > 500000{
            taxes = income * 0.06
        }
        return taxes
    }
Problem 4
The program asks the user to enter a month and then prints the number of days in the months.

begin
    import Scanner
    int month
    Scanner keyboard

    display "Enter month: "
    accept input into month

    if month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12{
    display "31 days"
    }
    else if month == 4|| month == 6|| month == 9|| month == 11{
    display "30 days"
    }   
    else if month ==2{
    display "28 or 29 days"
    }
    else {
    display "Input is not acceptable"
    }
end

Problem 5
This program checks weather the inputted year is a leap year or not.

begin
    import Scanner
    int year
    Scanner keyboard

    display "Enter year: "
    accept input into year

    if year % 4 == 0 && year % 100 != 0 && year % 400 == 0{
    display year + " is a leap year"
    }
    else {
    display year + " is not a leap year"
    }


