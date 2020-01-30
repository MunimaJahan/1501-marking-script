# LAB QUIZ 05 - (PettingZoo)

**WEIGHT: 4%**

You have **45 minutes** to complete this quiz.

You are free to use any resources you want, _with the exception of any other person, online or otherwise_.

The rubric for this quiz is provided at the bottom of this document.

## REQUIREMENTS

The `PettingZoo` class lets you create a petting zoo...full of llamas. Baby llamas and adult llamas. Adorable!

### Example

Here's an example of the use of a PettingZoo:

```java
// make a PettingZoo to hold those fuzzy spitting mammals
PettingZoo zoo = new PettingZoo();

// add Henry, a baby llama
Llama henry = new Llama("Henry");
zoo.add(henry);

// add Lizbeth, an adult llama - making her an adult takes an extra step...
Llama lizbeth = new Llama("Lizbeth");
lizbeth.growUp(); // they grow up so fast...
zoo.add(lizbeth);

ArrayList<Llama> adultLlamas = zoo.allAdults(); // should be an ArrayList with lizbeth in it

ArrayList<Llama> babyLlamas = zoo.allBabies(); // should be an ArrayList with henry in it

System.out.println(zoo); // prints "BABIES:[Henry (B)] ADULTS:[Lizbeth (A)]" to the console
```

### HINTS

- You've been provided with a Llama class. You should read it.
- Guess what's going to be used in the PettingZoo'**s** class' ArrayList....
- For-each loops are your friend. Yes...yes they are.
- The toString() needs some help from some of your other public methods...

### Details

The `PettingZoo` class needs to have 5 **public** methods:

1. **constructor**

   - Technically, this is optional, since it's a no-arg constructor. Your call.

1. **add(Llama)**

   - adds the given Llama to the PettingZoo.
   - make sure you put the incoming Llama at the end of your ArrayList, please.

1. **allBabies()**

   - returns an ArrayList of Llama objects that are babies.
   - if there are no such Llama objects, then returns an EMPTY ArrayList - NOT a null!

1. **allAdults()**

   - returns an ArrayList of Llama objects that are adults.
   - if there are no such Llama objects, then returns an EMPTY ArrayList - NOT a null!

1. **toString**

   - as shown in the Example above (and in the tests)

### NOTES

- if you wish to make any helper methods, declare them as **private** and **non-static**
- remember to save often and keep an eye on your tests and warnings
- you can use the Main provided to see if your code is behaving reasonably, or you can just rely on the automated tests. Or both.

---

## RUBRIC

### Grade: A range

- compiles
- all methods behave as expected
- follows all naming conventions (maybe with 1 or 2 minor slips)
- code is easy to read and understand because it is formatted nicely, everything is named expressively, and constants are used when appropriate

### Grade: B range

- this is like an A range, with more slips in convention, or perhaps is noticeably (but not significantly) harder to read/understand because of formatting/naming issues

### Grade: C range

- doesn't compile, but the instructor can tell that the methods present would work correctly, if not for some minor syntax issue; otherwise, everything else is at a B range
- you will also get a C range if the code compiles and behaves as expected, but frequent slips in convention/formatting/naming make the code confusing and hard to follow

### Grade: D

- like a C range, but the instructor can see that numerous methods are incomplete or off-base

### Grade: F

- no attempt, or the code present is wildly incorrect
