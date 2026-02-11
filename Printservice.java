package Logico;
public class Printservice {
    private PrintQueue queue = new PrintQueue();

    public void submitJob(PrintJob job) {
        queue.enqueue(job);
        System.out.println("En cola: "+ job.user +"Prioridad:" + job.priority+);
    }
    public void processNext() {
        PrintJob job = queue.dequeue();
        if (job != null) {
            System.out.println("Imprimiendo:" + job);
        } else {
            System.out.println("no hay impresiones");
        }
    }
}