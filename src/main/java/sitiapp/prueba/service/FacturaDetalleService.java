package sitiapp.prueba.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import sitiapp.prueba.model.FacturaDetalle;
import sitiapp.prueba.repository.FacturaDetalleRepository;

@Service
public class FacturaDetalleService implements FacturaDetalleRepository {
	
	@Autowired
	private FacturaDetalleRepository detalleRepository;

	@Override
	public List<FacturaDetalle> findAll() {
		return detalleRepository.findAll();
	}
	
	public List<FacturaDetalle> findAlldetalleID(long consecutivo){
		List<FacturaDetalle> detalles = detalleRepository.findAll();
		List<FacturaDetalle> detalle = new ArrayList<>();
		for(int i=0;i<detalles.size();i++) {
			if(detalles.get(i).getConsecutivo()==consecutivo) {
				detalle.add(detalles.get(i));
			}
		}
		return detalle; 
	}

	@Override
	public List<FacturaDetalle> findAll(Sort sort) {
		return detalleRepository.findAll(sort);
	}

	@Override
	public List<FacturaDetalle> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends FacturaDetalle> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends FacturaDetalle> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends FacturaDetalle> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<FacturaDetalle> entities) {
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
	public FacturaDetalle getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FacturaDetalle getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends FacturaDetalle> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends FacturaDetalle> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<FacturaDetalle> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends FacturaDetalle> S save(S entity) {
		return detalleRepository.save(entity);
	}

	@Override
	public Optional<FacturaDetalle> findById(Long id) {
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
		detalleRepository.deleteById(id);
		
	}

	@Override
	public void delete(FacturaDetalle entity) {
		detalleRepository.delete(entity);
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends FacturaDetalle> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends FacturaDetalle> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends FacturaDetalle> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends FacturaDetalle> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends FacturaDetalle> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	} 
	
}
