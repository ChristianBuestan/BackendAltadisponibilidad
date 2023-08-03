package ups.edu.ec.prueba2023Buestan.services;

import java.io.IOException;
import java.util.List;

import javax.ejb.Singleton;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ups.edu.ec.prueba2023Buestan.dao.LibroDao;
import ups.edu.ec.prueba2023Buestan.model.Libro;


@Path("libro")
@Singleton
public class LibroServices {
	
	
    
	@Inject
	LibroDao daoLibro;
	
	

	@POST
	@Path("crear")
	@Produces(MediaType.APPLICATION_JSON) //lo mismo que poner app/json
	@Consumes("application/json")
	public String guardarProductoDAO(Libro p) throws IOException {
		try {
			if (!p.isValid()) {
	            return "{\"resultado\": \"ERROR\", \"mensaje\": \"Nombre de libro inválido\"}";
	        }
			daoLibro.insert(p);
			
		   
	        
		} catch (Exception e) {
			return "{\"resultado\": \"ERROR\"}";
			
		}
		return "{\"resultado\": \"OK\"}";
	}
	@POST
	@Path("eliminar")
	@Produces(MediaType.APPLICATION_JSON) //lo mismo que poner app/json
	@Consumes("application/json")
	public String eliminarProductoDAO(int codigo) {
		try {
			daoLibro.delete(codigo);
			
			
		} catch (Exception e) {
			return "{\"resultado\": \"ERROR\"}";
			
		}
		return "{\"resultado\": \"OK\"}";
		
	}
	@POST
	@Path("modificar")
	@Produces(MediaType.APPLICATION_JSON) //lo mismo que poner app/json
	@Consumes("application/json")
	public String modificarProductoDAO(Libro p) {
		try {
			if (!p.isValid()) {
	            return "{\"resultado\": \"ERROR\", \"mensaje\": \"Nombre de libro inválido\"}";
	        }
			daoLibro.update(p);
			
			
			
			
		} catch (Exception e) {
			return "{\"resultado\": \"ERROR\"}";
			
		}
		return "{\"resultado\": \"OK\"}";
	}
	@GET
	@Path("listar")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Libro> getlistadoProductos(){
		return daoLibro.getList();
	}
	

}
