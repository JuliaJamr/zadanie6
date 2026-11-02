public class Task {
    private final String id;
    private final int executionTime; // w milisekundach
    public Task(String id, int executionTime) {
        this.id = id;
        this.executionTime = executionTime;
    }
    public String getId() { return id; }
    public int getExecutionTime() { return executionTime; }
}
