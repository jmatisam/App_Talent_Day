package  org.jmat_f5_dbosco.app_talen_day.interfaces;

import java.util.List;

import org.jmat_f5_dbosco.app_talen_day.dto.EmpresaDTO;
import org.jmat_f5_dbosco.app_talen_day.models.Empresa;

import jakarta.validation.Valid;

public interface  IEmpresa {

    public EmpresaDTO getAllempresas(@Valid EmpresaDTO empresaDTO);
    public Empresa findByEnterpriseNameContaining(String enterpriseName);
    public List<Empresa> findByEnterpriseNameContainingIgnoreCase(String enterpriseName);




    
}
