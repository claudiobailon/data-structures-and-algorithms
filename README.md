# Table of Contents
[Challenge 01: Reverse an Array](#reverse-an-array)<br>
[Challenge 02: Array Shift](#array-shift)<br>
[Challenge 03: Binary Search](#binary-search)<br>
[Challenge 05: Linked-List](#singly-linked-list)<br>
[Challenge 06: Linked-List Part Two](#linked-list-part-two) <br>
[Challenge 07: Linked-List Part Three](#linked-list-part-three) <br>
[Challenge 08: Linked-List zipList](#linked-list-zipList) <br>
[Challenge 10: Stacks and Queues](#stacks-and-queues) <br>
[Challenge 11: Queue with Stacks](#queue-with-stacks) <br>
[Challenge 12: Animal Shelter](#animal-shelter) <br>
[Challenge 13: Multi Bracket Validation](#multi-bracket-validation) <br>






## Reverse an Array
This method will reverse the order of a given array.
### Challenge
Write a function called reverseArray that takes in an Array as an argument and returns that array in reversed order
### Approach & Efficiency
I wrote a for loop that ran half the length of the array and swapped the indexes of of the first element with the last, the second with the second to last, and so on until the array is in reverse order. 
### Solution

## Array Shift
This method will add a value to the middle of any given array.
### Challenge
Write a function called arrayShift that takes in an array and an int as an argument and returns an array with the int added to the array in the middle index.
### Approach & Efficiency
Time: O(n)<br>
Space O(n)
### Solution
![Whiteboard](challenges/src/test/resources/whitboard.png)

## Binary Search
This method will check to see if a value is in any given array.
### Challenge
Write a function called binarySearch that performs a search to see if a value is in an array. If there is, it returns the index of that value, if not, it returns -1.
### Approach & Efficiency
Time: O(n)<br>
Space O(n)
### Solution
![Whiteboard](challenges/src/test/resources/lab02whiteboard.png)

## Singly Linked List
This method will create a linked list 

### Challenge
Write a class called linkedList that contains methods to insert values into the linked list, see if a value is included in the linked list, and to stringify the list.
### Approach and Efficiency
Insert:
Time: O(1)<br>
Space O(n)
Includes:
Time: O(n)<br>
Space O(1)
toString:
Time: O(n)<br>
Space O(n)
### API
LinkedList methods:
#### Insert
This method takes in an integer and creates a node with that interger as it's value and sets that node to the head of the linked list.
#### toString
This method returns a string showing the linked list
#### Includes
This method takes in an integer and checks all node values, returning true if that value is found and false if not.

## Linked List Part Two
This is an expansion of methods on the previous linked list.

### Challenge
Write three new methods.  One called append that takes in an integer and appends it to the linked list, one called insertBefore that takes in two integers and searches the linked list for the value of the first int and prepends the node with a node with the value of the second int, and finally, one called insertAfter that takes in two integers and searches the linked list for a node with the value of the first int then appends that node with a node that has a value of the second int. 
### Approach and Efficiency
Append:
Time: O(1)<br>
Space O(n)
InsertBefore:
Time: O(n)<br>
Space O(1)
InsertAfter:
Time: O(n)<br>
Space O(1)
### Solution
![Whiteboard](challenges/src/test/resources/06whiteboard.png)

## Linked List Part Three
This adds the llKthFromTheEnd method. 

### Challenge
Write a new method that takes in k and returns the value of the kth from the end node of a linked list.
### Approach and Efficiency
Time: O(n)<br>
Space O(1)

### Solution
![Whiteboard](challenges/src/test/resources/lab07whiteboard.png)

## Linked List zipList
This adds the zipList method to LinkedList

### Challenge
Write a new method that takes in two linkedlists and zips them together.
### Approach and Efficiency
Time: O(n)<br>
Space O(1)

### Solution
![Whiteboard](challenges/src/test/resources/08whiteboard.png)

## Stacks and Queues
This creates and Stack class and Queue class

### Challenge
Write new classes called Stack, Queue, and Node.  Stack should use Nodes that creates an order that is FILO(first in last out), and queue create an order that is FIFO(first in first out). They both should have methods that add, remove, peek at first value, and check to see if they are empty.
### Approach and Efficiency
Stack Methods:<br>
push():
- Time: O(1)<br>
- Space O(1)<br>
pop():
- Time: O(1)<br>
- Space O(1)<br>
peek():
- Time: O(1)<br>
- Space O(1)<br>
isEmpty():
- Time: O(1)<br>
- Space O(1)<br>
Queue Methods:<br>
enqueue():
- Time: O(1)<br>
- Space O(1)<br>
dequeue():
- Time: O(1)<br>
- Space O(1)<br>
peek():
- Time: O(1)<br>
- Space O(1)<br>
isEmpty():
- Time: O(1)<br>
- Space O(1)<br>

### API
#### Stack Methods:
push(): Takes in an integer and adds it to the top of the stack.<br>
pop(): Removes the top node from the stack and returns it's value.<br>
peek(): Returns the value of the top node.<br>
isEmpty(): Checks if stack is empty.  Returns true if it is and false if it is not.<br>
#### Queue Methods
enqueue(): Takes in an integer and adds it to the back of the queue.<br>
dequeue(): Removes the front node from the queue and returns it's value.<br>
peek(): Returns the value of the front node.<br>
isEmpty(): Checks if queue is empty. Returns true if it is and false if it's not.<br>

## Queue with Stacks
Create a queue class using two stacks

### Challenge
Create a new queue class called PseudoQueue that uses two stacks to create a queue instead of nodes. Create enqueue and dequeue methods.
### Approach and Efficiency
enqueue():<br>
- Time: O(1)<br>
- Space: O(1)<br>

dequeue():<br>
- Time: O(n)<br>
- Space: O(1)<br>

### Solution
![Whiteboard](challenges/src/test/resources/11whiteboard.png)

## Animal Shelter
This creates an Animal Shelter queue made up of Cats and Dogs. 

### Challenge
Create a class called AnimalShelter that creates a queue of Dogs and Cats.  An enqueue method should allow you to add an animal to the queue.  The dequeue method should return an animal of the preferred type, either cat or dog.
### Approach and Efficiency
enqueue():<br>
- Time: O(1)<br>
- Space: O(1)<br>

dequeue():<br>
- Time: O(n)<br>
- Space: O(1)<br>

### Solution
![Whiteboard](challenges/src/test/resources/12whiteboard.png)

## Multi Bracket Validation
This creates a method to check if a string contains balanced brackets. 

### Challenge
Create a method called multiBracketValidation that takes in a string and checks to see if the brackets inside of it are balanced. This includes round, square, and curly brackets and can contain chars other than brackets.  

### Approach and Efficiency
multiBracketValidation():<br>
- Time: O(n)<br>
- Space: O(n)<br>

### Solution
![Whiteboard](challenges/src/test/resources/13whitboard.png)