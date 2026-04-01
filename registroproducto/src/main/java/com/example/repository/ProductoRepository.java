package com.example.repository;
import com.example.model.Producto;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductoRepository {
    
    private List<Producto> listaProductos = new ArrayList <> ();

    public List<Producto> listarProducto () {
        return listaProductos ;
    }
    public Producto guardar(Producto prod) { 
        listaProductos.add(prod);
        return prod;
    }
    public void eliminar (String nombre) {
        listaProductos.removeIf(Producto -> Producto.getNombre().equals(nombre));
    } 
}
