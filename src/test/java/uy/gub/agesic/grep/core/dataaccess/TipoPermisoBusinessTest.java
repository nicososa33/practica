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
//import uy.gub.agesic.grep.core.dataaccess.model.TipoPermiso;
//import uy.gub.agesic.grep.core.exceptions.BusinessException;
//import uy.gub.agesic.grep.core.requests.TipoPermisoRequest;
//import uy.gub.agesic.grep.core.responses.TipoPermisoResponse;
//import uy.gub.agesic.grep.core.services.impl.TipoPermisoServices;
//import uy.gub.agesic.grep.core.services.impl.utils.IMapper;
//import uy.gub.agesic.grep.core.services.impl.utils.IMapperImpl;
//import uy.gub.agesic.grep.core.services.impl.utils.MapperResolver;
//import uy.gub.agesic.grep.core.utils.FactoryObjects;
//
//@RunWith(SpringRunner.class)
//@Import({TipoPermisoServices.class, IMapperImpl.class, MapperResolver.class})
//@Transactional(propagation = Propagation.REQUIRES_NEW)
//@DataJpaTest
//public class TipoPermisoBusinessTest {
//	
////    @Autowired(required=true)
////    private ITipoPermisoDataAccess tipoPermisoDataAccess;
////    
////    @Autowired(required=true)
////    private TipoPermisoServices tipoPermisoServices;
////    
////    @Autowired
////    private IMapper mapper;
////    
////    @After
////    public void clear() {
////        this.tipoPermisoDataAccess.deleteAll();
////    }    
////    
////    @Test
////    public void get() throws BusinessException {
////    	TipoPermisoRequest request = FactoryObjects.generarTipoPermisoRequest1();
////    	TipoPermiso modelAGuardar = mapper.fromRequest(request);
////    	tipoPermisoDataAccess.saveAndFlush(modelAGuardar);
////    	TipoPermisoResponse responseAGuardarExcepted = mapper.toResponse(modelAGuardar);
////    	TipoPermisoResponse responseGuardado = tipoPermisoServices.get(modelAGuardar.getId());
////    	assertEquals(responseAGuardarExcepted, responseGuardado);
////    }
////    
////    @Test
////    public void list() throws BusinessException {
////    	TipoPermisoRequest request1 = FactoryObjects.generarTipoPermisoRequest1();
////    	TipoPermisoRequest request2 = FactoryObjects.generarTipoPermisoRequest2();
////    	tipoPermisoServices.create(request1);
////    	tipoPermisoServices.create(request2);
////    	TipoPermisoResponse responseExcepted1 = mapper.toResponse(mapper.fromRequest(request1));
////    	TipoPermisoResponse responseExcepted2 = mapper.toResponse(mapper.fromRequest(request2));
////    	List<TipoPermisoResponse> responseGuardado = tipoPermisoServices.list();
////    	assertEquals(responseGuardado, List.of(responseExcepted1, responseExcepted2));
////    }
////
////    @Test
////    public void create() throws BusinessException {
////    	TipoPermisoRequest tipoPermisoRequest = FactoryObjects.generarTipoPermisoRequest1();
////    	tipoPermisoServices.create(tipoPermisoRequest);
////        TipoPermiso tipoPermisoAGuardar = mapper.fromRequest(tipoPermisoRequest);
////        TipoPermiso tipoPermisoGuardado = tipoPermisoDataAccess.findById(Long.valueOf(1)).get();
////        assertEquals(tipoPermisoAGuardar, tipoPermisoGuardado);
////	}
////    
////    @Test
////    public void update() throws BusinessException {
////    	TipoPermisoRequest tipoPermisoRequest = FactoryObjects.generarTipoPermisoRequest1();
////    	tipoPermisoServices.create(tipoPermisoRequest);
////    	String nuevoTexto = tipoPermisoRequest.getDescripcion().concat(" - Modificado");
////    	tipoPermisoRequest.setDescripcion(nuevoTexto);
////    	tipoPermisoServices.update(tipoPermisoRequest, Long.valueOf(1));
////    	TipoPermiso tipoPermisoAGuardar = mapper.fromRequest(tipoPermisoRequest);
////    	TipoPermiso tipoPermisoGuardado = tipoPermisoDataAccess.findById(Long.valueOf(1)).get();
////    	assertEquals(tipoPermisoAGuardar.getCodigo(), tipoPermisoGuardado.getCodigo());
////    	assertEquals(tipoPermisoAGuardar.getId(), tipoPermisoGuardado.getId());
////    	assertEquals(nuevoTexto, tipoPermisoGuardado.getDescripcion());
//////    	assertNotEquals(tipoPermisoAGuardar.getUltimaModificacion(), tipoPermisoGuardado.getUltimaModificacion());
////    }
////    
////    /**
////     * PRECONDICION: El resultado de este test es válido si create() es válido
////     * @throws BusinessException
////     */
////    @Test
////    public void delete() throws BusinessException {
////    	TipoPermisoRequest request = FactoryObjects.generarTipoPermisoRequest1();
////    	tipoPermisoServices.create(request);
////    	TipoPermisoResponse response = tipoPermisoServices.get(Long.valueOf(1));
////    	tipoPermisoServices.delete(response.getId());
////    	boolean sigueGuardado = tipoPermisoDataAccess.findById(Long.valueOf(1)).isPresent();
////    	assertFalse(sigueGuardado);
////    }
//    
//}
