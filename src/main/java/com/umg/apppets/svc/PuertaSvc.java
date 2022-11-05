/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.umg.apppets.svc;

import com.umg.apppets.common.CommonSvc;
import com.umg.apppets.models.PuertaModel;
import java.util.Optional;

/**
 *
 * @author gabri
 */
public interface PuertaSvc extends CommonSvc<PuertaModel> {

    public boolean verificarEstado(Integer idPuerta) throws Exception;

    public boolean verificarEncendido(Integer idPuerta) throws Exception;

    public Integer putEstado(Integer idPuerta, Integer estadoPuerta) throws Exception;

    public Integer putEncendido(Integer idPuerta, Boolean onOff) throws Exception;

}
