package ec.edu.espe.banquitocore.clients.model;

import lombok.Builder;
import lombok.Data;

@Data
public class Location {
    
    private String level1;
    private String level2;
    private String level3;
    private String level4;

    private Location() {}
}
