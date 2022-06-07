package model.task;


import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import model.topic.Topic;

import java.time.LocalDate;

// TODO: 08.06.2022 Zadanie 4
@EqualsAndHashCode(callSuper = true)
@Data
public class SimpleTask extends Task {
    private LocalDate date;

    private SimpleTask(String title, Topic topic, TaskStatus status, LocalDate date) {
        super(title, topic, status);
        this.date = date;
    }

    @Override
    public void updateStatus() {
        LocalDate now = LocalDate.now();
        if (now.isBefore(date)) {
            setStatus(TaskStatus.SCHEDULED);
        }
        else if (now.isEqual(date)) {
            setStatus(TaskStatus.ACTIVE);
        }
        else if (now.isAfter(date)) {
            setStatus(TaskStatus.FINISHED);
        }
    }
}
