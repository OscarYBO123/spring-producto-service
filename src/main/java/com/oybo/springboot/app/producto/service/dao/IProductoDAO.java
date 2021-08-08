package com.oybo.springboot.app.producto.service.dao;

import com.oybo.springboot.app.producto.service.model.Producto;

/**
 * Interface DAO que interactua con la base de datos;
 * 
 * @author oscar
 *
 */
public interface IProductoDAO {
	
	/**
	 * Declaracion de metodo para obtener el producto de la
	 * base de datos.
	 * 
	 * @param id de tipo long con el id del producto a obtener
	 * @return Prodcuto con la informacion de la BD
	 */
	public Producto getProducto(Long id);

}
