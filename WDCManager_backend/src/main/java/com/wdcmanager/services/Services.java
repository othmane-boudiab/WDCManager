package com.wdcmanager.services;

import java.util.List;

public interface Services<T> {
    List<T> getAll();
    T get(Long id);
    T add(T t);
    T edit(T t);
    boolean delete(T t);
}
