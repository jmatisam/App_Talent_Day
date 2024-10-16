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

public class SocialNetworksDTO {
    private String socNetId;
    private String socNetName;
    private String socNetLink;

}
