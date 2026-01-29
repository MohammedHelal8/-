package Assignment_2;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // تطبيق Question 1: Reverse a string using Stack
        String text = "DataStructure";
        String reversed = Assignment2.reverseString(text);
        System.out.println("Q1 Result: " + reversed);

        // تطبيق Question 2: Sort a stack using another stack
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        Stack<Integer> sortedStack = Assignment2.sortStack(stack);
        System.out.println("Q2 Result: " + sortedStack);

        // تطبيق Question 3: Reverse the order of elements in a queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        Assignment2.reverseQueue(queue);
        System.out.println("Q3 Result: " + queue);

        // تطبيق Question 4: Priority Queue (smallest element dequeued first)
        Assignment2.MyPriorityQueue pq = new Assignment2.MyPriorityQueue();
        pq.enqueue(5);
        pq.enqueue(1);
        pq.enqueue(3);
        pq.enqueue(2);

        System.out.println("Q4 Result:");
        while (true) {
            Integer value = pq.dequeue();
            if (value == null) break;
            System.out.print(value + " ");
        }
        System.out.println();

        // تطبيق Question 5: Merge two sorted queues
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(3);
        q1.add(5);

        Queue<Integer> q2 = new LinkedList<>();
        q2.add(2);
        q2.add(4);
        q2.add(6);

        Queue<Integer> mergedQueue = Assignment2.mergeQueues(q1, q2);
        System.out.println("Q5 Result: " + mergedQueue);
    }

}

