package Bodega.Adita.Producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Bodega.Adita.Categoria.Categoria;
import Bodega.Adita.Categoria.CategoriaService;

@Service
public class ProductoService {

	@Autowired
	ProductoRepository repositorio;

	@Autowired
	CategoriaService categoriaService;

	public Producto agregar(ProductoRequestDTO dto) {

		Categoria categoria = categoriaService.buscarCategoria(dto.getCategoriaId());

		Producto producto = new Producto(categoria, dto.getCodigoBarras(), dto.getNombre(), dto.getPrecio(),
				dto.getStock());

		return repositorio.save(producto);
	}

	public Producto buscar(String codigoBarras) {

		Producto producto = repositorio.findByCodigoBarras(codigoBarras).orElse(null);

		return producto;

	}
	
	
	public Producto modificar(Integer id, ProductoRequestDTO dto){
		
		Producto producto = repositorio.findById(id).orElse(null);
		
		producto.setNombre(dto.getNombre());
		producto.setPrecio(dto.getPrecio());
		producto.setStock(dto.getStock());
		
		repositorio.save(producto);
		
		return producto;
	}

}
