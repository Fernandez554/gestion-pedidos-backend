package com.jfernandez.domain.entities.documents;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "cliente")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cliente {
    @Id
    @EqualsAndHashCode.Include
    private String id;

    @NotBlank(message = "El nombre no puede estar vacío")
    private String nombre;

    @NotBlank(message = "El apellido no puede estar vacío")
    private String apellido;

    @Email(message = "Correo electrónico no válido")
    @NotBlank(message = "El correo electrónico no puede estar vacío")
    private String correo;

    @NotBlank(message = "La dirección no puede estar vacía")
    private String direccion;

}
