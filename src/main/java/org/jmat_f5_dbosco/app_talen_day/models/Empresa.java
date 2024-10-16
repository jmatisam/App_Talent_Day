package  org.jmat_f5_dbosco.app_talen_day.models;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

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
@Document(collection = "empresa")
public class Empresa {

    @Id
    private String empresaId; // MongoDB usa String para los ids

    @Field("enterpriseName")
    private String enterpriseName;

    @Field("businessSector")
    private String businessSector;

    @Field("finalCompany")
    private boolean finalCompany;

    @Field("headquarters")
    private String headquarters;

    @Field("address")
    private String address;

    @Field("zipCode")
    private String zipCode;

    @Field("imageUrls")
    private String imageUrls;

    @Field("analisisEmpresa")
    private Set<AnalisisEmpresa> analisisEmpresa = new HashSet<>();
    @Field("ofertas")
    private Set<Ofertas> ofertas = new HashSet<>();
    @Field("socialNetworks")
    private Set<SocialNetworks> socialNetworks = new HashSet<>();


}
