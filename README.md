# Week 5

In this week's lab we will be practicing using recursion to solve problems. 
You may want to use the [in class exerceise from 16 September](https://github.com/CS2401-Fall2020/September16-inClass) as a reference for this assignment. 

In class on 16 September we discussed binary (base 2) and decimal (base 10) numbering. We know that binary numbers only have the digits 0 and 1 (2 digits) and decimal uses 0 through 9 (10 digits). 
Octal numbering is base 8, meaning it uses 8 different digits: 0 though 7. 
The numbers from 0 to 10 are listed in decimal, binary, and octal in the table below. 

Decimal | Binary | Octal
------- | ------ | -----
0 | 0 | 0
1 | 1 | 1
2 | 10 | 2
3 | 11 | 3
4 | 100 | 4
5 | 101 | 5
6 | 110 | 6
7 | 111 | 7
8 | 1000 | 10
9 | 1001 | 11
10 | 1010 | 12

# The Tasks

You will be asked to develop methods to:
* convert octal (base 8, stored as a `String`) to decimal (base 10, stored as an `int`) 
* convert from decimal to octal
* convert from binary (base 2, stored as a `String`) to octal (directly without going through decimal)
Just as we did in class you will create two new methods, this time in `convertOctal.java`.

## `octalStringToInt(String numString)`

Given an octal number as a `String` returns the value in decimal using recursion. 
This solution **must** use recursion.
If the string contains unacceptable characters (i.e. not 0-7) return `-9999`. 

## `intToOctalString(int numInt)`

Given an decimal number as an `int` returns the value in octal using recursion. 
This solution **must** use recursion. 

## `binaryStringToOctalString(String binString)`

Given a binary number as a `String` returns the value in octal using recursion. 
You cannot at any time represent the whole value in decimal, you should do directly from binary to octal. 
Remember that 3 binary digits correspond to 1 octal digit directly (you can see this in the table above). 
This solution **must** use recusion. 

## `main`

In a main method within `convertOctal.java` provide 14 tests that show your new methods satisfy all of the requirements. 
This can be done using print statements or built-in java assert statements (no need to use JUnit). 
Each test should be clearly labeled within the main method, 
and accompanied by text explaining the expected value for the test and why that test is included. 

# Grading

* `octalStringToInt` -- 20 pts
* `intToOctalString` -- 20 pts
* `binaryStringToOctalString` -- 30 pts
* `main` test cases -- 30 pts (2 pts each)

