
import java.time.LocalDate;
import task.Task;
import taskList.TaskList;

public class App {
    public static void main(String args[]){
        TaskList taskList= new TaskList();

        LocalDate date = LocalDate.now();
        Task newTask= Task.buildTask("This is a Task", date, false);
        taskList.addTask(newTask);
        Task newTask2= Task.buildTask("taskString", date, false);
        taskList.addTask(newTask2);
        Task newTask3= Task.buildTask("taskString", date, false);
        taskList.addTask(newTask3);
        Task newTask4= Task.buildTask("taskString", date, false);
        taskList.addTask(newTask4);

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
