package model.topic;

import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = false)
@Data
public class Note extends Attachment {
    private final int id;
    private String description;

    private static int nextId = 0;

    public Note(String title, String description) {
        super(title);
        this.description = description;
        this.id = nextId++;
    }

    public Note(int id, String title, String description) {
        super(title);
        this.description = description;
        this.id = id;
    }
}
