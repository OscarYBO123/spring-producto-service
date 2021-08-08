package com.oybo.springboot.app.producto.service.service;

import java.util.List;

import com.oybo.springboot.app.producto.service.model.Producto;

/**
 * Clase de implementacion de Servicio Producto.
 * 
 * @author oscar
 *
 */
public class ProductoServiceImpl implements IProductoService {

	/**
	 * Metodo que obtiene el
	 * producto solicitado por id.
	 * 
	 * @param id de tipo Long es el id del 
	 * 		  prodcuto a buscar
	 * @return Producto con la informacion del Producto solicitado.
	 */
	@Override
	public Producto getProducto(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Metodo que obtiene una lista de 
	 * todos los productos registrados en la base de datos.
	 * 
	 * @return Lista de productos
	 */
	@Override
	public List<Producto> getProductos() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Metodo que realiza la insercion
	 * del producto a la base de datos.
	 * 
	 * @param producto de tipo Product, siendo este el modelo
	 * 		  de producto.
	 * @return Producto guardado en base de datos.
	 */
	@Override
	public Producto addProducto(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Metodo que realiza la actualizacion del
	 * producto en la base de datos.
	 * 
	 * @param producto de tipo Producto que es el modelo
	 *        de producto.
	 * @return String con mensaje de actualización 
	 */
	@Override
	public String updateProducto(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Metodo que realiza la eliminacion
	 * del prodcuto en la base de datos.
	 * 
	 * @param id de tipo Long con el id del prodcuto a eliminar
	 */
	@Override
	public void deleteProducto(Long id) {
		// TODO Auto-generated method stub

	}

}
