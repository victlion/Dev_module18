package com.example.module_dev18.crud;

import com.example.module_dev18.entity.Note;

import java.util.List;

public interface NoteServiceInterface {
    List<Note> listAll();

    Note add(Note note);

    Boolean deleteById(long id);

    Note update(Note note);

    Note getById(long id);
}
