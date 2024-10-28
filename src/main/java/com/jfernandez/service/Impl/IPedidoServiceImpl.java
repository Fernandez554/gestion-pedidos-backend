package com.jfernandez.service.Impl;

import com.jfernandez.domain.entities.documents.Pedido;
import com.jfernandez.domain.repo.IGenericRepo;
import com.jfernandez.domain.repo.IPedidoRepo;
import com.jfernandez.service.IPedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IPedidoServiceImpl extends ICrudServiceImpl<Pedido, String> implements IPedidoService {

    private final IPedidoRepo repo;

    @Override
    protected IGenericRepo<Pedido, String> getRepo() {
        return repo;
    }
}
