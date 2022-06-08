package model.task;


import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import model.topic.Topic;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
public class SimpleTask extends Task {
    private LocalDate date;

    private SimpleTask(String title, Topic topic, TaskStatus status, LocalDate date) {
        super(title, topic, status);
        this.date = date;
    }

    public SimpleTask() {
    }

    private SimpleTask(SimpleTaskBuilder builder) {
        super(builder.title, builder.topic, builder.status);
        this.date = builder.date;
    }

    public static SimpleTaskBuilder builder() {
        return new SimpleTaskBuilder();
    }

    public static class SimpleTaskBuilder {
        private String title;
        private Topic topic;
        private TaskStatus status;
        private LocalDate date;

        public SimpleTaskBuilder title(String title) {
            this.title = title;
            return this;
        }

        public SimpleTaskBuilder topic(Topic topic) {
            this.topic = topic;
            return this;
        }

        public SimpleTaskBuilder status(TaskStatus status) {
            this.status = status;
            return this;
        }

        public SimpleTaskBuilder date(LocalDate date) {
            this.date = date;
            return this;
        }

        public SimpleTask build() {
            return new SimpleTask(title, topic, status, date);
        }
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
