package ec.edu.espe.banquitocore.clients.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClientPhone {

    private String phoneType;
    private String phoneNumber;
    private Boolean isDefault;
}
