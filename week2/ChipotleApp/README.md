# Chipotle Jr. Assignment, plus extra credit

## Overview
Write a program that will allow a robot to assemble 25 burritos. 

Use a random generator for each burrito option and build a list of 25 burrito customizations:

- Rice: white, brown, none, all
- Meat: chicken, steak, carnidas, chorizo, sofritas, veggies, none, all
- Beans: pinto, black, none
- Salsa: mild, medium, hot, none, all
- Veggies: lettuce, fajita veggies, none, all
- Cheese: yes/no
- Guac: yes/no
- Queso: yes/no
- Sour cream: yes/no

## Part 1: 
Randomly generate a number of ingredients per burrito.
Each burrito should have a minimum of 5 ingredients and a maximum of 9 ingredients. 
Save the finished burritos and display the contents.

Calculate and display a price for each burrito. 
Pricing will be $3.00 plus 0.50 for each additional ingredient.

## Part 2:
If you're finished with above before 5pm, modify your program to use methods. 
For example, you can call a method from main whose sole purpose is to calculate the price of the burrito.

### Sample Output (Your actual output may vary):
```
Burrito 1: no rice, carnidas, pinto beans, no salsa, lettuce, fajita veggies, cheese, queso, sour cream	 $6.50

Burrito 2: brown rice, sofritas, black beans, no salsa, no veggies, sour cream	 $5.00

Burrito 3: white rice, veggies, no beans, mild salsa, medium salsa, hot salsa, lettuce, fajita veggies, cheese, queso	 $7.50

Burrito 4: white rice, veggies, no beans, no salsa, lettuce, fajita veggies, guac	 $5.50

Burrito 5: white rice, carnidas, no beans, medium salsa, no veggies, cheese	 $5.00

Burrito 6: white rice, veggies, pinto beans, medium salsa, fajita veggies	 $5.50

Burrito 7: brown rice, chicken, no beans, no salsa, lettuce, fajita veggies, guac, queso, sour cream	 $6.50

Burrito 8: no rice, steak, pinto beans, hot salsa, fajita veggies, sour cream	 $5.50

Burrito 9: no rice, carnidas, black beans, mild salsa, medium salsa, hot salsa, no veggies, sour cream	 $6.00

Burrito 10: brown rice, chicken, black beans, no salsa, fajita veggies, queso	 $5.50

Burrito 11: brown rice, carnidas, no beans, mild salsa, fajita veggies, queso, sour cream	 $6.00

Burrito 12: brown rice, sofritas, black beans, hot salsa, fajita veggies, queso	 $6.00

Burrito 13: no rice, steak, no beans, mild salsa, medium salsa, hot salsa, no veggies, cheese, sour cream	 $6.00

Burrito 14: no rice, chicken, no beans, mild salsa, lettuce, guac, queso	 $5.50

Burrito 15: white rice, sofritas, no beans, medium salsa, no veggies, cheese	 $5.00

Burrito 16: no rice, steak, pinto beans, no salsa, no veggies, cheese, queso	 $5.00

Burrito 17: white rice, veggies, black beans, mild salsa, lettuce, fajita veggies, queso, sour cream	 $7.00

Burrito 18: white rice, chicken, pinto beans, medium salsa, no veggies, sour cream	 $5.50

Burrito 19: brown rice, chorizo, no beans, no salsa, fajita veggies, queso, sour cream	 $5.50

Burrito 20: no rice, steak, black beans, mild salsa, no veggies, sour cream	 $5.00

Burrito 21: brown rice, steak, no beans, mild salsa, lettuce, guac, sour cream	 $6.00

Burrito 22: white rice, carnidas, pinto beans, hot salsa, fajita veggies, sour cream	 $6.00

Burrito 23: no rice, chorizo, pinto beans, hot salsa, fajita veggies, cheese, sour cream	 $6.00

Burrito 24: brown rice, chorizo, pinto beans, hot salsa, no veggies, cheese, guac, queso, sour cream	 $7.00

Burrito 25: no rice, chicken, no beans, hot salsa, lettuce, fajita veggies, queso, sour cream	 $6.00
``` 

# Extra Credit Sections

## Part 3

Part three is to add all the ingredients you used for the order and print them out in one line. 
So your example is if you have 25 chicken burritos then you must say you used 25 chicken, 
25 black beans and so on. Of course your numbers will change because you have randomly generated 
burritos each time. 

The sample statement is below: 
```
This order has 11 white rice, 15 brown rice, 8 chicken,11 steak, 9 carnitas, 9 chorizo, 

 9 sofritas, 9 veggies(as meat option), 22 black beans, 16 pinto beans, 8 mild salsa, 7 med salsa, 9 hot salsa,  

14 fajitas, 16 lettuce, 11 cheese, 16 guac, 12 queso, 12 sour cream, and the sum is $94.5
```

## Part 4
Now if you have finished this, now for part 4 you must print out a receipt order for the burrito order 
like before , but wrap with with 50 characters so you must only let 50 characters print out.  

Sample below:
```
This order has 11 white rice, 15 brown rice, 8 chi
cken,11 steak, 9 carnitas, 9 chorizo, 9 sofritas, 
9 veggies(as meat option), 22 black beans, 16 pint
o beans, 8 mild salsa, 7 med salsa, 9 hot salsa, 1
4 fajitas, 16 lettuce, 11 cheese, 16 guac, 12 ques
o, 12 sour cream, and the sum is $94.5
``` 

## Part 5

Now if you finished this, for part 5 you must print out the receipt with 50 characters 
but the words must not break so if the words exceed 50 characters it must go onto the next line! 

Like below:
```
This order has 11 white rice, 15 brown rice, 8 
chicken,11 steak, 9 carnitas, 9 chorizo, 9 
sofritas, 9 veggies(as meat option), 22 black 
beans, 16 pinto beans, 8 mild salsa, 7 med salsa, 
9 hot salsa, 14 fajitas, 16 lettuce, 11 cheese, 16 
guac, 12 queso, 12 sour cream, and the sum is 
$94.50 
```