package com.example.sistema.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "inventario_suplemento")
public class InventarioSuplemento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inventario_suplemento")
    private Long idInventarioSuplemento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "suplemento_id")
    private Suplemento suplemento;

    private int cantidad;

    @Column(name = "fecha_ingreso")
    private LocalDateTime fechaIngreso;

    @Column(name = "fecha_vencimiento")
    private LocalDateTime fechaVencimiento;

    private String lote;
}
