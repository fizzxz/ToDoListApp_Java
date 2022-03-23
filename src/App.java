
import java.time.LocalDateTime;
import task.Task;
import taskList.TaskList;

public class App {
    public static void main(String args[]){
        TaskList taskList= new TaskList();

        LocalDateTime date = LocalDateTime.now().plusHours(10);
        Task newTask= Task.buildTask("This is a Task", date, false);
        taskList.addTask(newTask);
     

        if(taskList.findTask("taskString")==null){
            Task taskNotFound=Task.buildTask("", date, false);
            taskList.addTask(taskNotFound);
        }else{
            System.out.println(taskList.findTask("taskString").toString());
            System.out.println(taskList.listSize());
            taskList.printOutTasks();
        }   
             
    }
}
