package uy.gub.agesic.grep.core.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uy.gub.agesic.grep.core.dataaccess.model.TipoPermiso;

@Repository
public interface ITipoPermisoDataAccess extends JpaRepository<TipoPermiso, Long> {

}
