package br.com.fiap.dao.impl;

import br.com.fiap.dao.BaseDao;
import br.com.fiap.entity.Veiculo;

import javax.persistence.EntityManager;

public class VeiculoDaoImpl implements BaseDao<Long, Veiculo> {

    private EntityManager entityManager ;

    public VeiculoDaoImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public void post(Veiculo veiculo) {
        entityManager.persist(veiculo);
        doCommit();
    }

    @Override
    public Veiculo get(Long id) {
        return entityManager.find(Veiculo.class, id);
    }

    @Override
    public void update(Veiculo veiculo) {
        entityManager.merge(veiculo);
        doCommit();
    }

    @Override
    public void delete(Veiculo veiculo) {
        entityManager.remove(veiculo);
        doCommit();
    }

    public void doCommit(){
        entityManager.getTransaction().begin();
        entityManager.getTransaction().commit();
    }
}
