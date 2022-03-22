package taskList;

import java.util.ArrayList;
import javax.management.RuntimeErrorException;
import task.Task;

public class TaskList {

    private  ArrayList<Task> toDoList;

    public TaskList() {
        toDoList = new ArrayList<Task>();
    }

    public void addTask(Task task) {
        toDoList.add(task);
    }

    public Task findTask(String taskString) {
        try { 
            Task taskFind= toDoList.stream()
            .filter(Task -> 
            taskString.equals(Task.getTaskString()))
            .findAny()
            .orElseThrow(() -> 
            new RuntimeErrorException(null,
             "Invalid Task Name"));
        
            if (taskFind == null){
                throw new NullPointerException();
            }else{
                return taskFind;
            }
            
        } catch (Exception e) {
            System.out.println("Task could not be found with"
            + " provided string argument:" + taskString);
        }
        return null;
        
         
    }

    public void removeTask(String taskString) {
        Task taskVal = findTask(taskString);
        if (taskVal != null) {
            toDoList.remove(taskVal);
        }
    }

    public void renameTask(String oldTaskNameString, 
    String newTaskNameString) {
        Task taskObj = findTask(oldTaskNameString);
         taskObj.setTask(newTaskNameString);
    }

    public void toggleCompleteTask(String taskNameString) {
        Task taskObj = findTask(taskNameString);
        if( taskObj.getStatusBoolean() == true){
            taskObj.setStatus(false);
        }
        else taskObj.setStatus(true);
        
    }

    public void rescheduleTask() {

    }

    public int listSize(){
        return toDoList.size();
    }

    public void printOutTasks(){
        if(toDoList.size()>0){
            toDoList.forEach(Task -> 
            System.out.println(Task.toString()));
        }
        else{
            System.out.println("no tasks inside the list");
        }
    }

}
