//package uy.gub.agesic.grep.core.dataaccess;
//
//import static org.junit.Assert.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertEquals;
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
//import uy.gub.agesic.grep.core.dataaccess.model.PersonaJuridica;
//import uy.gub.agesic.grep.core.dataaccess.model.TipoDocumento;
//import uy.gub.agesic.grep.core.exceptions.BusinessException;
//import uy.gub.agesic.grep.core.requests.PaisRequest;
//import uy.gub.agesic.grep.core.requests.PersonaJuridicaRequest;
//import uy.gub.agesic.grep.core.requests.TipoDocumentoRequest;
//import uy.gub.agesic.grep.core.responses.PersonaJuridicaResponse;
//import uy.gub.agesic.grep.core.services.impl.PersonaJuridicaServices;
//import uy.gub.agesic.grep.core.services.impl.utils.IMapper;
//import uy.gub.agesic.grep.core.services.impl.utils.IMapperImpl;
//import uy.gub.agesic.grep.core.services.impl.utils.MapperResolver;
//import uy.gub.agesic.grep.core.utils.FactoryObjects;
//
//@RunWith(SpringRunner.class)
//@Import({PersonaJuridicaServices.class, IMapperImpl.class, MapperResolver.class})
//@Transactional(propagation = Propagation.REQUIRES_NEW)
//@DataJpaTest
//public class PersonaJuridicaBusinessTest {
//	
////    @Autowired(required=true) private IPersonaJuridicaDataAccess personaJuridicaDataAccess;
////    @Autowired(required=true) private PersonaJuridicaServices personaJuridicaServices;
////    
////    @Autowired
////    private IMapper mapper;
////    
////    @After
////    public void clear() {
////        this.personaJuridicaDataAccess.deleteAll();
////    }    
////
////    @Autowired(required=true) private ITipoDocumentoDataAccess tipoDocumentoDataAccess;
////    @Autowired(required=true) private IPaisDataAccess paisDataAccess;
////    
////
////    
////    private Pais crearPais(PaisRequest paisRequest) {
////    	Pais pais = mapper.fromRequest(paisRequest);
////    	pais.setId(null);
////    	return paisDataAccess.saveAndFlush(pais);
////    }        
////    
////    private TipoDocumento crearTipoDocumento(TipoDocumentoRequest tipoDocumentoRequest) {
////    	TipoDocumento unidadEjecutora = mapper.fromRequest(tipoDocumentoRequest);
////    	unidadEjecutora.setId(null);
////    	return tipoDocumentoDataAccess.saveAndFlush(unidadEjecutora);
////    }        
////    
////    @Test
////    public void get() throws BusinessException {
////    	PersonaJuridicaRequest request = FactoryObjects.generarPersonaJuridicaRequest1();
////    	Pais pais = crearPais(FactoryObjects.generarPaisRequestLaArgentina());
////    	TipoDocumento tipoDocumento = crearTipoDocumento(FactoryObjects.generarTipoDocumentoRequest2());
////    	request.setIdTipoDocumento(tipoDocumento.getId());
////    	request.setIdPaisDocumento(pais.getId());
////    	PersonaJuridica modelAGuardar = mapper.fromRequest(request);
////    	personaJuridicaDataAccess.saveAndFlush(modelAGuardar);
////    	PersonaJuridicaResponse responseAGuardarExcepted = mapper.toResponse(modelAGuardar);
////    	PersonaJuridicaResponse responseGuardado = personaJuridicaServices.findBy(request.getIdTipoDocumento(), request.getIdPaisDocumento(), request.getNumeroDocumento());
////    	assertEquals(responseAGuardarExcepted, responseGuardado);
////    }
////    
//////    @Test
//////    public void list() throws BusinessException {
//////    	PersonaJuridicaRequest request1 = FactoryObjects.generarPersonaJuridicaRequest1();
//////    	PersonaJuridicaRequest request2 = FactoryObjects.generarPersonaJuridicaRequest2();
//////    	Pais pais1 = crearPais(FactoryObjects.generarPaisRequestUruguay());
//////    	TipoDocumento tipoDocumento1 = crearTipoDocumento(FactoryObjects.generarTipoDocumentoRequest1());
//////    	Pais pais2 = crearPais(FactoryObjects.generarPaisRequestLaArgentina());
//////    	TipoDocumento tipoDocumento2 = crearTipoDocumento(FactoryObjects.generarTipoDocumentoRequest2());
//////    	request1.setIdTipoDocumento(tipoDocumento1.getId());
//////    	request2.setIdTipoDocumento(tipoDocumento2.getId());
//////    	request1.setIdPaisDocumento(pais1.getId());
//////    	request2.setIdPaisDocumento(pais2.getId());
//////    	personaJuridicaServices.create(request1);
//////    	personaJuridicaServices.create(request2);
//////    	PersonaJuridicaResponse responseExcepted1 = mapper.toResponse(mapper.fromRequest(request1));
//////    	PersonaJuridicaResponse responseExcepted2 = mapper.toResponse(mapper.fromRequest(request2));
//////    	List<PersonaJuridicaResponse> responseGuardado = personaJuridicaServices.list();
//////    	assertEquals(responseGuardado, List.of(responseExcepted1, responseExcepted2));
//////    }
////
////    @Test
////    public void create() throws BusinessException {
////    	PersonaJuridicaRequest personaJuridicaRequest = FactoryObjects.generarPersonaJuridicaRequest1();
////    	Pais pais = crearPais(FactoryObjects.generarPaisRequestLaArgentina());
////    	TipoDocumento tipoDocumento = crearTipoDocumento(FactoryObjects.generarTipoDocumentoRequest2());
////    	personaJuridicaRequest.setIdPaisDocumento(pais.getId());
////    	personaJuridicaRequest.setIdTipoDocumento(tipoDocumento.getId());
////    	personaJuridicaServices.create(personaJuridicaRequest);
////        PersonaJuridica personaJuridicaAGuardar = mapper.fromRequest(personaJuridicaRequest);
////        PersonaJuridica personaJuridicaGuardado = personaJuridicaDataAccess.findById(Long.valueOf(1)).get();
////        assertEquals(personaJuridicaAGuardar, personaJuridicaGuardado);
////	}
////    
////    @Test
////    public void update() throws BusinessException {
////    	PersonaJuridicaRequest personaJuridicaRequest = FactoryObjects.generarPersonaJuridicaRequest1();
////    	personaJuridicaServices.create(personaJuridicaRequest);
////    	Pais pais = crearPais(FactoryObjects.generarPaisRequestLaArgentina());
////    	TipoDocumento tipoDocumento = crearTipoDocumento(FactoryObjects.generarTipoDocumentoRequest2());
////    	String nuevoTexto = personaJuridicaRequest.getRazonSocial().concat(" - Modificada");
////    	personaJuridicaRequest.setRazonSocial(nuevoTexto);
////    	personaJuridicaRequest.setIdPaisDocumento(pais.getId());
////    	personaJuridicaRequest.setIdTipoDocumento(tipoDocumento.getId());
////    	personaJuridicaServices.update(personaJuridicaRequest);
////    	PersonaJuridica personaJuridicaAGuardar = mapper.fromRequest(personaJuridicaRequest);
////    	PersonaJuridica personaJuridicaGuardado = personaJuridicaDataAccess.findById(Long.valueOf(1)).get();
////    	assertEquals(personaJuridicaAGuardar.getCorreoElectronico(), personaJuridicaGuardado.getCorreoElectronico());
////    	assertEquals(nuevoTexto, personaJuridicaGuardado.getRazonSocial());
////    	assertEquals(personaJuridicaAGuardar.getId(), personaJuridicaGuardado.getId());
//////    	assertNotEquals(personaJuridicaAGuardar.getUltimaModificacion(), personaJuridicaGuardado.getUltimaModificacion());
////    }
////    
////    /**
////     * PRECONDICION: El resultado de este test es válido si create() es válido
////     * @throws BusinessException
////     */
////    @Test
////    public void delete() throws BusinessException {
////    	PersonaJuridicaRequest request = FactoryObjects.generarPersonaJuridicaRequest1();
////    	Pais pais = crearPais(FactoryObjects.generarPaisRequestLaArgentina());
////    	TipoDocumento tipoDocumento = crearTipoDocumento(FactoryObjects.generarTipoDocumentoRequest2());
////    	request.setIdTipoDocumento(tipoDocumento.getId());
////    	request.setIdPaisDocumento(pais.getId());
////    	personaJuridicaServices.create(request);
////    	PersonaJuridicaResponse response = personaJuridicaServices.findBy(request.getIdTipoDocumento(), request.getIdPaisDocumento(), request.getNumeroDocumento());
////    	personaJuridicaServices.delete(response.getId());
////    	boolean sigueGuardado = personaJuridicaDataAccess.findById(Long.valueOf(1)).isPresent();
////    	assertFalse(sigueGuardado);
////    }
//    
//}
