package com.jfernandez.infraestructure.impl;

import com.jfernandez.domain.entities.jpa.Producto;
import com.jfernandez.domain.repo.jpa.IGenericJPARepo;
import com.jfernandez.domain.repo.jpa.IProductoRepo;
import com.jfernandez.infraestructure.service.IProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductoServiceImpl extends ICRUDJPAImpl<Producto, Long> implements IProductoService {

    private final IProductoRepo repo;

    @Override
    protected IGenericJPARepo<Producto, Long> getRepo() {
        return repo;
    }
}
