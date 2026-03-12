package com.educacion.recursos.repositorio;

import com.educacion.recursos.modelo.Recurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecursoRepositorio extends JpaRepository<Recurso, Long> {
    // Spring Data JPA ya proporciona: save, findAll, findById, deleteById
}