package sitiapp.prueba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import sitiapp.prueba.model.Productos;
import sitiapp.prueba.repository.ProductosRepository;

@Service
public class ProductosService implements ProductosRepository {
	
	@Autowired
	private ProductosRepository productosRepository;

	@Override
	public List<Productos> findAll() {
		return productosRepository.findAll();
	}
	
	public Productos findAllidproducto(long id) {
		Productos producto = null;
		List<Productos> productos = productosRepository.findAll();
		for(int i = 0; i<productos.size(); i++) {
			if(productos.get(i).getId() == id) {
				producto = productos.get(i);
			}
		}
		return producto; 
	}

	@Override
	public List<Productos> findAll(Sort sort) {
		return productosRepository.findAll(sort);
	}

	@Override
	public List<Productos> findAllById(Iterable<Long> ids) {
		return productosRepository.findAllById(ids);
	}

	@Override
	public <S extends Productos> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Productos> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Productos> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Productos> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Productos getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Productos getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Productos> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Productos> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Productos> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Productos> S save(S entity) {
		return productosRepository.save(entity);
	}

	@Override
	public Optional<Productos> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		productosRepository.deleteById(id);
		
	}

	@Override
	public void delete(Productos entity) {
		productosRepository.delete(entity);
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Productos> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Productos> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Productos> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Productos> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Productos> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	} 

}
