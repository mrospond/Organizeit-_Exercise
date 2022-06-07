package model.task;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import model.topic.Topic;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;


@EqualsAndHashCode(callSuper = true)
@Data
public class ReoccurringTask extends Task {
    private LocalDate startDate;
    private LocalDate endDate;
    private Set<DayOfWeek> daysOfWeek;

    @Builder
    private ReoccurringTask(String title, Topic topic, TaskStatus status, LocalDate startDate, LocalDate endDate, Set<DayOfWeek> daysOfWeek) {
        super(title, topic, status);
        this.startDate = startDate;
        this.endDate = endDate;
        this.daysOfWeek = daysOfWeek;
    }

    @Override
    public void updateStatus() {
        // TODO: 07.06.2022 Zadanie 3
    }

    public String getDaysOfWeekString() {
        return daysOfWeek.stream()
                .map(day -> String.valueOf(day.getValue()))
                .collect(Collectors.joining(","));
    }

    public static Set<DayOfWeek> getDaysOfWeekFromString(String daysOfWeek) {
        return Arrays.stream(daysOfWeek.split(","))
                .map(day -> DayOfWeek.of(Integer.parseInt(day)))
                .collect(Collectors.toSet());
    }
}
