package  org.jmat_f5_dbosco.app_talen_day.dto;

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
public class OfertasDTO {
    private String ofertasName;
    private String jobPortal;
    private String recruiter;
    private String linkedinRecruiter;
    private int yearsExperience;
    private String technologies;
    private String observations;

}
