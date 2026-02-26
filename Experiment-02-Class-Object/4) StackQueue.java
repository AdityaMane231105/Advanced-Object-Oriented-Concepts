class StackQueue {
    int top = -1;
    int[] stack = new int[5];
    int front = 0, rear = -1;
    int[] queue = new int[5];

    void push(int x) {
        stack[++top] = x;
    }

    int pop() {
        return stack[top--];
    }

    void enqueue(int x) {
        queue[++rear] = x;
    }

    int dequeue() {
        return queue[front++];
    }

    public static void main(String[] args) {
        StackQueue obj = new StackQueue();

        obj.push(10);
        obj.push(20);
        System.out.println(obj.pop());

        obj.enqueue(30);
        obj.enqueue(40);
        System.out.println(obj.dequeue());
    }
}
