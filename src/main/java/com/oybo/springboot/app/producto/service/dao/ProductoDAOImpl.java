package com.oybo.springboot.app.producto.service.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.oybo.springboot.app.producto.service.mapper.ProductoMapper;
import com.oybo.springboot.app.producto.service.model.Producto;

/**
 * Clase de implementacion de la interface Prodcuto DAO.
 * 
 * @author oscar
 *
 */
@Repository
public class ProductoDAOImpl implements IProductoDAO {
	
	@Autowired
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
		
		Producto producto = jdbcTemplate.queryForObject("SELECT * FROM productos WHERE ID_PRODUCTO = ?", new ProductoMapper(), id);
		
		return producto;
	}

}
