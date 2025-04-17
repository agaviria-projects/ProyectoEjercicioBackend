package com.example.appLibraryBackend.servicios;

import com.example.appLibraryBackend.modelos.Prestamo;
import com.example.appLibraryBackend.modelos.Usuario;
import com.example.appLibraryBackend.repositorios.PrestamoRepositorio;
import com.example.appLibraryBackend.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoServicio {
    @Autowired
    private PrestamoRepositorio prestamoRepositorio;

    public List<Prestamo> listarPrestamos(){
        return prestamoRepositorio.findAll();
    }

    public Prestamo guardarPrestamo(Prestamo prestamo){
        return prestamoRepositorio.save(prestamo);
    }
    public void eliminarPrestamo(Long id){
        prestamoRepositorio.deleteById(id);
    }
    public Prestamo buscarPorId(Long id) {
        return prestamoRepositorio.findById(id).orElse(null);
    }

}
