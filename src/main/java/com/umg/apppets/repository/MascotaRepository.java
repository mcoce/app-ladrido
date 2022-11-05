/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.umg.apppets.repository;

import com.umg.apppets.models.MascotaModel;
import java.util.Optional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author gabri
 */
public interface MascotaRepository extends CrudRepository<MascotaModel, Object> {
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update pets_app.mascota set comando_voz =:comandoVoz where id_mascota =:idMascota", nativeQuery = true)
    Integer putLadrido(@Param("idMascota") Integer idMascota, @Param("comandoVoz") String comandoVoz);
}
