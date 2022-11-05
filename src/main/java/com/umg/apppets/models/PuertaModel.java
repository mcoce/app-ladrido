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
@Table(name = "puerta",
        schema = "pets_app"
)
public class PuertaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_puerta")
    private Integer idPuerta;
    
    @Column(name = "nombre_puerta")
    private String nombrePuerta;
    
    @Column(name = "estado_puerta")
    private Integer estadoPuerta;

    @Column(name = "on_off")
    private Boolean onOff;
    
    @Column(name = "id_mascota")
    private Integer idMascota;

    public PuertaModel() {
    }

    public PuertaModel(Integer idPuerta, String nombrePuerta, Integer estadoPuerta, Boolean onOff, Integer idMascota) {
        this.idPuerta = idPuerta;
        this.nombrePuerta = nombrePuerta;
        this.estadoPuerta = estadoPuerta;
        this.onOff = onOff;
        this.idMascota = idMascota;
    }

    public Integer getIdPuerta() {
        return idPuerta;
    }

    public void setIdPuerta(Integer idPuerta) {
        this.idPuerta = idPuerta;
    }

    public String getNombrePuerta() {
        return nombrePuerta;
    }

    public void setNombrePuerta(String nombrePuerta) {
        this.nombrePuerta = nombrePuerta;
    }

    public Integer getEstadoPuerta() {
        return estadoPuerta;
    }

    public void setEstadoPuerta(Integer estadoPuerta) {
        this.estadoPuerta = estadoPuerta;
    }

    public Boolean getOnOff() {
        return onOff;
    }

    public void setOnOff(Boolean onOff) {
        this.onOff = onOff;
    }

    public Integer getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(Integer idMascota) {
        this.idMascota = idMascota;
    }

    @Override
    public String toString() {
        return "PuertaModel{" + "idPuerta=" + idPuerta + ", nombrePuerta=" + nombrePuerta + ", estadoPuerta=" + estadoPuerta + ", onOff=" + onOff + ", idMascota=" + idMascota + '}';
    }
    
    
}
