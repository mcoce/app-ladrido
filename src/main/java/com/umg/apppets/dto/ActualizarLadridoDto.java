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
public class ActualizarLadridoDto {
    
    @Column(name = "id_mascota")
    private Integer idMascota;
    
    @Column(name = "comando_voz")
    private String comandoVoz;

    public ActualizarLadridoDto() {
    }

    public ActualizarLadridoDto(Integer idMascota, String comandoVoz) {
        this.idMascota = idMascota;
        this.comandoVoz = comandoVoz;
    }

    public Integer getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(Integer idMascota) {
        this.idMascota = idMascota;
    }

    public String getComandoVoz() {
        return comandoVoz;
    }

    public void setComandoVoz(String comandoVoz) {
        this.comandoVoz = comandoVoz;
    }

    @Override
    public String toString() {
        return "ActualizarLadridoDto{" + "idMascota=" + idMascota + ", comandoVoz=" + comandoVoz + '}';
    }
    
    
}
