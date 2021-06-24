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
//import uy.gub.agesic.grep.core.dataaccess.model.TipoRelacion;
//import uy.gub.agesic.grep.core.exceptions.BusinessException;
//import uy.gub.agesic.grep.core.requests.TipoRelacionRequest;
//import uy.gub.agesic.grep.core.responses.TipoRelacionResponse;
//import uy.gub.agesic.grep.core.services.impl.TipoRelacionServices;
//import uy.gub.agesic.grep.core.services.impl.utils.IMapper;
//import uy.gub.agesic.grep.core.services.impl.utils.IMapperImpl;
//import uy.gub.agesic.grep.core.services.impl.utils.MapperResolver;
//import uy.gub.agesic.grep.core.utils.FactoryObjects;
//
//@RunWith(SpringRunner.class)
//@Import({TipoRelacionServices.class, IMapperImpl.class, MapperResolver.class})
//@Transactional(propagation = Propagation.REQUIRES_NEW)
//@DataJpaTest
//public class TipoRelacionBusinessTest {
//	
////    @Autowired(required=true)
////    private ITipoRelacionDataAccess tipoRelacionDataAccess;
////    
////    @Autowired(required=true)
////    private TipoRelacionServices tipoRelacionServices;
////    
////    @Autowired
////    private IMapper mapper;
////    
////    @After
////    public void clear() {
////        this.tipoRelacionDataAccess.deleteAll();
////    }    
////    
////    @Test
////    public void get() throws BusinessException {
////    	TipoRelacionRequest request = FactoryObjects.generarTipoRelacionRequest1();
////    	TipoRelacion modelAGuardar = mapper.fromRequest(request);
////    	tipoRelacionDataAccess.saveAndFlush(modelAGuardar);
////    	TipoRelacionResponse responseAGuardarExcepted = mapper.toResponse(modelAGuardar);
////    	TipoRelacionResponse responseGuardado = tipoRelacionServices.get(modelAGuardar.getId());
////    	assertEquals(responseAGuardarExcepted, responseGuardado);
////    }
////    
////    @Test
////    public void list() throws BusinessException {
////    	TipoRelacionRequest request1 = FactoryObjects.generarTipoRelacionRequest1();
////    	TipoRelacionRequest request2 = FactoryObjects.generarTipoRelacionRequest2();
////    	tipoRelacionServices.create(request1);
////    	tipoRelacionServices.create(request2);
////    	TipoRelacionResponse responseExcepted1 = mapper.toResponse(mapper.fromRequest(request1));
////    	TipoRelacionResponse responseExcepted2 = mapper.toResponse(mapper.fromRequest(request2));
////    	List<TipoRelacionResponse> responseGuardado = tipoRelacionServices.list();
////    	assertEquals(responseGuardado, List.of(responseExcepted1, responseExcepted2));
////    }
////
////    @Test
////    public void create() throws BusinessException {
////    	TipoRelacionRequest tipoRelacionRequest = FactoryObjects.generarTipoRelacionRequest1();
////    	tipoRelacionServices.create(tipoRelacionRequest);
////        TipoRelacion tipoRelacionAGuardar = mapper.fromRequest(tipoRelacionRequest);
////        TipoRelacion tipoRelacionGuardado = tipoRelacionDataAccess.findById(Long.valueOf(1)).get();
////        assertEquals(tipoRelacionAGuardar, tipoRelacionGuardado);
////	}
////    
////    @Test
////    public void update() throws BusinessException {
////    	TipoRelacionRequest tipoRelacionRequest = FactoryObjects.generarTipoRelacionRequest1();
////    	tipoRelacionServices.create(tipoRelacionRequest);
////    	String nuevoTexto = tipoRelacionRequest.getTipoRelacion().concat(" - Modificada");
////    	tipoRelacionRequest.setTipoRelacion(nuevoTexto);
////    	tipoRelacionServices.update(tipoRelacionRequest, Long.valueOf(1));
////    	TipoRelacion tipoRelacionAGuardar = mapper.fromRequest(tipoRelacionRequest);
////    	TipoRelacion tipoRelacionGuardado = tipoRelacionDataAccess.findById(Long.valueOf(1)).get();
////    	assertEquals(tipoRelacionAGuardar.getTipoRelacion(), tipoRelacionGuardado.getTipoRelacion());
////    	assertEquals(tipoRelacionAGuardar.getId(), tipoRelacionGuardado.getId());
//////    	assertNotEquals(tipoRelacionAGuardar.getUltimaModificacion(), tipoRelacionGuardado.getUltimaModificacion());
////    }
////    
////    /**
////     * PRECONDICION: El resultado de este test es válido si create() es válido
////     * @throws BusinessException
////     */
////    @Test
////    public void delete() throws BusinessException {
////    	TipoRelacionRequest request = FactoryObjects.generarTipoRelacionRequest1();
////    	tipoRelacionServices.create(request);
////    	TipoRelacionResponse response = tipoRelacionServices.get(Long.valueOf(1));
////    	tipoRelacionServices.delete(response.getId());
////    	boolean sigueGuardado = tipoRelacionDataAccess.findById(Long.valueOf(1)).isPresent();
////    	assertFalse(sigueGuardado);
////    }
//    
//}
