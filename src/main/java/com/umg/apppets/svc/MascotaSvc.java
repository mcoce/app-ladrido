/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.umg.apppets.svc;

import com.umg.apppets.common.CommonSvc;
import com.umg.apppets.models.MascotaModel;
import java.util.Optional;

/**
 *
 * @author gabri
 */
public interface MascotaSvc extends CommonSvc<MascotaModel> {
    public Integer putLadrido(Integer idMascota, String comandoVoz)throws Exception;
}
