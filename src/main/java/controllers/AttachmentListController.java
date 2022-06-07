package controllers;

import model.topic.Attachment;

import java.util.List;

public interface AttachmentListController<T extends Attachment> {
    void add(T attachment);
    void update(int id, T newAttachment);
    void delete(int id);
    List<T> getAll();
}
