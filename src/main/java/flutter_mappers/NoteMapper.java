package flutter_mappers;

import model.topic.Note;

import java.util.Map;

public class NoteMapper {
    public Note mapToNote(Map<String, String> map) {
        String title = map.get("title");
        String description = map.get("description");

        return new Note(title, description);
    }
}
