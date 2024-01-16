 # To execute any of the classes, clone the repo to your PC, change directory to location of the class you want to execute.
    - Run below command where Example.java is the name of the class you want to run
    javac Example.java

# CodilityTests
 ## Binary Gap:
- Description from Codility
    A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

    For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

    Write a function:

    class Solution { public int solution(int N); }

    that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

    For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

    Write an efficient algorithm for the following assumptions:

    N is an integer within the range [1..2,147,483,647].
    Copyright 2009–2024 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
    ## Algorithm
    ### Problem Statement:
    - Given that the binary gap is the number of zeros between one bits; find the Max Binary Gap.
    ### Input: Unsigned integers
    ### Output: 
    - Max Binary Gap.
    ### Solution: Given above problem, the max binary gap is therefore the largest size between two 1 bits that encloses the zeros
    ## Steps:
   
    - 1. To achieve this, there are two effective options; one needs an iterable data type or method implementation and the second one just makes use of java bitwise operations
    - 2. Going with the iterable operations, Strings are not iterable by design but using .length method the characters in a string becomes a sequence which can be iterated; we will work with a String.
    - 3. We will need to maitain the position of each 1 bit, we will use an ArrayList for this (this is just by preference from the wide range of data structures available to us).
    - 4. Lastly, we will apply logic to check for position of 1 bits, sum of zeros between the 1 bits and finally the maximum of such an occurence.

   