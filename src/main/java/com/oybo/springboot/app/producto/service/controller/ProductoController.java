package com.oybo.springboot.app.producto.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oybo.springboot.app.producto.service.model.Producto;
import com.oybo.springboot.app.producto.service.service.IProductoService;

@Controller
public class ProductoController {
	
	@Autowired
	private IProductoService productoService;

	@RequestMapping(value = "/obtenerProducto/{id}")
	public ResponseEntity<Producto> getProducto(@PathVariable Long id){
		
		Producto prodcuto = productoService.getProducto(id);
		
		return new ResponseEntity<Producto>(prodcuto, HttpStatus.OK);
	}
}
