package Logico;

public class PrintProject {
    private string user;
    private int paginas;
    private char priority

    public PrintProject(string user, int paginas, char priority) {
        this.user = user;
        this.paginas = paginas;
        this.priority = priority;
    }
    @Override
    public String toString() {
        return "Trabajo de Usuario:" + user + ", Páginas: " + pages + ", Prioridad: " + priority + ;
    }
}
