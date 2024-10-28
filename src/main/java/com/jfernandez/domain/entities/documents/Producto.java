package com.jfernandez.domain.entities.documents;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "producto")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Producto {
    @Id
    @EqualsAndHashCode.Include
    private String id;

    private String nombre;

    private String descripcion;

    private BigDecimal precio;

    private int cantidadEnStock;

    private LocalDate fechaCreacion;

    private String estado; //
}
