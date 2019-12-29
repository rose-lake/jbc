# String vs StringBuilder / StringBuffer

This is demo code that times performing the same task for the three different types of strings.

The recommendation is to use StringBuilder or StringBuffer when you expect to be modifying the string a lot.

Also, caveat that **StringBuffer** is **safer** for **multi-threaded** applications.
