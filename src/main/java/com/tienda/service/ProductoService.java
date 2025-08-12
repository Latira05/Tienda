/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

/**
 *
 * @author natha
 */
public interface ProductoService {
    
  
    public List <Producto> getProductos (boolean activos);
    
   
   // Se obtiene un Producto, a partir del id de un Producto
    public Producto getProducto(Producto producto);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Producto producto);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Producto producto);          
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);

      public List<Producto> metodoJPQL(double precioInf, double precioSup);
      
        public List<Producto> metodoNativo(double precioInf, double precioSup);
}
