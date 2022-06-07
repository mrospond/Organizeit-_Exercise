package model.topic;


import lombok.Data;
import lombok.NonNull;
import model.task.ReoccurringTask;
import model.task.TaskStatus;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
public class Topic {
    @NonNull
    private String name;
    @NonNull
    private String subject;
    private List<Note> notes = new ArrayList<>();

    public void addNote(Note note) {
        notes.add(note);
    }
}


