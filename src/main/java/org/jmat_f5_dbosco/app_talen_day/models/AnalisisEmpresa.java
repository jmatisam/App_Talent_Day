package  org.jmat_f5_dbosco.app_talen_day.models;

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
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Document(collection = "analisis_empresa")
public class AnalisisEmpresa {

    @Id
    private String analisisEmpresaId;

    @Field("nubrEmployees")
    private int nubrEmployees;

    @Field("finalCompany")
    private boolean finalCompany;

    @Field("longTermInterest")
    private boolean longTermInterest;

    @Field("commonContact")
    private String commonContact;

    @Field("linkNoticia1")
    private String linkNoticia1;

    @Field("linkNoticia2")
    private String linkNoticia2;

}
