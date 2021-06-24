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
//import uy.gub.agesic.grep.core.dataaccess.model.Pais;
//import uy.gub.agesic.grep.core.exceptions.BusinessException;
//import uy.gub.agesic.grep.core.requests.PaisRequest;
//import uy.gub.agesic.grep.core.responses.PaisResponse;
//import uy.gub.agesic.grep.core.services.impl.PaisServices;
//import uy.gub.agesic.grep.core.services.impl.utils.IMapper;
//import uy.gub.agesic.grep.core.services.impl.utils.IMapperImpl;
//import uy.gub.agesic.grep.core.services.impl.utils.MapperResolver;
//import uy.gub.agesic.grep.core.utils.FactoryObjects;
//
//@RunWith(SpringRunner.class)
//@Import({PaisServices.class, IMapperImpl.class, MapperResolver.class})
//@Transactional(propagation = Propagation.REQUIRES_NEW)
//@DataJpaTest
//public class PaisBusinessTests {
//	
////    @Autowired(required=true)
////    private IPaisDataAccess paisDataAccess;
////    
////    @Autowired(required=true)
////    private PaisServices paisServices;
////    
////    @Autowired
////    private IMapper mapper;
////    
////    @After
////    public void clear() {
////        this.paisDataAccess.deleteAll();
////    }    
////    
////    @Test
////    public void get() throws BusinessException {
////    	PaisRequest request = FactoryObjects.generarPaisRequestUruguay();
////    	Pais modelAGuardar = mapper.fromRequest(request);
////    	paisDataAccess.saveAndFlush(modelAGuardar);
////    	PaisResponse responseAGuardarExcepted = mapper.toResponse(modelAGuardar);
////    	PaisResponse responseGuardado = paisServices.get(modelAGuardar.getId());
////    	assertEquals(responseAGuardarExcepted, responseGuardado);
////    }
////    
////    @Test
////    public void list() throws BusinessException {
////    	PaisRequest request1 = FactoryObjects.generarPaisRequestLaArgentina();
////    	PaisRequest request2 = FactoryObjects.generarPaisRequestUruguay();
////    	paisServices.create(request1);
////    	paisServices.create(request2);
////    	PaisResponse responseExcepted1 = mapper.toResponse(mapper.fromRequest(request1));
////    	PaisResponse responseExcepted2 = mapper.toResponse(mapper.fromRequest(request2));
////    	List<PaisResponse> responseGuardado = paisServices.list();
////    	assertEquals(responseGuardado, List.of(responseExcepted1, responseExcepted2));
////    }
////
////    @Test
////    public void create() throws BusinessException {
////    	PaisRequest paisRequest = FactoryObjects.generarPaisRequestUruguay();
////    	paisServices.create(paisRequest);
////        Pais paisAGuardar = mapper.fromRequest(paisRequest);
////        Pais paisGuardado = paisDataAccess.findById(Long.valueOf(1)).get();
////        assertEquals(paisAGuardar, paisGuardado);
////	}
////    
////    @Test
////    public void update() throws BusinessException {
////    	PaisRequest paisRequest = FactoryObjects.generarPaisRequestUruguay();
////    	paisServices.create(paisRequest);
////    	String nuevoTexto = paisRequest.getDescripcion().concat(" - Modificado");
////    	paisRequest.setDescripcion(nuevoTexto);
////    	paisServices.update(paisRequest, Long.valueOf(1));
////    	Pais paisAGuardar = mapper.fromRequest(paisRequest);
////    	Pais paisGuardado = paisDataAccess.findById(Long.valueOf(1)).get();
////    	assertEquals(paisAGuardar.getCodigo(), paisGuardado.getCodigo());
////    	assertEquals(paisAGuardar.getId(), paisGuardado.getId());
////    	assertEquals(nuevoTexto, paisGuardado.getDescripcion());
//////    	assertNotEquals(paisAGuardar.getUltimaModificacion(), paisGuardado.getUltimaModificacion());
////    }
////    
////    /**
////     * PRECONDICION: El resultado de este test es válido si create() es válido
////     * @throws BusinessException
////     */
////    @Test
////    public void delete() throws BusinessException {
////    	PaisRequest request = FactoryObjects.generarPaisRequestUruguay();
////    	paisServices.create(request);
////    	PaisResponse response = paisServices.get(Long.valueOf(1));
////    	paisServices.delete(response.getId());
////    	boolean sigueGuardado = paisDataAccess.findById(Long.valueOf(1)).isPresent();
////    	assertFalse(sigueGuardado);
////    }
//    
//}
