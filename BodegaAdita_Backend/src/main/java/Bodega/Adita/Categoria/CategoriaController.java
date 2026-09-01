package Bodega.Adita.Categoria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	CategoriaService servicio;

	// retorno del codigo 201, que significa que el recurso fue creado
	@PostMapping
	public ResponseEntity<Categoria> agregarCategoria(@Valid @RequestBody CategoriaRequestDTO categoriaRequest) {

		Categoria categoria = new Categoria(categoriaRequest.getNombre().toLowerCase(), categoriaRequest.getEsCajaLicores(),
				categoriaRequest.getEstado().toLowerCase());

		Categoria nuevaCategoria = servicio.agregarCategoria(categoria);
		return ResponseEntity.status(HttpStatus.CREATED).body(nuevaCategoria);
	}

	// retorno del codigo 200, que significa que la peticion fue realizada de manera
	// correcta
	@GetMapping
	public ResponseEntity<List<Categoria>> listarCategorias() {

		List<Categoria> categorias = servicio.listarCategorias();

		return ResponseEntity.ok(categorias);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Categoria> buscarCategoria(@PathVariable Integer id) {

		Categoria categoria = servicio.buscarCategoria(id);

		if (categoria == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

		return ResponseEntity.ok(categoria);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Categoria> modificarCategoria(@PathVariable Integer id,
			@Valid @RequestBody CategoriaRequestDTO categoriaRequest) {

		Categoria categoria = new Categoria(categoriaRequest.getNombre().toLowerCase(), categoriaRequest.getEsCajaLicores(),
				categoriaRequest.getEstado().toLowerCase());

		Categoria categoriaActualizada = servicio.modificarCategoria(id, categoria);

		if (categoriaActualizada == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

		return ResponseEntity.ok(categoriaActualizada);
	}

	@PutMapping("/{id}/desactivar")
	public ResponseEntity<Categoria> desactivarCategoria(@PathVariable Integer id, @RequestParam String estado) {

		Categoria categoriaDesactivada = servicio.desactivarCategoria(id, estado.toLowerCase());

		if (categoriaDesactivada == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

		return ResponseEntity.ok(categoriaDesactivada);
	}

}
