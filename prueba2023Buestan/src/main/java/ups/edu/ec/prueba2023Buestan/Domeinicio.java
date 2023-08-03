package ups.edu.ec.prueba2023Buestan;

//import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import ups.edu.ec.prueba2023Buestan.dao.LibroDao;
//import ups.edu.ec.prueba2023Buestan.model.Libro;
@Singleton
@Startup
public class Domeinicio {
	@Inject
	LibroDao daoLibro;
	/*
	@PostConstruct
	public void Inicio() {
		Libro p1=new Libro();
		p1.setAutor("Oliver");
		p1.setNombre("Winner");
		daoLibro.insert(p1);
		Libro p2=new Libro();
		p2.setAutor("Salmos");
		p2.setNombre("Walson");
		daoLibro.insert(p2);
		
	}*/
}
