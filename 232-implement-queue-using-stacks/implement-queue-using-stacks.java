class MyQueue {
    int[] arr;
    int size;
    int rear;

    public MyQueue() {
        size = 1000;
        arr = new int[size];
        rear = -1;
    }

    public MyQueue(int x) {
        size = x;
        arr = new int[size];
        rear = -1;
    }

    public void push(int x) {
        if (rear == size - 1) {
            return;
        }
        arr[++rear] = x;
    }

    public int pop() {
        if (empty()) {
            return -1;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return front;
    }

    public int peek() {
        if (empty()) {
            return -1;
        }
        return arr[0];
    }

    public boolean empty() {
        return rear == -1;
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */