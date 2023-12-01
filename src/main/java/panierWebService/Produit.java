package panierWebService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produit")
public class Produit
{
    private Long id;
    private String code;
    private String lib;
    private String description;

    
    public Produit() {
    	code = "UNKNOWN";
    	lib = "UNKNOWN";
    	description = "UNKNOWN";
    }

    @Id
    @Column(name = "produitId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
        this.id = id;
    }



    @Column(length = 30, nullable = false)
    public String getCode()
    {
        return code;
    }
    public void setCode(String code)
    {
        this.code = code;
    }



    @Column(length = 50, nullable = false)
    public String getLib()
    {
        return lib;
    }
    public void setLib(String lib)
    {
        this.lib = lib;
    }
    
    @Column(length = 100, nullable = false)
    public String getDescription()
    {
        return description ;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    
}
