package com.example.appLibraryBackend.servicios;

import com.example.appLibraryBackend.modelos.Categoria;
import com.example.appLibraryBackend.repositorios.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServicio {
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    public List<Categoria> listarCategorias(){
        return categoriaRepositorio.findAll();
    }
    public Categoria guardarCategoria(Categoria categoria){
        return categoriaRepositorio.save(categoria);
    }

    public Categoria buscarPorId(Long id){
        return categoriaRepositorio.findById(id).orElse(null);
    }
    public void eliminarCategoria(Long id){
        categoriaRepositorio.deleteById(id);
    }
}
