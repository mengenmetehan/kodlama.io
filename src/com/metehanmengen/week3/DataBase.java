package com.metehanmengen.week3;

import com.metehanmengen.week3.kodlamaio_web.Category;
import com.metehanmengen.week3.kodlamaio_web.Course;
import com.metehanmengen.week3.kodlamaio_web.Instructor;

import java.util.ArrayList;
import java.util.List;

public class DataBase {


    // Aslında List yerine Set kullanmak daha iyi, ancak gösterilmedi :
    public static List<Instructor> instructors = new ArrayList<Instructor>();
    public static List<Category> categories = new ArrayList<Category>();
    public static List<Course> courses = new ArrayList<Course>();

}
