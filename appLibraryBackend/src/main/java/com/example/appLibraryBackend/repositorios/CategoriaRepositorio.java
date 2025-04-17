package com.example.appLibraryBackend.repositorios;

import com.example.appLibraryBackend.modelos.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long> {
}
