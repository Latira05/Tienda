package com.tienda.dao;

import com.tienda.domain.Categoria;
import org.springframework.springframework.data.JpaRepository;


public interface CategoriaDao extends JpaRepository<Categoria, Long>{
    
}
