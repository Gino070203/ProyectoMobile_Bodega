package Bodega.Adita.Producto;

import java.math.BigDecimal;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class ProductoRequestDTO {

	// Anotaciones de Jakarta Bean Validation
	/*
	 * Permite que los datos de tipo caracter no sean nulos, no esten vacios y
	 * contenga al menos un caracter que no sea un espacio en blanco
	 */

	// Utilizado para validar que un valor sea mayor o igual a un valor minimo
	// especificado
	@Min(value = 0, message = "La categoriaID no puede ser negativa")
	private Integer categoriaId;

	@NotBlank(message = "El codigo de barras es obligatorio")
	private String codigoBarras;

	@NotBlank(message = "El nombre es obligatorio")
	private String nombre;

	// Indica que el precio no puede ser negativo
	@Positive(message = "El precio debe ser mayor a cero")
	private BigDecimal precio;

	@Min(value = 0, message = "El stock no puede ser negativo")
	private Integer stock;

	public ProductoRequestDTO() {
	}

	public ProductoRequestDTO(Integer categoriaId, String codigoBarras, String nombre, BigDecimal precio,
			Integer stock) {
		this.categoriaId = categoriaId;
		this.codigoBarras = codigoBarras;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public ProductoRequestDTO(String nombre, BigDecimal precio, Integer stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public Integer getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Integer categoriaId) {
		this.categoriaId = categoriaId;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

}
