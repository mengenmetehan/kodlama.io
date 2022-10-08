package com.metehanmengen.week3.date_access.hibernate;

import com.metehanmengen.week3.DataBase;
import com.metehanmengen.week3.date_access.ICategoryDao;
import com.metehanmengen.week3.kodlamaio_web.Category;

import javax.xml.crypto.Data;

public class HiberCategoryID implements ICategoryDao {

    @Override
    public void add(Category category) {
        DataBase.categories.add(category);

        System.out.printf("%s kategori olarak Hibernate'e eklendi.", category.getName());
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < DataBase.categories.size(); i++) {
            if (DataBase.categories.get(i).getId() == id)
                DataBase.categories.remove(i);
            break;
        }
    }

    @Override
    public Category getById(int id) {

        for (int i = 0; i < DataBase.categories.size(); i++)
            if (id == DataBase.categories.get(i).getId())
                return DataBase.categories.get(i);
        return null;
    }
}
