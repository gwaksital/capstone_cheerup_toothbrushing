package com.lite.holistic_tracking.Database;
import com.lite.holistic_tracking.Entity.Child;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ChildDao {
    @Insert
    void insertChild(Child child);

    @Query("SELECT * FROM Child")
    List<Child> getAllChildren();

    @Query("SELECT COUNT(*) FROM child")
    int getChildCount();
}
