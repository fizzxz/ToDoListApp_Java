package taskList;

import static org.junit.Assert.*;

import task.Task;
import java.time.LocalDateTime;

import org.junit.Test;

public class TaskListTest {

    private LocalDateTime testTime = LocalDateTime.of(
        LocalDateTime.now().getYear(), 12, 31, 23, 59);
    private String testTaskStr="Test Task";
    private String testTaskStr2="Test Task 2";
    private String testTaskStr3="Test Task 3";
    private String testTaskStr4="Test Task 4";

    private TaskList testTaskList = new TaskList();
    
    private Task testTask = Task.buildTask(testTaskStr, testTime, false);
    private Task testTask2= Task.buildTask(testTaskStr2, testTime, false);
    private Task testTask3= Task.buildTask(testTaskStr3, testTime, false);
    private Task testTask4= Task.buildTask(testTaskStr4, testTime, false);

    @Test
    public void Create_TaskList_Of_Zero_Tasks(){
        assertEquals(0, testTaskList.listSize());
    }

    @Test
    public void Create_TaskList_Of_Single_Task(){
        //Local Date Time of(int year, int month, int dayOfMonth, int hour, int minute)
        testTaskList.addTask(testTask);
        assertEquals(1, testTaskList.listSize());
    }

    @Test
    public void Create_TaskList_Of_Multiple_Tasks(){
        testTaskList.addTask(testTask);
        testTaskList.addTask(testTask2);
        assertEquals(2, testTaskList.listSize());
    }

    @Test
    public void Task_Found_In_TaskList_Of_Single_Task(){
        testTaskList.addTask(testTask);
        assertEquals(testTask, testTaskList.findTask(testTaskStr));
    }

    @Test
    public void Task_Not_Found_In_TaskList_Of_Single_Task(){
        testTaskList.addTask(testTask);
        assertEquals(null, testTaskList.findTask(testTaskStr2));
    }

    @Test
    public void Multiple_Tasks_Found_In_TaskList_Of_Multiple_Tasks(){
        TaskList testTaskList_MultipleTask2= new TaskList();
        testTaskList_MultipleTask2.addTask(testTask2);
        testTaskList_MultipleTask2.addTask(testTask2);
        testTaskList.addTask(testTask);
        testTaskList.addTask(testTask2);
        testTaskList.addTask(testTask2);
        testTaskList.addTask(testTask3);
        testTaskList.addTask(testTask4);
        assertEquals(testTaskList_MultipleTask2.listSize(),
         testTaskList.findMultipleTasks(testTaskStr2).listSize());
    }
}
