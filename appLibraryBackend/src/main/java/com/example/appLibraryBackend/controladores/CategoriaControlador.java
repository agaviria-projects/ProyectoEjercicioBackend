package com.example.appLibraryBackend.controladores;


import com.example.appLibraryBackend.modelos.Categoria;
import com.example.appLibraryBackend.servicios.CategoriaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaControlador {
    @Autowired
    private CategoriaServicio categoriaServicio;

    @GetMapping
    public List<Categoria>listar(){
        return categoriaServicio.listarCategorias();
    }

    @PostMapping
    public Categoria guardar(@RequestBody Categoria categoria){
        return categoriaServicio.guardarCategoria(categoria);
    }

    @GetMapping("/{id}")
    public Categoria buscar(@PathVariable Long id){
        return categoriaServicio.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        categoriaServicio.eliminarCategoria(id);
    }

}
