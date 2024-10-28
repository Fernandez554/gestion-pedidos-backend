package com.jfernandez.domain.entities.documents;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "pedido")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pedido {
    @Id
    @EqualsAndHashCode.Include
    private String id;

    @NotBlank(message = "Ingrese una descripcion")
    private String descripcion;

    @NotBlank(message = "Seleccione un cliente")
    private String cliente;

    private List<DetallePedido> items;
}
