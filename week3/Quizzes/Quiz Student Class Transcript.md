# Quiz : Wednesday November 6th, 2019

## Assignment:
Write pseudo-code to build a transcript of 5 students 
where each student takes "several" courses

Create a Student class and Course class where:
- a student takes several courses
- a course has information and student's grade

Print out transcript of all students

You may pre-load data


## The Pseudo-Code

NOTE: I also created a Grade class. See below. 

It's maybe not super-great, memory-wise, what it does, 
because the way I use it I'm always creating new Grade objects.

However, I really wanted the freedom to generate *generic* courses 
and then be able to easily set these courses to an initialized per-student value using constructors. 

This is how I did it.


### Class Main.java

#### method public static void main

// initialize data. note: I know this is very CODE-y, and not pseudo-code-y, 
// but I wanted to be extra clear regarding my use of partially overloaded constructors.
Course dataAnalytics = new Course("data analytics", "here we learn data stuff", new Grade("TBD"));
Course javaBootCamp = new Course("java boot camp", "learn java and stuff", new Grade("TBD"));
Course algebra = new Course("algebra", "basic math stuff", new Grade("TBD");
Course publicSpeaking = new Course("public speaking", "we talk!", new Grade("TBD");

// initialize joe
ArrayList<Course> joeCourses = new ArrayList<>();
Collections.addAll(joeCourses, dataAnalytics.setGrade(98.9), javaBootCamp.setGrade(76.5));
Student joe = new Student("joe", joeCourses);

// initialize dylan
ArrayList<Course> dylanCourses = new ArrayList<>();
Collections.addAll(dylanCourses, algebra.setGrade(78.0), publicSpeaking.setGrade(88.5), dataAnalytics.setGrade("W"));
Student dylan = new Student("dylan", dylanCourses);

// initialize mohammed
ArrayList<Course> mohammedCourses = new ArrayList<>();
Collections.addAll(mohammedCourses, dataAnalytics.setGrade(99.0), publicSpeaking.setGrade("TBD"));
Student mohammed = new Student("mohammed", mohammedCourses);

// initialize nancy 
ArrayList<Course> nancyCourses = new ArrayList<>();
Collections.addAll(nancyCourses, javaBootCamp.setGrade("I"), publicSpeaking.setGrade(86.7));
Student nancy = new Student("nancy", nancyCourses);

// initialize gema
ArrayList<Course> gemaCourses = new ArrayList<>();
Collections.addAll(gemaCourses, dataAnalytics.setGrade(88.8), publicSpeaking.setGrade(86.7), algebra.setGrade(78.0));
Student gema = new Student("gema", gemaCourses);

// make array list of all students:
ArrayList<Students> allStudents = new ArrayList<Students>();
Collections.addAll(allStudents, joe, dylan, mohammed, nancy, gema);

// print out the transcripts!
for(Student s : allStudents)
	sout: Here is the transcript for student + student.getName()
	sout: s.displayStudent();
	sout: a new line to create spacing between each student's transcript

// exit cleanly
sout: Goodbye!


### Class Student.java

private class-level fields:
- String name
- ArrayList <Course> courses

public default constructor: empty

public fully overloaded constructor: 
- parameters: String name, ArrayList<Course> courses
- sets this.name and this.courses to passed in name and courses

public getters and setters for this.name and this.courses 

**public void method addCourse(Course newCourse)**
- adds passed-in course to this.courses 

**public String method displayStudent()**
- returns String 
- Initializes local String to ""
- Builds local String through += to be equal to...
-- "Student: " + this.name + "\nCourses:\n" + 
-- for each course in this.courses, 
--- call (and concatenate onto our local string) course.displayCourse()
-- return the String we built!


### Class Course.java
This class is intended to be used in such a way that it is always used inside of a Student class. 
A course object should always "belong" to a Student object, via composition.

private class-level fields:
- String name
- String description
- Grade grade;

public default constructor: empty

public partially overloaded constructor:
- parameters: String name, String description
- set this.name and this.description to passed in name and description
- sets grade equal to new Grade("TBD") using its partially overloaded constructor

public fully overloaded constructor:
- parameters: String name, String description, Grade grade
- sets this.name, this.description, and this.grade to the passed-in values.

**public void setGrade(double numGrade) method**
- creates a new Grade object using Grade(numGrade) constructor.
- sets this.grade equal to that new Grade object

**public void setGrade(String specialCode) method**
- creates a new Grade object using Grade(specialCode) constructor.
- sets this.grade equal to that new Grade object

**public String method displayCourse()**
- returns String
- Initializes local String to ""
- Builds local String through += to be equal to...
-- "\tCourse: " + name + "\n\tDescription: " + description + "\n\tGrade: " + grade.displayGrade()
-- returns the local String we built!


### Class Grade.java

private class-level fields:
- double numGrade;
- String letterGradeOrCode;

public default constructor: empty

public partially overloaded **constructor**: 
- **ONE parameter: String specialCode**
- sets this.letterGradeOrCode equal to specialCode
This constructor is used for initializing the Grade or for special cases. 
When initializing, use **specialCode "TBD"**
For other special cases, use **specialCode "I"** for incomplete or **specialCode "W"** for student withdrew from the course.
This constructor does not set this.numGrade to anything; 
Whatever default value was in this.numGrade to start (on declaration) is fine, 
as we should always check this.letterGradeOrCode first for any special code 
before looking at or using the value in Grade.numGrade.

public partially overloaded **constructor**:
- **ONE parameter: double numGrade**
- sets this.numGrade to passed in numGrade
- sets this.letterGradeOrCode to corresponding (hard-coded in this constructor) letter grade. 

NOTE: 
this class *will not have a fully overloaded constructor*, 
so that the logic for translating a numerical grade value into a letter grade value 
can be controlled by the class!

public getters and setters for both numGrade and letterGradeOrCode.

** public String method displayGrade()**
- returns String
- Initializes local String to ""
- Builds local String through += to be equal to...
-- IF letterGradeOrCode == "W" || letterGradeOrCode == "I" || letterGradeOrCode == "TBD" 
--- only add this.letterGradeOrCode to our local String.
-- ELSE 
--- add this.letterGradeOrCode to our local String, then add "(" + this.numGrade + ")" as well :)
-- RETURN the local String

## Feedback
The way I've created and referenced my objects in main won't work. 
Local copies of the courses are not created when the course is passed in to the Student object constructor.
So, simply pick up the initialization code for each course, and paste it into each Student's initialization code.
This will result in a series of nested "new" calls, and that's fine.
That would be one way to do it, given we are hardcoding all these details...

## A Hopeful Note regarding memory resources !
To access a field, you can use a named reference to an object, or you can use any expression that returns an object reference. 
Recall that the new operator returns a reference to an object. 
So you could use the value returned from new to access a new object's fields:
`int height = new Rectangle().height;`
This statement creates a new Rectangle object and immediately gets its height. 
In essence, the statement calculates the default height of a Rectangle. 

Note that after this statement has been executed, 
**the program no longer has a reference to the created Rectangle, because the program never stored the reference anywhere.**
**The object is unreferenced, and *its resources are free to be recycled by the Java Virtual Machine.***
source: https://docs.oracle.com/javase/tutorial/java/javaOO/usingobject.html , emphasis mine.

So, doing the constructors as suggested (in feedback) 
is actually even better, memory-wise, because it leaves those **local** resources free... !

It avoids the pitfall of creating extra layers of locally reserved/allocated resources in Main! :) 

