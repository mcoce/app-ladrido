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
@Table(name = "usuarios",
         schema = "bd_mascota"
)
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer idUser;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "apellido")
    private String apellido;
    
    @Column(name = "estado_user")
    private Integer estadoUser;

    public UsuarioModel() {
    }

    public UsuarioModel(Integer idUser, String nombre, String apellido, Integer estadoUser) {
        this.idUser = idUser;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoUser = estadoUser;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEstadoUser() {
        return estadoUser;
    }

    public void setEstadoUser(Integer estadoUser) {
        this.estadoUser = estadoUser;
    }

    @Override
    public String toString() {
        return "UsuarioModel{" + "idUser=" + idUser + ", nombre=" + nombre + ", apellido=" + apellido + ", estadoUser=" + estadoUser + '}';
    }
}
