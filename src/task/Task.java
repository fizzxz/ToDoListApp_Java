package task;

import java.time.LocalDateTime;

public class Task {
    String taskStr;
    LocalDateTime dueDateLDTime;
    // String reminderStr;
    // String repeatableStr;
    // String categoryStr;
    boolean statusBool;

    public String getTaskString() {
        return taskStr;
    }

    public LocalDateTime getDueDateString() {
        return dueDateLDTime;
    }

    public boolean getStatusBoolean() {
        return statusBool;
    }

    public void setTask(String taskString) {
        this.taskStr = taskString;
    }

    public void setDueDate(LocalDateTime dueDateLDTimeInputVal) {
        //date and time can be set any time after 12am for the devices current date
        if(dueDateLDTimeInputVal.isAfter(LocalDateTime.now().withHour(0).withMinute(0))){
            this.dueDateLDTime = dueDateLDTimeInputVal;
        }
        else {
            throw new Error("set due Date and Time must be after devices current time.");
        }
    }

    public void setStatus(boolean statusBoolean) {
        this.statusBool = statusBoolean;
    }

    public static Task buildTask(String taskString, LocalDateTime dueDate, boolean statusBool) {
        Task task = new Task();
        task.setTask(taskString);
        task.setDueDate(dueDate);
        task.setStatus(statusBool);
        return task;
    }

    public String toString() {
        return "Task name: "+getTaskString() + ", Task Date: " + getDueDateString() 
        +", Task Completion Status:"+getStatusBoolean();
    }
}
