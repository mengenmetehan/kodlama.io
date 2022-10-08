package com.metehanmengen.week3.date_access.jdbc;

import com.metehanmengen.week3.DataBase;
import com.metehanmengen.week3.date_access.ICategoryDao;
import com.metehanmengen.week3.kodlamaio_web.Category;

public class JdbcCategoryDao implements ICategoryDao {
    private int id;
    private String name;

    public JdbcCategoryDao(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public void add(Category category) {
        this.name = category.getName();
    }

    @Override
    public void delete(int id) {
        if (this.id == id)
            this.id = 0;
    }

    @Override
    public Category getById(int id) {

        for (int i = 0; i < DataBase.categories.size(); i++)
            if (id == DataBase.categories.get(i).getId())
                return DataBase.categories.get(i);

        return null;
    }
}
