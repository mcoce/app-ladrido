/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.apppets.controller;

import com.umg.apppets.common.CommonController;
import com.umg.apppets.dto.ActualizarLadridoDto;
import com.umg.apppets.models.MascotaModel;
import com.umg.apppets.svc.MascotaSvc;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gabri
 */
@Api
@RestController
@RequestMapping("/mascota")
@CrossOrigin(origins = "http://localhost:4200")
public class MascotaController extends CommonController<MascotaModel, MascotaSvc> {

    @Autowired
    protected MascotaSvc Service;

    static final Logger logger = Logger.getLogger(MascotaController.class.getName());

    @PutMapping("/actualiza/ladrido")
    @ApiOperation(value = "Actualiza el ladrido")
    public boolean putLadrido(@RequestBody ActualizarLadridoDto ladrido) throws Exception {
        //logger.info("ladrido -->" + ladrido);
        Integer respuesta = Service.putLadrido(ladrido.getIdMascota(), ladrido.getComandoVoz());
        logger.info("respuesta -->" + respuesta);
        return respuesta != 0;
    }
}
