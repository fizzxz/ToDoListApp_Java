package taskList;

import static org.junit.Assert.*;
import task.Task;
import java.time.LocalDate;
import org.junit.Test;

public class TaskListTest {

    @Test
    public void Create_TaskList_Of_Zero_Task(){
        TaskList newTaskList = new TaskList();
        assertEquals(0, newTaskList.listSize());
    }

    @Test
    public void Create_TaskList_Of_Single_Task(){
        TaskList newTaskList = new TaskList();
        Task newTask = Task.buildTask("taskString", LocalDate.now(), false);
        newTaskList.addTask(newTask);
        assertEquals(1, newTaskList.listSize());
    }

}


