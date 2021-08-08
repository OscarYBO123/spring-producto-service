package com.oybo.springboot.app.producto.service.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.oybo.springboot.app.producto.service.model.Producto;

/**
 * Clase de implementacion de la interface Prodcuto DAO.
 * 
 * @author oscar
 *
 */
public class ProductoDAOImpl implements IProductoDAO {
	
	private JdbcTemplate jdbcTemplate;

	/**
	 * Metodo para obtener el producto de la
	 * base de datos.
	 * 
	 * @param id de tipo long con el id del producto a obtener
	 * @return Prodcuto con la informacion de la BD
	 */
	@Override
	public Producto getProducto(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
