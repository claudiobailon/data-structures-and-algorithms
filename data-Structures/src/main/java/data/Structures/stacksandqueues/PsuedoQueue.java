package data.Structures.stacksandqueues;

public class PsuedoQueue {
    Stack inputStack = new Stack();
    Stack outputStack = new Stack();

    public void enqueue(int value){
        inputStack.push(value);//pushes value to the top of the inputStack
    }

    public int dequeue() throws NullPointerException{
        if (inputStack == null && outputStack == null)throw new NullPointerException();//throws exception if both stacks are empty
        while(inputStack != null){
            outputStack.push(inputStack.pop());
        }
        return outputStack.pop();
    }
}
