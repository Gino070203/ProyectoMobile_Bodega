package Bodega.Adita.Categoria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

	@Autowired
	CategoriaRepositorio repositorio;

	public Categoria agregarCategoria(Categoria categoria) {
		return repositorio.save(categoria);
	}

	public List<Categoria> listarCategorias() {
		return repositorio.findAll();
	}

	public Categoria buscarCategoria(Integer id) {
		return repositorio.findById(id).orElse(null);
	}

	public Categoria modificarCategoria(Integer id, Categoria categoria) {

		Categoria cate = buscarCategoria(id);

		if (cate != null) {

			cate.setNombre(categoria.getNombre());
			cate.setEstado(categoria.getEstado());
			cate.setEsCajaLicores(categoria.getEsCajaLicores());

			return repositorio.save(cate);

		}

		return null;
	}

	public Categoria desactivarCategoria(Integer id, String estado) {

		Categoria cate = buscarCategoria(id);

		if (cate != null) {

			cate.setEstado(estado.toUpperCase());

			return repositorio.save(cate);

		}

		return null;

	}

}
