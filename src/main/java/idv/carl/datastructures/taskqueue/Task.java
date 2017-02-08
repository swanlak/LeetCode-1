package idv.carl.datastructures.taskqueue;

/**
 * @author Carl Lu
 */
public class Task {

    private Long id;
    private String taskName;

    public static Task getInstance() {
        return new Task();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

}
