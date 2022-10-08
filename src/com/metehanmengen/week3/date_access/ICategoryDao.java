package com.metehanmengen.week3.date_access;

import com.metehanmengen.week3.kodlamaio_web.Category;

public interface ICategoryDao {
    void add(Category category);
    void delete(int id);
    Category getById (int id);

    // Kategori isminin veritabanında unique olmasını istiyoruz.
    // Bundan dolayı returnü List<Category> yerine Category yaptım.

}