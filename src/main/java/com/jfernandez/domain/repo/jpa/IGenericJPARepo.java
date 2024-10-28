package com.jfernandez.domain.repo.jpa;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

@NoRepositoryBean
public interface IGenericJPARepo<T, ID> extends ReactiveCrudRepository<T, ID> {

}
