/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.apppets.controller;

import com.umg.apppets.common.CommonController;
import com.umg.apppets.models.UsuarioModel;
import com.umg.apppets.svc.UsuarioSvc;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gabri
 */
@Api
@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController extends CommonController<UsuarioModel, UsuarioSvc> {
    
}
