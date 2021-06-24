//package uy.gub.agesic.grep.core.dataaccess;
//
//import static org.junit.Assert.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import java.util.List;
//
//import org.junit.After;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.context.annotation.Import;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//import uy.gub.agesic.grep.core.dataaccess.model.UnidadEjecutora;
//import uy.gub.agesic.grep.core.exceptions.BusinessException;
//import uy.gub.agesic.grep.core.requests.UnidadEjecutoraRequest;
//import uy.gub.agesic.grep.core.responses.UnidadEjecutoraResponse;
//import uy.gub.agesic.grep.core.services.impl.UnidadEjecutoraServices;
//import uy.gub.agesic.grep.core.services.impl.utils.IMapper;
//import uy.gub.agesic.grep.core.services.impl.utils.IMapperImpl;
//import uy.gub.agesic.grep.core.services.impl.utils.MapperResolver;
//import uy.gub.agesic.grep.core.utils.FactoryObjects;
//
//@RunWith(SpringRunner.class)
//@Import({UnidadEjecutoraServices.class, IMapperImpl.class, MapperResolver.class})
//@Transactional(propagation = Propagation.REQUIRES_NEW)
//@DataJpaTest
//public class UnidadEjecutoraBusinessTest {
//	
////    @Autowired(required=true)
////    private IUnidadEjecutoraDataAccess unidadEjecutoraDataAccess;
////    
////    @Autowired(required=true)
////    private UnidadEjecutoraServices unidadEjecutoraServices;
////    
////    @Autowired
////    private IMapper mapper;
//    
////    @After
////    public void clear() {
////        this.unidadEjecutoraDataAccess.deleteAll();
////    }    
////    
////    @Test
////    public void get() throws BusinessException {
////    	UnidadEjecutoraRequest request = FactoryObjects.generarUnidadEjecutoraRequest1();
////    	UnidadEjecutora modelAGuardar = mapper.fromRequest(request);
////    	unidadEjecutoraDataAccess.saveAndFlush(modelAGuardar);
////    	UnidadEjecutoraResponse responseAGuardarExcepted = mapper.toResponse(modelAGuardar);
////    	UnidadEjecutoraResponse responseGuardado = unidadEjecutoraServices.get(modelAGuardar.getId());
////    	assertEquals(responseAGuardarExcepted, responseGuardado);
////    }
////    
////    @Test
////    public void list() throws BusinessException {
////    	UnidadEjecutoraRequest request1 = FactoryObjects.generarUnidadEjecutoraRequest1();
////    	UnidadEjecutoraRequest request2 = FactoryObjects.generarUnidadEjecutoraRequest2();
////    	unidadEjecutoraServices.create(request1);
////    	unidadEjecutoraServices.create(request2);
////    	UnidadEjecutoraResponse responseExcepted1 = mapper.toResponse(mapper.fromRequest(request1));
////    	UnidadEjecutoraResponse responseExcepted2 = mapper.toResponse(mapper.fromRequest(request2));
////    	List<UnidadEjecutoraResponse> responseGuardado = unidadEjecutoraServices.list();
////    	assertEquals(responseGuardado, List.of(responseExcepted1, responseExcepted2));
////    }
////
////    @Test
////    public void create() throws BusinessException {
////    	UnidadEjecutoraRequest unidadEjecutoraRequest = FactoryObjects.generarUnidadEjecutoraRequest1();
////    	unidadEjecutoraServices.create(unidadEjecutoraRequest);
////        UnidadEjecutora unidadEjecutoraAGuardar = mapper.fromRequest(unidadEjecutoraRequest);
////        UnidadEjecutora unidadEjecutoraGuardado = unidadEjecutoraDataAccess.findById(Long.valueOf(1)).get();
////        assertEquals(unidadEjecutoraAGuardar, unidadEjecutoraGuardado);
////	}
////    
////    @Test
////    public void update() throws BusinessException {
////    	UnidadEjecutoraRequest unidadEjecutoraRequest = FactoryObjects.generarUnidadEjecutoraRequest1();
////    	unidadEjecutoraServices.create(unidadEjecutoraRequest);
////    	String nuevoTexto = unidadEjecutoraRequest.getDescripcion().concat(" - Modificada");
////    	unidadEjecutoraRequest.setDescripcion(nuevoTexto);
////    	unidadEjecutoraServices.update(unidadEjecutoraRequest, Long.valueOf(1));
////    	UnidadEjecutora unidadEjecutoraAGuardar = mapper.fromRequest(unidadEjecutoraRequest);
////    	UnidadEjecutora unidadEjecutoraGuardado = unidadEjecutoraDataAccess.findById(Long.valueOf(1)).get();
////    	assertEquals(unidadEjecutoraAGuardar.getCodigo(), unidadEjecutoraGuardado.getCodigo());
////    	assertEquals(nuevoTexto, unidadEjecutoraGuardado.getDescripcion());
////    	assertEquals(unidadEjecutoraAGuardar.getId(), unidadEjecutoraGuardado.getId());
//////    	assertNotEquals(unidadEjecutoraAGuardar.getUltimaModificacion(), unidadEjecutoraGuardado.getUltimaModificacion());
////    }
////    
////    /**
////     * PRECONDICION: El resultado de este test es válido si create() es válido
////     * @throws BusinessException
////     */
////    @Test
////    public void delete() throws BusinessException {
////    	UnidadEjecutoraRequest request = FactoryObjects.generarUnidadEjecutoraRequest1();
////    	unidadEjecutoraServices.create(request);
////    	UnidadEjecutoraResponse response = unidadEjecutoraServices.get(Long.valueOf(1));
////    	unidadEjecutoraServices.delete(response.getId());
////    	boolean sigueGuardado = unidadEjecutoraDataAccess.findById(Long.valueOf(1)).isPresent();
////    	assertFalse(sigueGuardado);
////    }
//    
//}
