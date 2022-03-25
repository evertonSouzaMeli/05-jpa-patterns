package br.com.fiap.patterns;

public class EntityManagerFactorySingleton {
    private static EntityManagerFactorySingleton factory;

    private EntityManagerFactorySingleton(){};

    public static EntityManagerFactorySingleton getInstance(){
        return factory == null ? new EntityManagerFactorySingleton() : factory;
    }
}
