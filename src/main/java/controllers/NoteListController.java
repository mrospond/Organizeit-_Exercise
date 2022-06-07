package controllers;

import model.topic.Note;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NoteListController implements AttachmentListController<Note> {
    private final List<Note> notes = new ArrayList<>();

    @Override
    public void add(Note note){
        notes.add(note);
    }

    @Override
    public void update(int id, Note newNote) {
        // TODO: 08.06.2022 Zadanie 1 
    }

    @Override
    public void delete(int id){
        Optional<Note> noteOpt = notes.stream()
                .filter(n -> n.getId() == id)
                .findFirst();
        noteOpt.ifPresent(notes::remove);
    }

    @Override
    public List<Note> getAll(){
        return notes;
    }
}
