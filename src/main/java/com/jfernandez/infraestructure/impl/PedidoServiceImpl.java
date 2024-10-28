package com.jfernandez.infraestructure.impl;

import com.jfernandez.domain.entities.documents.Pedido;
import com.jfernandez.domain.repo.mongo.IPedidoRepo;
import com.jfernandez.domain.repo.mongo.IGenericRepo;
import com.jfernandez.infraestructure.service.IPedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PedidoServiceImpl extends ICRUDImpl<Pedido, String> implements IPedidoService {

	private final IPedidoRepo repo;

	@Override
    protected IGenericRepo<Pedido, String> getRepo() {
        return repo;
    }

}
