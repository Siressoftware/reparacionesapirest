package com.sires.reparaciones.web.controller;

import com.sires.reparaciones.service.ClienteService;
import com.sires.reparaciones.service.dto.ClienteDTO;
import com.sires.reparaciones.service.impl.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/clientes")
public class ClienteController
{
    @Autowired
    ClienteService service;

    @GetMapping("filtro/{parametro}")
    public ResponseEntity<List<ClienteDTO>> getClientes(@PathVariable("parametro") String parametro)
    {
        return new ResponseEntity<>(service.getListarClientes(parametro.toUpperCase()), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<ClienteDTO>> getAll()
    {
        return new ResponseEntity<>(service.getAll(),HttpStatus.OK);
    }



}
