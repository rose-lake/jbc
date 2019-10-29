# Intermediate Eliza Application

You will continue creating an interactive chat-bot type program. 
Eliza is a therapist program that interacts with the user. 
Your program will need to evaluate what the user asks 
and turn the user's input into a question that sounds like the therapist really cares.

Use `HashMaps` or `String[]` arrays to loop through user's input and implement the following:

### Replacements:
- replace i with you
- replace me with you
- replace my with your
- replace am with are

We will continue to build on top of this application throughout the week. 

### Here's how the replacement works:
The user enters something at the prompt: "my teacher hates me"

The program will loop through that string and replace 
- "my" with "your" and 
- "me" with "you" and 
- then prepend the qualifier "Why do you say that" to the replacement string. 

So, `my teacher hates me` becomes `"Why do you say that your teacher hates you?"` 

The **replacement method** _returns_ the same words as the user entered only the replacement words have been swapped.

### Hints:
Spend some time thinking how you would search through a string and replacing specific words. 

Read about the split operator.

```java
public class SplitExample{

     public static void main(String []args){
      String Str = new String("I really like this Java course");
      System.out.println("Return Value :" );      
      
      for (String retval: Str.split(" ")) {
         System.out.println(retval);
      }
     }
}
```

#### Example output:
```
Good day. What is your problem? Enter your response here or Q to quit: my teacher hates me
your teacher hates you
Enter your response here or Q to quit: i dont know what's wrong
you dont know what's wrong
Enter your response here or Q to quit: i am feeling great
you are feeling great
```
