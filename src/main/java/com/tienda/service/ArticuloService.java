package com.tienda.service;

import com.tienda.model.Articulo;
import java.util.List;


public interface ArticuloService {
    public List<Articulo> getArticulo(boolean activos);
    
    public void save(Articulo categoria);
    
    public void delete(Articulo categoria);
    
    public Articulo getArticulo(Articulo categoria);
}
