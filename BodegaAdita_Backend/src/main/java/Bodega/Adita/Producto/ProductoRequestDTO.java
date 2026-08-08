package Bodega.Adita.Producto;

import java.math.BigDecimal;

public class ProductoRequestDTO {

	private Integer categoriaId;
	private String codigoBarras;
	private String nombre;
	private BigDecimal precio;
	private Integer stock;

	public ProductoRequestDTO() {
	}

	public ProductoRequestDTO(Integer categoriaId, String codigoBarras, String nombre, BigDecimal precio, Integer stock) {
		this.categoriaId = categoriaId;
		this.codigoBarras = codigoBarras;
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
