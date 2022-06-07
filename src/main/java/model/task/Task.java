package model.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.topic.Topic;


@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Task {
    private String title;
    private Topic topic;
    private TaskStatus status;

    public abstract void updateStatus();
}
