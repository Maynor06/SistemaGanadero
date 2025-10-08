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
@Table(name = "suplemento")
public class Suplemento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_suplemento")
    private Long idSumplemento;

    private String nombre;

    private String tipo;

    private String nutrientes;

    @OneToMany(mappedBy = "suplemento", cascade = CascadeType.ALL)
    private List<InventarioSuplemento> inventarios;
}
