package com.jfernandez.service.Impl;

import com.jfernandez.domain.entities.documents.Cliente;
import com.jfernandez.domain.repo.IClienteRepo;
import com.jfernandez.domain.repo.IGenericRepo;
import com.jfernandez.service.IClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IClienteServiceImpl extends ICrudServiceImpl<Cliente, String> implements IClienteService {

    private final IClienteRepo repo;

    @Override
    protected IGenericRepo<Cliente, String> getRepo() {
        return repo;
    }
}
