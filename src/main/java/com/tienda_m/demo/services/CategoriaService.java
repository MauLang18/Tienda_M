/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda_m.demo.services;

import com.tienda_m.demo.domain.Categoria;
import java.util.List;

/**
 *
 * @author maula
 */
public interface CategoriaService {
    public List<Categoria> getCategoria(boolean activos);
}
