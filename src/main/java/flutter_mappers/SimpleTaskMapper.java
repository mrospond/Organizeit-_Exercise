package flutter_mappers;

import model.task.SimpleTask;
import model.task.TaskStatus;
import model.topic.Note;
import model.topic.Topic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleTaskMapper implements TaskMapper<SimpleTask> {
    @Override
    public Map<String, String> taskToMap(SimpleTask task) {
        // TODO: 08.06.2022 Zadanie 2
        return null;
    }

    @Override
    public SimpleTask mapToTask(Map<String, String> map) {
        String title = map.get("title");
        String topicName = map.get("topicName");
        String topicSubject = map.get("topicSubject");
        LocalDate date = LocalDate.parse(map.get("date"));
        TaskStatus status = TaskStatus.values()[Integer.parseInt(map.get("status"))];

        Topic topic = new Topic(topicName, topicSubject);

        List<Note> notes = new ArrayList<>();
        map.forEach((name, noteContent) -> {
            if (name.contains("note") ) {
                int id = Integer.parseInt(name.substring(4));
                String[] split = noteContent.split(";");
                String noteTitle = split[0].substring(6);
                String noteDescription = split[1].substring(12);

                Note note = new Note(id, noteTitle, noteDescription);
                note.setTopic(topic);

                notes.add(note);
            }
        });
        topic.setNotes(notes);

        /* return SimpleTask.builder()
                .title(title)
                .topic(topic)
                .date(date)
                .status(status)
                .build(); */
        // TODO: 08.06.2022 Odkomentuj powyższy kod po zrobieniu zadania 4
        return null;
    }
}
