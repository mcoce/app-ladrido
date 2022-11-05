/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.apppets.dto;

import javax.persistence.Column;

/**
 *
 * @author gabri
 */
public class ActualizarEstadoPuertaDto {
    @Column(name = "id_puerta")
    private Integer idPuerta;
    
    @Column(name = "estado_puerta")
    private Integer estadoPuerta;

    public ActualizarEstadoPuertaDto() {
    }

    public ActualizarEstadoPuertaDto(Integer idPuerta, Integer estadoPuerta) {
        this.idPuerta = idPuerta;
        this.estadoPuerta = estadoPuerta;
    }

    public Integer getIdPuerta() {
        return idPuerta;
    }

    public void setIdPuerta(Integer idPuerta) {
        this.idPuerta = idPuerta;
    }

    public Integer getEstadoPuerta() {
        return estadoPuerta;
    }

    public void setEstadoPuerta(Integer estadoPuerta) {
        this.estadoPuerta = estadoPuerta;
    }

    @Override
    public String toString() {
        return "ActualizarEstadoPuertaDto{" + "idPuerta=" + idPuerta + ", estadoPuerta=" + estadoPuerta + '}';
    }

    
    
    
}
