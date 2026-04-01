package com.example.model;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Producto {

    @NotBlank
    private String nombre;

    @NotNull
    @Positive
    private Double precio;

    @NotBlank
    private String categoria;

}
