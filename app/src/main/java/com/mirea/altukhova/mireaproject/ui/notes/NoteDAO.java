package com.mirea.altukhova.mireaproject.ui.notes;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface NoteDAO {
    @Query("SELECT * FROM Cell")
    List<com.mirea.altukhova.mireaproject.ui.notes.Cell> getAll();

    @Query("SELECT * FROM Cell WHERE id = :id")
    com.mirea.altukhova.mireaproject.ui.notes.Cell getById(long id);

    @Insert
    void insert(com.mirea.altukhova.mireaproject.ui.notes.Cell cell);

    @Update
    void update(com.mirea.altukhova.mireaproject.ui.notes.Cell cell);

    @Delete
    void delete(com.mirea.altukhova.mireaproject.ui.notes.Cell cell);

}
