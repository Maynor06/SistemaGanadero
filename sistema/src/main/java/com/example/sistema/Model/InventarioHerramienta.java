package com.example.sistema.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "inventaio_herramienta")
public class InventarioHerramienta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inventario_herramienta")
    private Long idInventarioHerramienta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "herramienta_id")
    private Herramienta herramienta;

    private int cantidad;

    private String estado;

}
