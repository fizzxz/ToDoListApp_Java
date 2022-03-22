package taskList;

import static org.junit.Assert.*;
import task.Task;
import java.time.LocalDateTime;

import org.junit.Test;

public class TaskListTest {

   private LocalDateTime testTime = LocalDateTime.of(
        LocalDateTime.now().getYear(), 12, 31, 23, 59);

    @Test
    public void Create_TaskList_Of_Zero_Tasks(){
        TaskList newTaskList = new TaskList();
        assertEquals(0, newTaskList.listSize());
    }

    @Test
    public void Create_TaskList_Of_Single_Task(){
        TaskList newTaskList = new TaskList();

        //Local Date Time of(int year, int month, int dayOfMonth, int hour, int minute)
        Task newTask = Task.buildTask("Test Task", testTime, false);
        newTaskList.addTask(newTask);
        assertEquals(1, newTaskList.listSize());
    }

    @Test
    public void Create_TaskList_Of_Multiple_Tasks(){
        TaskList newTaskList = new TaskList();
        Task newTask = Task.buildTask("Test Task", testTime, false);
        newTaskList.addTask(newTask);
        Task newTask2= Task.buildTask("taskString", testTime, false);
        newTaskList.addTask(newTask2);

        assertEquals(2, newTaskList.listSize());
    }

    @Test
    public void Found_Task_In_TaskList_Of_Single_Task(){
        TaskList newTaskList = new TaskList();
        Task newTask = Task.buildTask("Test Task", testTime, false);
        newTaskList.addTask(newTask);
        assertEquals(newTask, newTaskList.findTask("Test Task"));
    }

}


