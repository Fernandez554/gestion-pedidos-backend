package com.jfernandez.service.Impl;

import com.jfernandez.domain.entities.documents.Producto;
import com.jfernandez.domain.repo.IGenericRepo;
import com.jfernandez.domain.repo.IProductoRepo;
import com.jfernandez.service.IProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IProductoServiceImpl extends ICrudServiceImpl<Producto, String> implements IProductoService {

    private final IProductoRepo repo;

    @Override
    protected IGenericRepo<Producto, String> getRepo() {
        return repo;
    }
}
