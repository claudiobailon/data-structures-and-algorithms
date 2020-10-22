package datastructures.stacksandqueues;

public class PsuedoQueue {
    Stack inputStack = new Stack();
    Stack outputStack = new Stack();

    public void enqueue(int value) {
        inputStack.push(value);//pushes value to the top of the inputStack
    }

    public int dequeue() throws NullPointerException {
        try {
            return outputStack.pop();//pops outputStack if not empty
        } catch (NullPointerException e) {
            loadStack();//loads outputStack if it is empty
            return outputStack.pop();
        }

    }

    public void loadStack() throws NullPointerException {
        try {
            while (inputStack != null) {
                outputStack.push(inputStack.pop());//this pops of the top of the input stack into the output stack, effectively turning the outputStack into the queue of what has been put in the inputStack
            }
        } catch (NullPointerException e) {//returns exception if inputStack is empty

        }
    }
}
