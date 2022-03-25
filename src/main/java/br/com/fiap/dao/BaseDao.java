package br.com.fiap.dao;

import br.com.fiap.exception.CommitException;

public interface BaseDao<R, T> {

    void post(T t) throws CommitException;

    T get(R id);

    void update(T t) throws CommitException;

    void delete(R r) throws CommitException;

    void doCommit() throws CommitException;
}
