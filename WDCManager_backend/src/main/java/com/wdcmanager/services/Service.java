package com.wdcmanager.services;

import java.util.List;

public interface Service<T> {
    List<T> getAll();
    T get(Long id);
    T add(T t);
//    T update(T t);
    boolean delete(T t);
}
