package com.jfernandez.domain.entities.documents;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "pedido")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pedido {

    @Id
    @EqualsAndHashCode.Include
    private String id;

    @Field
    @NotBlank(message = "Ingrese una descripcion")
    private String descripcion;

    @Field
    @NotBlank(message = "Ingrese un cliente")
    private String cliente;

    @Field
    private List<DetallePedido> items;

}
