package com.jfernandez.infraestructure.impl;


import com.jfernandez.domain.repo.jpa.IGenericJPARepo;
import com.jfernandez.infraestructure.service.ICRUD;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public abstract class ICRUDJPAImpl<T, ID> implements ICRUD<T, ID> {

    protected abstract IGenericJPARepo<T, ID> getRepo();

    @Override
    public Mono<T> save(T t) {
        return getRepo().save(t);
    }

    @Override
    public Mono<T> update(T t) {
        return getRepo().save(t);
    }

    @Override
    public Flux<T> findAll() {
        return getRepo().findAll();
    }

    @Override
    public Mono<T> findById(ID id) {
        return getRepo().findById(id);
    }

    @Override
    public Mono<Void> delete(ID id) {
        return getRepo().deleteById(id);
    }
}
