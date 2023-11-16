package bonus_hw_2;

public class Task implements TaskAction{
    String taskName;
    String descriptionOfTheTask;
    String priority;
    String deadline;
    String status;

    public Task(String taskName, String descriptionOfTheTask, String priority, String deadline, String status) {
        this.taskName = taskName;
        this.descriptionOfTheTask = descriptionOfTheTask;
        this.priority = priority;
        this.deadline = deadline;
        this.status = status;
    }

    @Override
    public void perform() {

    }
}
