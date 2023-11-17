package bonus_hw_2;

public class CompleteTaskAction extends Task implements TaskAction{


    public CompleteTaskAction(String taskName, String descriptionOfTheTask, String priority, String deadline, String status) {
        super(taskName, descriptionOfTheTask, priority, deadline, status);
    }
  public void  changeOfStatus(){
        this.status="Выполнена";
  };
    @Override
    public void perform() {
        changeOfStatus();
    }
}
