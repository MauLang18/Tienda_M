/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda_m.demo.services.impl;

import com.tienda_m.demo.dao.CategoriaDao;
import com.tienda_m.demo.domain.Categoria;
import com.tienda_m.demo.services.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author maula
 */
@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    public List<Categoria> getCategoria(boolean activos) {
        var lista = categoriaDao.findAll();
        
        if (activos){
            lista.removeIf(c -> !c.isActivo());
        }
        
        return lista;
    }
    
}
