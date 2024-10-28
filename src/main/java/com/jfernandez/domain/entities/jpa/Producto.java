package com.jfernandez.domain.entities.jpa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Table(name = "producto")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Producto {

    @Id
    private Long id;

    private String nombre;

    private String descripcion;

    private BigDecimal precio;

    private int cantidadEnStock;

    private LocalDate fechaCreacion;

    private String estado; // activo, inactivo, descontinuado

}
