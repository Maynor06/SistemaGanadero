package com.example.sistema.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "medicamento")
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medicamento")
    private Long idMedicamento;

    private String nombre;

    private String laboratorio;

    @Column(name = "dosis_recomendada")
    private String dosis;

    @OneToMany(mappedBy = "medicamento")

    private List<InventarioMedicamento> inventarioMedicamento;

}
