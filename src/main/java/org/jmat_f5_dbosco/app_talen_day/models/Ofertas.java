package  org.jmat_f5_dbosco.app_talen_day.models;

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
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Ofertas {

    @Field("ofertasName")
    private String ofertasName;

    @Field("jobPortal")
    private String jobPortal;

    @Field("recruiter")
    private String recruiter;

    @Field("linkedinRecruiter")
    private String linkedinRecruiter;

    @Field("yearsExperience")
    private int yearsExperience;

    @Field("technologies")
    private String technologies;

    @Field("observations")
    private String observations;

    
}
