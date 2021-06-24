package uy.gub.agesic.grep.core.dataaccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uy.gub.agesic.grep.core.dataaccess.model.PersonaFisica;

@Repository
public interface IPersonaFisicaDataAccess extends JpaRepository<PersonaFisica, Long> {

	List<PersonaFisica> findByTipoDocumentoIdAndPaisDocumentoIdAndNumeroDocumento(Long idTipoDocumento, Long idPaisDocumento, String numeroDocumento);
	
}
