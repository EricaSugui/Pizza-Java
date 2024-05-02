package com.SoulCode.erica.PizzariaSoulCode.repositories;

import com.SoulCode.erica.PizzariaSoulCode.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
