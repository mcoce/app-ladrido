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
@Table(name = "mascota",
        schema = "pets_app"
)
public class MascotaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mascota")
    private Integer idMascota;

    @Column(name = "nombre_mascota")
    private String nombreMascota;

    @Column(name = "comando_voz")
    private String comandoVoz;

    public MascotaModel() {
    }

    public MascotaModel(Integer idMascota, String nombreMascota, String comandoVoz) {
        this.idMascota = idMascota;
        this.nombreMascota = nombreMascota;
        this.comandoVoz = comandoVoz;
    }

    public Integer getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(Integer idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getComandoVoz() {
        return comandoVoz;
    }

    public void setComandoVoz(String comandoVoz) {
        this.comandoVoz = comandoVoz;
    }

    @Override
    public String toString() {
        return "MascotaModel{" + "idMascota=" + idMascota + ", nombreMascota=" + nombreMascota + ", comandoVoz=" + comandoVoz + '}';
    }

    
    
}
