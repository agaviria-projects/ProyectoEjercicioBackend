package com.example.appLibraryBackend.controladores;

import com.example.appLibraryBackend.modelos.Libro;
import com.example.appLibraryBackend.servicios.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/libros")
public class LibroControlador {
    //Inyectar el servicio de libro(libroservicio)
    @Autowired
    private LibroServicio libroServicio;

    //Utilizar los EndPoints
    //Endpoint Post libros
    @PostMapping
    public Libro addLibro(@RequestBody Libro libro){
        return libroServicio.saveLibro(libro);
    }

    //Enpoint de todos los libros
    @GetMapping
    public List<Libro> getLibrosAll(){
        return libroServicio.getAllLibros();
    }
}
