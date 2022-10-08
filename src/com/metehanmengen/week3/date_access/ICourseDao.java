package com.metehanmengen.week3.date_access;

import com.metehanmengen.week3.kodlamaio_web.Course;

public interface ICourseDao {
    void add (Course course);
    void delete (int courseId);
    Course getById (int courseId);
}
