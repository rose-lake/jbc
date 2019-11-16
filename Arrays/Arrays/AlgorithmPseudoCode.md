# Array Processing pseudo-code assignment

## Algorithm 1: Find the sum of the elements of an array
INPUT: array object. assume it is an array of double. assume the length is unknown.
OUTPUT: a double representing the sum.
PROCESS:

Given: double[] arrayDouble = {a, b, c, d, ..., n}   ::  an array of double values of length "n"

Process:
```
    initialize double sum = 0.0
    FOR EACH ELEMENT in arrayDouble     ::  can do this using a for loop with counter [0,n) incremented by 1.
        add ELEMENT to sum, modifying sum in the process.
    ENDFOR
```    
Output: display the sum.


## Algorithm 2: Find the mean of the elements of an array
INPUT: array object. assume it is an array of double. assume the length is unknown.
OUTPUT: a double representing the mean.
PROCESS:

Given: double[] arrayDouble = {a, b, c, d, ..., n}   ::  an array of double values of length "n"

Process:
```
    initialize double sum = 0.0
    declare double average
    FOR EACH ELEMENT in arrayDouble     ::  use a for loop with counter [0,n) incremeted by 1.
        add ELEMENT to sum.
    ENDFOR
    set average equal to sum divided by n.
```
Output: display the average.

## Structure Theorem Notes
A solution can be derived from three constructs:
1. Sequence: a sequence of steps or actions
2. Selection: choice of an action based on a condition
3. Repetition: a sequence to be repeated as long as a condition is true.
