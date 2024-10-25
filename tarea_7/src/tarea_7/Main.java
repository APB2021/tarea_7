package tarea_7;

import java.util.List;

public class Main {

	/**
	 * @author Alberto Polo
	 */

	public static void main(String[] args) {

		/*
		 * Realiza un programa Java que lea los datos de 5 alumnos, y genere un
		 * documento XML con estos alumnos.
		 * 
		 * Para cada alumno se tiene la siguiente información: NIA (entero), Nombre
		 * (String), Apellidos (String), Genero (Char), Fecha de Nacimiento (Fecha),
		 * Ciclo (String), Curso (String), Grupo (String).
		 */

		Alumno alumno = new Alumno();
		List<Alumno> listaAlumnos = alumno.leeAlumnos();
		alumno.generaXML(listaAlumnos);
	}
}