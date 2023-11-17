package bonus_hw_2;

public class AddTaskAction extends Task implements TaskAction{

Task task;
    public AddTaskAction(String taskName, String descriptionOfTheTask, String priority, String deadline, String status) {
        super(taskName, descriptionOfTheTask, priority, deadline, status);
    }


    @Override
    public void perform() {

Task task =new Task(taskName,descriptionOfTheTask, priority, deadline, status);
    }
}
