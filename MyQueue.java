package Logico;
class MyQueue {
    private Node front, rear;

    public void enqueue(PrintJob job) {
        Node newNode = new Node(job);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;

        rear = newNode;
    }

    public PrintJob dequeue() {
        if (isEmpty()) return null;

        PrintJob job = front.job;
        front = front.next;
        if (front == null) rear = null;
        return job;
    }

    public boolean isEmpty() {
        return front == null;
    }
}