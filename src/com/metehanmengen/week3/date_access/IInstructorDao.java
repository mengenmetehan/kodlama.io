package com.metehanmengen.week3.date_access;

import com.metehanmengen.week3.kodlamaio_web.Instructor;

public interface IInstructorDao {
    void add(Instructor instructor);
    void delete(int instructorId);
    Instructor getId(int instructorId);
}
