package com.sires.reparaciones.web.controller;

import com.sires.reparaciones.service.UsuarioService;
import com.sires.reparaciones.service.dto.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController
{
    @Autowired
    private UsuarioService service;

    public UsuarioController(UsuarioService xService)
    {
        service = xService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<UsuarioDTO>> getAll()
    {
        return new ResponseEntity<>(service.findall(), HttpStatus.OK);
    }
}
