package panierWebService;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
@Local
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class ProduitServiceBean {

    
    @PersistenceContext(unitName = "produitPersistenceUnit")
    private EntityManager em;

    private List<Produit> cart = new ArrayList<>();

    public void addProductToCart(Produit produit) {

        cart.add(produit);
    }

    public void checkOut() {

        for (Produit produit : cart) {
            em.persist(produit);
        }
        cart.clear();
    }
    
    public Produit persist(Produit produit)
    {
        return em.merge(produit);
    }

}

