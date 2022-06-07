package controllers;

import java.util.List;

import model.task.Task;

public interface TaskListController<T extends Task> {
    void addTask(T task);
    void updateTask(T oldTask, T newTask);
    void deleteTask(T task);
    void refresh();
    void cancelTask(T task);
    List<T> getTasks();
}
