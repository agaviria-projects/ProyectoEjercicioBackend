package com.example.appLibraryBackend.controladores;

import com.example.appLibraryBackend.modelos.Prestamo;
import com.example.appLibraryBackend.modelos.Usuario;
import com.example.appLibraryBackend.servicios.PrestamoServicio;
import com.example.appLibraryBackend.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prestamos")
public class PrestamoControlador {
    @Autowired
    private PrestamoServicio prestamoServicio;

    @GetMapping
    public List<Prestamo> listar(){
        return prestamoServicio.listarPrestamos();
    }

    @PostMapping
    public Prestamo guardar(@RequestBody Prestamo prestamo){
        return prestamoServicio.guardarPrestamo(prestamo);
    }

    @GetMapping("/{id}")
    public Prestamo buscar(@PathVariable Long id){
        return prestamoServicio.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        prestamoServicio.eliminarPrestamo(id);
    }
}
