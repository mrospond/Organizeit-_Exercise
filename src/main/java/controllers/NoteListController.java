package controllers;

import model.topic.Note;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class NoteListController implements AttachmentListController<Note> {
    private final List<Note> notes = new ArrayList<>();

    @Override
    public void add(Note note){
        notes.add(note);
    }

    @Override
    public void update(int id, Note newNote) {
        for (int i = 0; i < notes.size(); i++) {
            Note oldNote = notes.get(i);
            if (oldNote.getId() == id) {
                newNote.setTitle(oldNote.getTitle());
                newNote.setTopic(oldNote.getTopic());
                newNote.setDescription(oldNote.getDescription());
                break;
            }
        }
        throw new NoSuchElementException();
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
