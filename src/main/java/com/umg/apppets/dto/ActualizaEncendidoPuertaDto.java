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
public class ActualizaEncendidoPuertaDto {
    @Column(name = "id_puerta")
    private Integer idPuerta;
    
    @Column(name = "on_off")
    private Boolean onOff;

    public ActualizaEncendidoPuertaDto() {
    }

    public ActualizaEncendidoPuertaDto(Integer idPuerta, Boolean onOff) {
        this.idPuerta = idPuerta;
        this.onOff = onOff;
    }

    public Integer getIdPuerta() {
        return idPuerta;
    }

    public void setIdPuerta(Integer idPuerta) {
        this.idPuerta = idPuerta;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(Boolean onOff) {
        this.onOff = onOff;
    }

    @Override
    public String toString() {
        return "ActualizaEncendidoPuertaDto{" + "idPuerta=" + idPuerta + ", onOff=" + onOff + '}';
    }
    
    
}
