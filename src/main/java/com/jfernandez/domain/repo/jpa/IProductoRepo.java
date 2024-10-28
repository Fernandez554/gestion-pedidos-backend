package com.jfernandez.domain.repo.jpa;

import com.jfernandez.domain.entities.jpa.Producto;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepo extends IGenericJPARepo<Producto, Long> {
}
