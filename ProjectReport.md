# Project Report
Dotty Horsman

## Challenge #1 Complete
This challenge only required one line of code in QueryEngineModule 
to be slightly changed. Now the Guice config uses WikipediaQueryEngine
instead of FakeQueryEngine.

## Challenge #2 Complete
In this challenge, I added the same design pattern shown in the 
Query classes to the RevisionFormatter classes which included:  

creating these classes
- RevisionFormatterModule
- RevisionFormatterInterface

and editing these classes to comply with the new code
- App
- RevisionFormatter
- WikipediaAnalyzer

Subsequently, I made the BetterRevisionFormatter class to format the 
revisions to be more readable. It might be a little long, but I think it looks nice.

Old Version Example
- At 2013-05-19T20:53:42Z, a change by Bossanoven

My Version Example
- On Sunday, May 19, 2013 at 8:53 PM (42 secs): a change by Bossanoven


## Challenge #3 Complete
In this challenge, I replaced the for-loop responsible for appending each 
revision to the textarea in WikipediaAnalyzer with a stream() call
using map() and collect() as well. Initially, I thought a Stream<Revision> 
object with a toString method would be needed to be accepted by 
outputArea.setText(). However, I ended up combining the stream() call 
with outputArea.setText() to fit in one line.


## Reflection Question #1: Functional vs OO
When it comes to string concatenations (like the ones in challenge 3), I mainly prefer 
iterative approaches. I am a lot less familiar with functional approaches than I am with OO
as opposed to functional ones purely because I am more familiar with them. I recognize that 
functional is better usually the better option in the long-run with larger programs, so 
that they have a better overall performance. I just have a hard time with the syntax of 
after working with OO structures that are normally less efficient. 

## Reflection Question #2: Polymorphism and Dependency Inversion
The RevisionFormatter and QueryEngine classes use Polymorphism with the 
respective interfaces that they implement. This engendered 
dependency inversion by keeping the ties between these classes abstract. 
After the design model of dependency was set in place, these classes could 
potentially be replaced with any similar kind of class without affecting
the rest of the program (much like how RevisionFormatter was replaced by
BetterRevisionFormatter) which is the core of dependency inversion.


