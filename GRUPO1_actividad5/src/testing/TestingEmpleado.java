package testing;

import modelo.javabean.Departamento;
import modelo.javabean.Empleado;
import modelo.javabean.Localidad;
import modelo.javabean.Trabajo;

public class TestingEmpleado {

	public static void main(String[] args) {
		
		Localidad loc = new Localidad(1, "Calle almidón 1", "Madrid", "España");
		Departamento dept = new Departamento(1, "Contabilidad", loc);
		Trabajo trabajo = new Trabajo("3", "Controller", 30000, 40000);
				         
				
		Empleado emp1 = new Empleado(567, "Alberto", "Noriega refertui", "alberto@gmail.com", 'h', 34.675, 325, trabajo, dept);
		//Empleado emp2 = new Empleado (456, "Lucia", "olivo fret", "pepe@gmail.com", 'M', 32.456, 786, trabajo, dept);
		
		//System.out.println(emp1);
		//System.out.println("");
		//System.out.println("Departamento empleado: " +emp1.getDepartamento());
		//System.out.println("Trabajo del empleado: " +emp1.getTrabajo());
		//System.out.println(emp1.obtenerEmail());
		
		//System.out.println("");
		
		System.out.println("Nombre: " + "" +emp1.getNombre());
		System.out.println("Apellidos : " + emp1.getApellidos());
		System.out.println("Género : " +emp1.literalGenero());
		System.out.println("Nombre Departamento: " + dept.getDescripcion());
		System.out.println("Nombre de su trabajo: " +trabajo.getDescripcion());
		System.out.println("Dirección: " +loc.getDireccion()+ " , " +loc.getCiudad()+ " , " +loc.getPais());
		
		// System.out.println(+loc.()+emp1.getTrabajo());  Pregunta!!! 
		

	}

}
