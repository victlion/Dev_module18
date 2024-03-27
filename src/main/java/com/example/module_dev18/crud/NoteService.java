package com.example.module_dev18.crud;

import com.example.module_dev18.entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService implements NoteServiceInterface {

    private final NoteRepository noteRepository;

    @Autowired
    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public List<Note> listAll() {
        return noteRepository.findAll();
    }

    @Override
    public Note add(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public Boolean deleteById(long id) {
        noteRepository.deleteById(id);
        return true;
    }

    @Override
    public Note update(Note note) {
        if (noteRepository.existsById(note.getId())) {
            noteRepository.save(note);
            return note;
        } else {
            return null;
        }
    }

    @Override
    public Note getById(long id) {
        return noteRepository.findById(id).orElse(null);
    }
}