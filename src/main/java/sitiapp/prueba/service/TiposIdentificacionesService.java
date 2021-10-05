package sitiapp.prueba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import sitiapp.prueba.model.TiposIdentificaciones;
import sitiapp.prueba.repository.TiposIdentificacionesRepository;

@Service
public class TiposIdentificacionesService implements TiposIdentificacionesRepository {
	
	@Autowired
	private TiposIdentificacionesRepository identificacionesRepository;

	@Override
	public List<TiposIdentificaciones> findAll() {
		return identificacionesRepository.findAll();
	}
	
	public TiposIdentificaciones findAlltipoid(long id) {
		TiposIdentificaciones tipo = null; 
		List<TiposIdentificaciones> tipos= identificacionesRepository.findAll(); 
		for(int i = 0; i<tipos.size(); i++) {
			if(tipos.get(i).getTipoID()== id) {
				tipo = tipos.get(i);  
			}
		}
		return tipo; 
	}
	

	@Override
	public List<TiposIdentificaciones> findAll(Sort sort) {
		return identificacionesRepository.findAll(sort);
	}

	@Override
	public List<TiposIdentificaciones> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TiposIdentificaciones> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends TiposIdentificaciones> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TiposIdentificaciones> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<TiposIdentificaciones> entities) {
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
	public TiposIdentificaciones getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TiposIdentificaciones getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TiposIdentificaciones> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TiposIdentificaciones> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<TiposIdentificaciones> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TiposIdentificaciones> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<TiposIdentificaciones> findById(Long id) {
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(TiposIdentificaciones entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends TiposIdentificaciones> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends TiposIdentificaciones> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TiposIdentificaciones> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TiposIdentificaciones> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends TiposIdentificaciones> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	} 

}
