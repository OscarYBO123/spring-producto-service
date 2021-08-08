package com.oybo.springboot.app.producto.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.oybo.springboot.app.producto.service.model.Producto;

/**
 * Clase Producto Mapper para realizar el mapeo del resultado de la
 * consulta en base de datos.
 * 
 * @author oscar
 *
 */
public class ProductoMapper implements RowMapper<Producto>{

	/*+
	 * Metodo que realiza el mapeo
	 */
	@Override
	public Producto mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Producto productoMapper = new Producto();
		productoMapper.setId(rs.getLong("id_producto"));
		productoMapper.setNombre(rs.getString("nombre_producto"));
		productoMapper.setDescripcion("descripcion_producto");
		productoMapper.setPrecio(rs.getDouble("precio"));
		
		return productoMapper;
	}

}
