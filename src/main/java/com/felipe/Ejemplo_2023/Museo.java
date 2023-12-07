/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.Ejemplo_2023;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 *
 * @author andres
 */
@Table("museos")
public class Museo {
    @Id
    @Column("id")
    private Integer id;

    @Column("nombre")
    private String nombre;

    @Column("ciudad")
    private String ciudad;

    public Museo(Integer id, String nombre, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public static Museo crear(String nombre, String ciudad) {
        return new Museo(null, nombre, ciudad);
    }

}
