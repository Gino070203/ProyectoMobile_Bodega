package Bodega.Adita.Categoria;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private Boolean esCajaLicores;
	private String estado;

	public Categoria() {
	}

	public Categoria(String nombre, Boolean esCajaLicores, String estado) {
		this.nombre = nombre;
		this.esCajaLicores = esCajaLicores;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
