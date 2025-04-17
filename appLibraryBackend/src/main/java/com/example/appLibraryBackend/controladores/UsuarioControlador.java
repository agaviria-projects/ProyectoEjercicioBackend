package com.example.appLibraryBackend.controladores;

import com.example.appLibraryBackend.modelos.Usuario;
import com.example.appLibraryBackend.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping
    public List<Usuario>obtenerUsuarios(){
        return usuarioServicio.listarUsuarios();
    }

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        System.out.println("📥 Recibido en backend: " + usuario.getNombre() + ", " + usuario.getCorreo());
        return usuarioServicio.guardarUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id){
        usuarioServicio.eliminarUsuario(id);
    }
}
