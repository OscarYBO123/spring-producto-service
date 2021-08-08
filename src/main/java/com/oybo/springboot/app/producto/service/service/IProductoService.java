package com.oybo.springboot.app.producto.service.service;

import java.util.List;

import com.oybo.springboot.app.producto.service.model.Producto;

/**
 * Interface de Prodcuto Service, en donde se declaran
 * los metodos a utilizar.
 * 
 * @author oscar
 *
 */
public interface IProductoService {
	
	/**
	 * Declaración de metodo que obtendra el
	 * producto solicitado por id.
	 * 
	 * @param id de tipo Long es el id del 
	 * 		  prodcuto a buscar
	 * @return Producto con la informacion del Producto solicitado.
	 */
	public Producto getProducto(Long id);
	
	/**
	 * Declaracion de metodo que obtiene una lista de 
	 * todos los productos registrados en la base de datos.
	 * 
	 * @return Lista de productos
	 */
	public List<Producto> getProductos();
	
	/**
	 * Declaracion del metodo que realiza la insercion
	 * del producto a la base de datos.
	 * 
	 * @param producto de tipo Product, siendo este el modelo
	 * 		  de producto.
	 * @return Producto guardado en base de datos.
	 */
	public Producto addProducto(Producto producto);
	
	/**
	 * Declaracion de metodo que realiza la actualizacion del
	 * producto en la base de datos.
	 * 
	 * @param producto de tipo Producto que es el modelo
	 *        de producto.
	 * @return String con mensaje de actualización 
	 */
	public String updateProducto(Producto producto);
	
	/**
	 * Declaracion de metodo que realiza la eliminacion
	 * del prodcuto en la base de datos.
	 * 
	 * @param id de tipo Long con el id del prodcuto a eliminar
	 */
	public void deleteProducto(Long id);

}
