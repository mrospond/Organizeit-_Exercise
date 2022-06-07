package flutter_mappers;

import java.util.Map;

import model.task.Task;

public interface TaskMapper<T extends Task> {
    Map<String, String> taskToMap(T task);
    T mapToTask(Map<String, String> map);
}
