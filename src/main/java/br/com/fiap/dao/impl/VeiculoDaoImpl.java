package br.com.fiap.dao.impl;

import br.com.fiap.dao.BaseDao;
import br.com.fiap.entity.Veiculo;
import br.com.fiap.exception.CommitException;

import javax.persistence.EntityManager;

public class VeiculoDaoImpl implements BaseDao<Long, Veiculo> {

    private EntityManager entityManager;

    public VeiculoDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void post(Veiculo veiculo) throws CommitException {
        entityManager.persist(veiculo);
        doCommit();
    }

    @Override
    public Veiculo get(Long id) {
        return entityManager.find(Veiculo.class, id);
    }

    @Override
    public void update(Veiculo veiculo) throws CommitException {
        entityManager.merge(veiculo);
        doCommit();
    }

    @Override
    public void delete(Long id) throws CommitException {
        entityManager.remove(get(id));
        doCommit();
    }

    @Override
    public void doCommit() throws CommitException {
        try {
            entityManager.getTransaction().begin();
            entityManager.getTransaction().commit();
        }catch (Exception e){
            entityManager.getTransaction().rollback();
            throw new CommitException(e.getMessage());
        }
    }
}
