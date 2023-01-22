package modelo.javabean;
import java.util.StringTokenizer;

import java.util.Objects;

public class Empleado {
	private int idEmpleado; 
	private String nombre,apellidos,email;
	private char genero;
	private double salario, comision; 
	private Trabajo trabajo; 
	private Departamento departamento;
	public Empleado() {
		super();
	}
	public Empleado(int idEmpleado, String nombre, String apellidos, String email, char genero, double salario,
			double comision, Trabajo trabajo, Departamento departamento) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.genero = genero;
		this.salario = salario;
		this.comision = comision;
		this.trabajo = trabajo;
		this.departamento = departamento;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getComision() {
		return comision;
	}
	public void setComision(double comision) {
		this.comision = comision;
	}
	public Trabajo getTrabajo() {
		return trabajo;
	}
	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email="
				+ email + ", genero=" + genero + ", salario=" + salario + ", comision=" + comision + ", trabajo="
				+ trabajo + ", departamento=" + departamento + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(idEmpleado);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Empleado))
			return false;
		Empleado other = (Empleado) obj;
		return idEmpleado == other.idEmpleado;
	} 
	
	public double salarioBruto() {
		double sueldo = salario + comision;
		return salario + comision;
	}
		
	public double salarioMensual () {
		double sueldoM = salario/12;
		return salario/12;
	}
	
	public String literalGenero () {
		switch (genero) {
		case  'h' : case 'H':
		return "Hombre";
		case 'm': case 'M':
		return "Mujer";
		default: 
			return "Sexo incorrecto"; }
		}
	
	public String obtenerEmail() {
        StringTokenizer tokens= new StringTokenizer (apellidos);
        String PrimerApellido = tokens.nextToken();

        return nombre.toLowerCase().charAt(0) + PrimerApellido.toLowerCase() + "@gmail.com";}
	
	
	public String nombreCompleto () {
		return nombre+" "+apellidos;
	}
		
		
	}
		
	





