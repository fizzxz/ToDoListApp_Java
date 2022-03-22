package task;

import java.time.LocalDate;

public class Task {
    String taskStr;
    LocalDate dueDateLocalDate;
    // String reminderStr;
    // String repeatableStr;
    // String categoryStr;
    boolean statusBool;

    public String getTaskString() {
        return taskStr;
    }

    public LocalDate getDueDateString() {
        return dueDateLocalDate;
    }

    public boolean getStatusBoolean() {
        return statusBool;
    }

    public void setTask(String taskString) {
        this.taskStr = taskString;
    }

    public void setDueDate(LocalDate dueDateString) {
        this.dueDateLocalDate = dueDateString;
    }

    public void setStatus(boolean statusBoolean) {
        this.statusBool = statusBoolean;
    }

    public static Task buildTask(String taskString, LocalDate dueDate, boolean statusBool) {
        Task task = new Task();
        task.setTask(taskString);
        task.setDueDate(dueDate);
        task.setStatus(statusBool);
        return task;
    }

    public String toString() {
        return "Task name: "+getTaskString() + ", Task Date: " + getDueDateString()+", Task Completion Status:"+getStatusBoolean();
    }
}
