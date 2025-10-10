package com.example.sistema.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "herramienta")
public class Herramienta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_herramienta")
    private Long idHerramienta;

    private String nombre;

    private String tipo;

    private String estado;

    @Column(name = "fecha_adquisicion")
    private LocalDate fecha;

    @OneToMany(mappedBy = "herramienta", cascade = CascadeType.ALL)
    private List<InventarioHerramienta> inventarios;
}
