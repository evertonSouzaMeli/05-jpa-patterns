package br.com.fiap.dao;

public interface BaseDao<R, T> {

    void post(T t);

    T get(R id);

    void update(T t);

    void delete(T t);
}
