/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.apppets.service.impl;

import com.umg.apppets.common.CommonImpl;
import com.umg.apppets.models.PuertaModel;
import com.umg.apppets.repository.PuertaRepository;
import com.umg.apppets.svc.PuertaSvc;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gabri
 */
@Service
public class PuertaImpl extends CommonImpl<PuertaModel, PuertaRepository> implements PuertaSvc {

    @Autowired
    protected PuertaRepository Repository;

    //static final Logger logger = Logger.getLogger(PuertaController.class.getName());
    @Override
    public boolean verificarEstado(Integer idPuerta) throws Exception {
        Optional<PuertaModel> respuesta = Repository.findById(idPuerta);
        //logger.info("respuesta " + respuesta);
        if (!respuesta.isPresent()) {
            return false;
        }
        PuertaModel puerta = respuesta.get();
        Integer estadoPuerta = puerta.getEstadoPuerta();
        return estadoPuerta != 0;
    }

    @Override
    public boolean verificarEncendido(Integer idPuerta) throws Exception {
        Optional<PuertaModel> respuesta = Repository.findById(idPuerta);
        if (!respuesta.isPresent()) {
            return false;
        }

        PuertaModel puerta = respuesta.get();
        return puerta.getOnOff();
    }

    @Override
    public Integer putEstado(Integer idPuerta, Integer estadoPuerta) {
        Integer estado = Repository.putEstado(idPuerta, estadoPuerta);
        return estado;
    }

    @Override
    public Integer putEncendido(Integer idPuerta, Boolean onOff) {
        Optional<PuertaModel> respuesta = Repository.findById(idPuerta);
        PuertaModel puerta = respuesta.get();
        Integer estadoPuerta = puerta.getEstadoPuerta();
        if (!onOff) {
            estadoPuerta = 0;
        }
        Integer encendido = Repository.putEncendido(idPuerta, onOff, estadoPuerta);
        return encendido;
    }
}
