package  org.jmat_f5_dbosco.app_talen_day.repository;

import java.util.List;
import  org.jmat_f5_dbosco.app_talen_day.models.Empresa;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IiempresaRepository extends MongoRepository<Empresa, String> {
    List<Empresa> findByEnterpriseNameContaining(String enterpriseName);
    List<Empresa> findByEnterpriseNameContainingIgnoreCase(String enterpriseName);
    
    
}

