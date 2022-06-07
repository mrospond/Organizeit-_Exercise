package controllers;

import lombok.RequiredArgsConstructor;
import model.task.ReoccurringTask;
import model.task.TaskStatus;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class ReoccurringTaskListController implements TaskListController<ReoccurringTask> {
    private final List<ReoccurringTask> tasks;

    public ReoccurringTaskListController() {
        this.tasks = new ArrayList<>();
    }

    @Override
    public void addTask(ReoccurringTask task) {
        tasks.add(task);
    }

    @Override
    public void updateTask(ReoccurringTask oldTask, ReoccurringTask newTask) {
        int i = tasks.indexOf(oldTask);
        tasks.set(i, newTask);
    }

    @Override
    public void deleteTask(ReoccurringTask task) {
        tasks.remove(task);
    }

    @Override
    public void refresh() {
        tasks.forEach(ReoccurringTask::updateStatus);
    }

    @Override
    public void cancelTask(ReoccurringTask task) {
        int i = tasks.indexOf(task);
        tasks.get(i).setStatus(TaskStatus.CANCELLED);
    }

    @Override
    public List<ReoccurringTask> getTasks() {
        return tasks;
    }
}
