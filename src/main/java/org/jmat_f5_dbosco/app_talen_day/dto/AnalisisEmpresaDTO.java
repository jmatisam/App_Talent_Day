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
public class AnalisisEmpresaDTO {
    private String analisisEmpresaId;
    private int nubrEmployees;
    private boolean finalCompany;
    private boolean longTermInterest;
    private String commonContact;
    private String linkNoticia1;
    private String linkNoticia2;

}

