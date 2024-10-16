package  org.jmat_f5_dbosco.app_talen_day.dto;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class EmpresaDTO {
    private String empresaId;
    private String enterpriseName;
    private String businessSector;
    private boolean finalCompany;
    private String headquarters;
    private String address;
    private String zipCode;
    private String imageUrls;
    private Set<AnalisisEmpresaDTO> analisisEmpresa;
    private Set<OfertasDTO> ofertas;
    private Set<SocialNetworksDTO> socialNetworks;


}

