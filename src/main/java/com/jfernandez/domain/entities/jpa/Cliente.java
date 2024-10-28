package com.jfernandez.domain.entities.jpa;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

@Table(name="cliente")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Cliente {

    private Long id;

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
