package com.jfernandez.api.controller;

import com.jfernandez.domain.entities.documents.Pedido;
import com.jfernandez.domain.entities.jpa.Producto;
import com.jfernandez.infraestructure.service.IProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/producto")
@RequiredArgsConstructor
public class ProductoController {
    private final IProductoService service;

    @GetMapping
    public Mono<ResponseEntity<List<Producto>>> findAll() {

        return service.findAll()
                .collectList()
                .map(list -> {
                    if(list.isEmpty())
                        return ResponseEntity.noContent().build();
                    else
                        return ResponseEntity.ok()
                                .contentType(MediaType.APPLICATION_JSON)
                                .body(list);
                });

    }

}
