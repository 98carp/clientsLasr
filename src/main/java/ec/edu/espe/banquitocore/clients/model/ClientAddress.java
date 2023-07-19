package ec.edu.espe.banquitocore.clients.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClientAddress {
    
    private Location location;
    private String typeAddress;
    private String line1;
    private String line2;
    private Float latitude;
    private Float longitude;
    private Boolean isDefault;
    private String state;
}
