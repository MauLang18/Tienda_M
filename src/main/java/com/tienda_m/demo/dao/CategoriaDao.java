/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda_m.demo.dao;

import com.tienda_m.demo.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author maula
 */
public interface CategoriaDao extends JpaRepository<Categoria,Long>{
    
}