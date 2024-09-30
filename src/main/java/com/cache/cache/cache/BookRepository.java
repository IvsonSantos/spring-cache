package com.cache.cache.cache;

public interface BookRepository {

    Book getByIsbn(String isbn);

}
