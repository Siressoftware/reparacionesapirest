package com.sires.reparaciones.web.controller;


import com.sires.reparaciones.service.EquipoService;
import com.sires.reparaciones.service.dto.EquipoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/equipo")
public class EquipoController
{
    @Autowired
    EquipoService service;

    @GetMapping("marcas")
    public ResponseEntity<List<String>> findAllMarcas()
    {
       return new ResponseEntity<>(service.obtenerTodasLasMarcas(), HttpStatus.OK);
    }

    @GetMapping("tipoequipo/{tipoequipo}/marcas")
    public ResponseEntity<List<String>> findAllMarcas(@PathVariable("tipoequipo") String  tipo)
    {
        return new ResponseEntity<>(service.obtenerMarcas(tipo.toUpperCase()),HttpStatus.OK);
    }

    @GetMapping("cliente/{idcliente}")
    public ResponseEntity<List<EquipoDTO>> findEquipoFromCliente(@PathVariable("idcliente") long idcliente)
    {
        return new ResponseEntity<>(service.findEquiposDeCliente(idcliente),HttpStatus.OK);
    }


}
