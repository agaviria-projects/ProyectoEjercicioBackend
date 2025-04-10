package com.example.appLibraryBackend.servicios;

import com.example.appLibraryBackend.modelos.Libro;
import com.example.appLibraryBackend.repositorios.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServicio {
    //Instanciar el repositorio del libro
    @Autowired //anotacion que permite inyectar objetos en esta clase (repositorio)
    private LibroRepositorio libroRepositorio;
    //metodo constructor de este servicio clic derecho Generate
    public LibroServicio(LibroRepositorio libroRepositorio) {
        this.libroRepositorio = libroRepositorio;
    }

    //crear metodo publico para que nos permita guardar un libro
    public Libro saveLibro(Libro libro){

        return libroRepositorio.save(libro);
    }

    //metodo para listar todos los libros
    public List<Libro> getAllLibros(){

        return libroRepositorio.findAll();
    }
}
