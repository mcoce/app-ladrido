/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.umg.apppets.repository;

import com.umg.apppets.models.PuertaModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author gabri
 */
public interface PuertaRepository extends CrudRepository<PuertaModel, Object> {
    
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update pets_app.puerta set estado_puerta =:estadoPuerta where id_puerta =:idPuerta", nativeQuery = true)
    Integer putEstado(@Param("idPuerta") Integer idPuerta, @Param("estadoPuerta") Integer estadoPuerta);
    
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update pets_app.puerta set on_off =:onOff, estado_puerta =:estadoPuerta where id_puerta =:idPuerta", nativeQuery = true)
    Integer putEncendido(@Param("idPuerta") Integer idPuerta, @Param("onOff") Boolean onOff, @Param("estadoPuerta") Integer estadoPuerta);
}
