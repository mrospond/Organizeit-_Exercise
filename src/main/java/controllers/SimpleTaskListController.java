package controllers;


import lombok.Setter;
import model.task.SimpleTask;
import model.task.TaskStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class SimpleTaskListController implements TaskListController<SimpleTask> {
    @Setter
    private List<SimpleTask> tasks;

    public SimpleTaskListController() {
        tasks = new ArrayList<>();
    }

    @Override
    public void addTask(SimpleTask task) {
        tasks.add(task);
    }

    @Override
    public void updateTask(SimpleTask oldTask, SimpleTask newTask) {
        int i = tasks.indexOf(oldTask);
        if (i == -1) {
            throw new NoSuchElementException();
        }
        tasks.set(i, newTask);
    }

    @Override
    public void deleteTask(SimpleTask task) {
        tasks.remove(task);
    }

    @Override
    public void refresh() {
        tasks.forEach(SimpleTask::updateStatus);
    }

    @Override
    public void cancelTask(SimpleTask task) {
        int i = tasks.indexOf(task);
        tasks.get(i).setStatus(TaskStatus.CANCELLED);
    }

    @Override
    public List<SimpleTask> getTasks() {
        return tasks;
    }
}
