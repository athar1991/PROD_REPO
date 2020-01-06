package com.ahss.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ahss.model.ProductModel;

@Path("/product")
public class ProductRestController {

	@GET
	@Path("/view")
	@Produces(MediaType.APPLICATION_XML)
	public ProductModel viewProduct() {
		return new ProductModel(658,"Pen",89.23);
	}
}
