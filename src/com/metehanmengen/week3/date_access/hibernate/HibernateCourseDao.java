package com.metehanmengen.week3.date_access.hibernate;

import com.metehanmengen.week3.DataBase;
import com.metehanmengen.week3.date_access.ICourseDao;
import com.metehanmengen.week3.kodlamaio_web.Course;

public class HibernateCourseDao implements ICourseDao {


    @Override
    public void add(Course course) {
        DataBase.courses.add(course);
        System.out.println(course.getName() + " kursu Hibernate ile veritabanına eklendi");
    }

    @Override
    public void delete(int courseId) {
        int sizeOfCourses = DataBase.courses.size();

        for (int i = 0; i < sizeOfCourses; i++) {
            if (courseId == DataBase.courses.get(i).getId()) {
                System.out.println(DataBase.courses.get(i).getName() + " kursu Hibernate ile veritabanından silindi");
                DataBase.courses.remove(i);
            }
        }
    }

    @Override
    public Course getById(int courseId) {

        for (int i = 0; i < DataBase.courses.size(); i++)
            if (courseId == DataBase.courses.get(i).getId())
                return DataBase.courses.get(i);

        return null;
    }
}
