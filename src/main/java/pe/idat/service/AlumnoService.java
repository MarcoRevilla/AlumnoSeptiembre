package pe.idat.service;

import java.util.List;

import pe.idat.dto.AlumnoDTO;
import pe.idat.model.Alumno;

public interface AlumnoService {
	
	List<AlumnoDTO> listar();
	AlumnoDTO obtenerId(Integer id);
	void guardar(AlumnoDTO alumno);
	void eliminar(Integer id);
	void actualizar(AlumnoDTO alumno);
	
}
