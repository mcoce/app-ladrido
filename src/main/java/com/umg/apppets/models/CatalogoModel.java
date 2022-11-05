/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.apppets.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;

/**
 *
 * @author gabri
 */
@Entity
@DynamicUpdate
@Table(name = "cat_estado",
        schema = "bd_mascota"
)
public class CatalogoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer codigoCatalogo;

    @Column(name = "nombre")
    private String nombreCatalogo;

    @Column(name = "descripcion")
    private String descripcionCatalogo;

    public CatalogoModel() {
    }

    public CatalogoModel(Integer codigoCatalogo, String nombreCatalogo, String descripcionCatalogo) {
        this.codigoCatalogo = codigoCatalogo;
        this.nombreCatalogo = nombreCatalogo;
        this.descripcionCatalogo = descripcionCatalogo;
    }

    public Integer getCodigoCatalogo() {
        return codigoCatalogo;
    }

    public void setCodigoCatalogo(Integer codigoCatalogo) {
        this.codigoCatalogo = codigoCatalogo;
    }

    public String getNombreCatalogo() {
        return nombreCatalogo;
    }

    public void setNombreCatalogo(String nombreCatalogo) {
        this.nombreCatalogo = nombreCatalogo;
    }

    public String getDescripcionCatalogo() {
        return descripcionCatalogo;
    }

    public void setDescripcionCatalogo(String descripcionCatalogo) {
        this.descripcionCatalogo = descripcionCatalogo;
    }

    @Override
    public String toString() {
        return "CatalogoModel{" + "codigoCatalogo=" + codigoCatalogo + ", nombreCatalogo=" + nombreCatalogo + ", descripcionCatalogo=" + descripcionCatalogo + '}';
    }
}
