/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.apppets.service.impl;

import com.umg.apppets.common.CommonImpl;
import com.umg.apppets.models.MascotaModel;
import com.umg.apppets.repository.MascotaRepository;
import com.umg.apppets.svc.MascotaSvc;
import java.util.Optional;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gabri
 */
@Service
public class MascotaImpl extends CommonImpl<MascotaModel, MascotaRepository> implements MascotaSvc {

    @Autowired
    protected MascotaRepository Repository;
  
    @Override
    public Integer putLadrido(Integer idMascota, String comandoVoz) throws Exception {
         Integer ladrido = Repository.putLadrido(idMascota, comandoVoz);
        return ladrido;
    }
}
