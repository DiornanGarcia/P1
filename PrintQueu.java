package Logico;
class PrintQueue {
    private MyQueue high = new MyQueue();
    private MyQueue medium = new MyQueue();
    private MyQueue low = new MyQueue();

    public void enqueue(PrintJob job) {
        switch (job.priority) {
            case 'H': high.enqueue(job); break;
            case 'M': medium.enqueue(job); break;
            case 'L': low.enqueue(job); break;
            default: medium.enqueue(job); // Prioridad por defecto
        }
    }

    public PrintJob dequeue() {
        if (!high.isEmpty()) return high.dequeue();
        if (!medium.isEmpty()) return medium.dequeue();
        if (!low.isEmpty()) return low.dequeue();
        return null;
    }

    public boolean isEmpty() {
        return high.isEmpty() && medium.isEmpty() && low.isEmpty();
    }
}