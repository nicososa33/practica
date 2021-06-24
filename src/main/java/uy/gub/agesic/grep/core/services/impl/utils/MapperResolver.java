package uy.gub.agesic.grep.core.services.impl.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import uy.gub.agesic.grep.core.dataaccess.IPaisDataAccess;
import uy.gub.agesic.grep.core.dataaccess.ITipoDocumentoDataAccess;
import uy.gub.agesic.grep.core.dataaccess.IUnidadEjecutoraDataAccess;
import uy.gub.agesic.grep.core.dataaccess.model.Pais;
import uy.gub.agesic.grep.core.dataaccess.model.TipoDocumento;
import uy.gub.agesic.grep.core.dataaccess.model.UnidadEjecutora;
import uy.gub.agesic.grep.core.exceptions.LevelError;
import uy.gub.agesic.grep.core.exceptions.NotFoundException;
import uy.gub.agesic.grep.core.utils.ErrorCodes;

@org.springframework.stereotype.Component
public class MapperResolver {

	private Logger logger = LoggerFactory.getLogger(MapperResolver.class);

	@Autowired private IUnidadEjecutoraDataAccess unidadEjecutoraDataAccess;
	@Autowired private IPaisDataAccess paisDataAccess;
	@Autowired private ITipoDocumentoDataAccess tipoDocumentoDataAccess;

	public UnidadEjecutora mapUnidadEjecutoraFrom(Long id) { 
		return unidadEjecutoraDataAccess.findById(id).orElseThrow(() -> new NotFoundException(LevelError.ALERT_USER_INFO, ErrorCodes.NO_ENCONTRADO_UNIDAD_EJECUTORA + id, logger));
    }
	
	public Pais mapPaisFrom(Long id) { 
		return paisDataAccess.findById(id).orElseThrow(() -> new NotFoundException(LevelError.ALERT_USER_INFO, ErrorCodes.NO_ENCONTRADO_PAIS + id, logger));
	}
	
	public TipoDocumento mapTipoDocumentoFrom(Long id) { 
		return tipoDocumentoDataAccess.findById(id).orElseThrow(() -> new NotFoundException(LevelError.ALERT_USER_INFO, ErrorCodes.NO_ENCONTRADO_TIPO_DE_DOCUMENTO + id, logger));
	}

}
