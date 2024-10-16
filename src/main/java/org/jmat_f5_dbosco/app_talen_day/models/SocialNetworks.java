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
@Document(collection = "social_networks")
public class SocialNetworks {

    @Id
    private String socNetId;

    @Field("socNetName")
    private String socNetName;

    @Field("socNetLink")
    private String socNetLink;

}
