package com.example.appLibraryBackend.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libros")
public class LibroControlador {
    //Inyectar el servicio de libro(libroservicio)
    @Autowired
    
}
