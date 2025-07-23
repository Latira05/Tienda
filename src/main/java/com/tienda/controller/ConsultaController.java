/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.controller;

import com.tienda.dao.ProductoDao;
import com.tienda.domain.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


public class ConsultaController {
    
    @Autowired
    private ProductoDao productoDao;

    @GetMapping("/consultaAvanzada")
    public String productosCaros(Model model) {
        List<Producto> lista = productoDao.findByPrecioGreaterThanOrderByPrecioDesc(500.0);
        model.addAttribute("productos", lista);
        return "productos-caros";
    }
    
    
}
