package com.example.aprendendoSprintBoot.repositories;
import com.example.aprendendoSprintBoot.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository {
    Empresa findByCnpj(String cnpj);
}
