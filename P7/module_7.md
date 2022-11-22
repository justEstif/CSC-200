# Module 7
Problem 1
This program will allow the used to store, view and compare address containing a house number, a street, an optional apartment number, a city, a state, and a postal code.
begin
    class Address{
        initialize int houseNumber, apartNumber, postalCode
        initialize String street, city, state

        function Address(int houseNumber, String street, int apartNumber, String city, String state, int postalCode){
            save the arguments into the respective variables of the class
        }
        function Address(int houseNumber, String street, String city, String state, int postalCode){
            save the arguments into the respective variables of the class
        }
        function printAddress(){
            display street
            display {city}, {state}, {postalCode}
        }
        function getPostalCode(){
            return postalCode
        }
        function comesBefore(Address other){
            returns true if the calling address postal code comes before other's
            else returns false
        }
    }
End

Problem 2
This program will find the surface area and volume of a cylinder
begin
    class CanSurfaceAreaVol{
        initiate double height, radius, surfaceArea, volume
        function CanSurfaceAreaVol(double height, double radius){
            save the arguments into the respective variables of the class
        }
        function getSurfaceArea(){
            surfaceArea = 2 * (radius * radius) * PI + 2 * PI * radius * height;
            return surfaceArea
        }
        function getVolume(){
            volume = height * PI * (radius * radius);
            return volume
        }
    }
End

Problem 3
This program will be able to display the month name and/or month number as long as one is given.
begin
    class Month{
        initiate monthNumber, monthName
        function Month(){
            monthNumber = 1
        }
        function Month(int monthNumber){
            if monthNumber <= 12 || monthNumber >= 1{
                this.monthNumber = monthNumber
            }
            else{
                this.monthNumber = 1
            }
            this.monthName = setMonthName(monthNumber)
        }
        function Month(String monthName){
            use a case-switch to match the month name to month number
        }
        function getMonthNumber(){
            return monthName
        }
        function setMonthNumber(int monthNumber){
            if monthNumber <= 12 || monthNumber >= 1{
                this.monthNumber = monthNumber
            }
            else{
                this.monthNumber = 1
        }
        function getMonthName(){
            this.monthName = setMonthName(monthNumber)
            return monthName
        }
        function toString(){
            return monthName
        }
        function equals(Object obj){
            if (this and obj are equal){
                return true
            }
            if (obj is empty or not in the same class){
                return false
            }
            Month other = (Month) obj
            return monthNumber == other.monthNumber
        }
        function greaterThan(Month other){
            if this month > month of other {
                return true
            }
            else {
                return false
            }
        }
        function lessThan(Month other){
           if this month < month of other {
                return true
            }
            else {
                return false
            }
        }
        function setMonthName(int monthNumber){
            use switch-case to assign monthName to monthNumber
        }
    }
End

Problem 4
This program will calculate the fuel amount after traveling based of the efficeny of the car.
begin
    class Car{
        initiate double fuelEfficiency, fuelAmount, fuelUsed

        function Car(double fuelEfficiency){
            store this value to that of class
        }
        function drive(int miles){
            fuelUsed = miles / fuelEfficiency
            fuelAmount = fuelAmount - fuelUsed
        }
        function getGasLevel(){
            return fuelAmount
        }
        function addGas(double fuelAdded){
            fuelAmount = fuelAmount + fuelAdded
        }
    }
End
 
Problem 5
This program will hold and display the data about an item in a retail store.
begin
    class RetailItem{
        initialize description, unitsOnHand, price
    function RetailItem(String description, int unitsOnHand, double price){
        save the arguments into the respective variables of the class    
    }   
    function toString(){
        display "RetailItem: "+ description + "{next line, tab}UnitsOnHand: " + unitsOnHand + "{next line, tab}Price: " + price 
    }
    }
End


