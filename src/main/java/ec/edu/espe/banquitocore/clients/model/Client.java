package ec.edu.espe.banquitocore.clients.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter 
@Getter 
@NoArgsConstructor
@Document(collection = "clientes")
@CompoundIndex(name = "idx_clientes_typeDoc_DocId", def = "{'typeDocummentId':1, 'docummentId':1 }", unique = true)
public class Client {

    @Id
    private String id;
    private String branchId;
    @Indexed(unique = true)
    private String uniqueId;
    private String typeDocummentId;
    private String docummentId;
    private String firsName;
    private String lastName;
    private String gender;
    private Date birthDate;
    private String email;
    private Date activationDate;
    private Date lastModifiedName;
    private String state;
    private Date closedDate;
    private String comments;

    private List<ClientPhone> phoneNumbers;
    private List<ClientAddress> addresses;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((uniqueId == null) ? 0 : uniqueId.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Client other = (Client) obj;
        if (uniqueId == null) {
            if (other.uniqueId != null)
                return false;
        } else if (!uniqueId.equals(other.uniqueId))
            return false;
        return true;
    }

    
}
