package com.example.appLibraryBackend.servicios;

import com.example.appLibraryBackend.modelos.Usuario;
import com.example.appLibraryBackend.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    public List<Usuario>listarUsuarios(){
        return usuarioRepositorio.findAll();
    }

    public Usuario guardarUsuario(Usuario usuario){
        return usuarioRepositorio.save(usuario);
    }

    public void eliminarUsuario(Long id){
        usuarioRepositorio.deleteById(id);
    }
}
