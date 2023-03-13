Name: Shreyas Rai
PRN: 21070126088
Batch: AIML B1

OS: Mac OS 12 Monterey
java Version: 19.0.1 2022-10-18
Java(TM) SE Runtime Environment (build 19.0.1+10-21)
Java HotSpot(TM) 64-Bit Server VM (build 19.0.1+10-21, mixed mode, sharing)

Title: PIJ Lab Assignment-2

Problem Statement:
W.a.p that declares two arrays named ‘even’ and ‘odd’. Accept
numbers from the user and move them to respective arrays depending on
whether they are even or odd.

The java program consists of 3 distinct classes, i.e. Main.java, Sort.java & Output.java.

1.Main.java:

psvm in Main class contains the object declaration of the Sort and Output classes.
It contains the call to the sorter method of Sort class using the Sort class object.
The to print the sorted arrays it calls the printSortedArrays method of the Output class to print the sorted arrays.

2.Sort.java:

The Sort class contains the sorter method that takes and input array and sorts the elements into two arrays even and odd
based on the remainder obtained when dividing the elment by two.
It then returns the sorted arrays and the variables storing the size of these arrays
into a 2 dimensional.

3.Output.java

Output class contains the printSortedArrays method that takes input the two dimensional array returned from the Sort class's sorter method,
it reads the sorted arrays and count variables and then prints the sorted arrays elements using for loop.


Functions from both the Sort class and Output class are called in the psvm function using the objects of their respective classes.
