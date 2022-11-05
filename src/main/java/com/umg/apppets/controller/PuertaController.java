/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.apppets.controller;

import com.umg.apppets.common.CommonController;
import com.umg.apppets.dto.ActualizaEncendidoPuertaDto;
import com.umg.apppets.dto.ActualizarEstadoPuertaDto;
import com.umg.apppets.models.PuertaModel;
import com.umg.apppets.svc.PuertaSvc;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.Optional;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/puerta")
@CrossOrigin(origins = "http://localhost:4200")
public class PuertaController extends CommonController<PuertaModel, PuertaSvc> {

    @Autowired
    protected PuertaSvc Service;

    static final Logger logger = Logger.getLogger(PuertaController.class.getName());

    @GetMapping("/verificar/estado/{idPuerta}")
    @ApiOperation(value = "Verifica si la puerta esta abierta o cerrada")
    public boolean verificarEstado(@PathVariable @ApiParam(value = "idPuerta") Integer idPuerta) throws Exception {
        return Service.verificarEstado(idPuerta);
    }

    @GetMapping("/verificar/encendido/{idPuerta}")
    @ApiOperation(value = "Verifica si la puerta esta encendida o apagada")
    public boolean verificarEncendido(@PathVariable @ApiParam(value = "idPuerta") Integer idPuerta) throws Exception {
        return Service.verificarEncendido(idPuerta);
    }

    @PutMapping("/actualiza/estado")
    @ApiOperation(value = "Actualiza estado de la puerta")
    public boolean putEstado(@RequestBody ActualizarEstadoPuertaDto estado) throws Exception {
        Integer respuesta = Service.putEstado(estado.getIdPuerta(), estado.getEstadoPuerta());
        return respuesta != 0;
    }

    @PutMapping("/actualiza/encendido")
    @ApiOperation(value = "Actualiza encendido de la puerta")
    public Boolean putEncendido(@RequestBody ActualizaEncendidoPuertaDto encendido) throws Exception {
        Integer respuesta = Service.putEncendido(encendido.getIdPuerta(), encendido.isOnOff());
        return respuesta != 0;
    }
}
