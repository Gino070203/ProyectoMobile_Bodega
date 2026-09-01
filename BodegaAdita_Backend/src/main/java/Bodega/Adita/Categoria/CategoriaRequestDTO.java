package Bodega.Adita.Categoria;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class CategoriaRequestDTO {

	@Positive(message = "El id no puede ser menor que 0")
	private Integer id;

	@NotBlank(message = "El nombre es un campo obligatorio y no puede tener espacios en blanco")
	private String nombre;

	@NotNull(message = "El campo para saber si pertenece a licores es obligatorio")
	private Boolean esCajaLicores;

	@NotBlank(message = "El estado es un campo obligatorio")
	private String estado;

	public CategoriaRequestDTO() {
	}

	public CategoriaRequestDTO(String nombre,Boolean esCajaLicores, String estado) {
		this.nombre = nombre;
		this.esCajaLicores = esCajaLicores;
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getEsCajaLicores() {
		return esCajaLicores;
	}

	public void setEsCajaLicores(Boolean esCajaLicores) {
		this.esCajaLicores = esCajaLicores;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
