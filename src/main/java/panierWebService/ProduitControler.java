package panierWebService;

import java.io.IOException;

import javax.ejb.EJB;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pavierWebService/produit")
public class ProduitControler extends HttpServlet
{
    private static final long serialVersionUID = 121020222049L;
    private static final String VUE_FORMULAIRE = "panier.jsp";
    private static final String VUE_RECAP = "recap.jsp";

    @EJB ProduitServiceBean produitService;
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        getServletContext().getRequestDispatcher(VUE_FORMULAIRE).forward(req, resp);
    }
    
    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
      
    	Produit produit = new Produit();
        produit.setCode(req.getParameter("code"));
        produit.setLib(req.getParameter("libelle"));
        produit.setDescription(req.getParameter("description"));
        produitService.addProductToCart(produit);
        getServletContext().getRequestDispatcher(VUE_RECAP).forward(req, resp);
    }
}


