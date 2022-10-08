package com.metehanmengen.week3.date_access.hibernate;

import com.metehanmengen.week3.DataBase;
import com.metehanmengen.week3.date_access.IInstructorDao;
import com.metehanmengen.week3.kodlamaio_web.Instructor;

public class HibernateInstructorDao implements IInstructorDao {

    @Override
    public void add(Instructor instructor) {
        DataBase.instructors.add(instructor);

        System.out.printf("%s Jdbc'ye eklendi", instructor.getName());
    }

    @Override
    public void delete(int instructorId) {
        DataBase.instructors.remove(instructorId);

        System.out.printf("%d id numaralı kişi Jdbc'den silindi.", instructorId);
    }

    @Override
    public Instructor getId(int instructorId) {

        for (int i = 0; i < DataBase.instructors.size(); i++)
            if (instructorId == DataBase.instructors.get(i).getId())
                return DataBase.instructors.get(i);

        return null;
    }
}
