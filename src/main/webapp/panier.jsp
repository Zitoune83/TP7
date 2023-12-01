<!DOCTYPE html>
<html>
<head>
    <title>Panier</title>
</head>
<body>
    <h1>Mon Panier</h1>
    
    <form action="AjouterProduitServlet" method="post">
        <label for="code">Code du produit:</label>
        <input type="text" name="code" id="code" required>
        <label for="libelle">Libellé du produit:</label>
        <input type="text" name="libelle" id="libelle" required>
        <label for="description">Description du produit:</label>
        <input type="text" name="description" id="description" required>
        <input type="submit" value="Ajouter un produit">
    </form>
    
    <h2>Produits dans le panier:</h2>
    <ul>
        <c:forEach items="${produits}" var="produit">
            <li>${produit.libelle} - ${produit.description} 
                <a href="SupprimerProduitServlet?id=${produit.id}">Supprimer</a>
            </li>
        </c:forEach>
    </ul>
    
    <form action="FinaliserCommandeServlet" method="post">
        <input type="submit" value="Finaliser la commande">
    </form>
</body>
</html>
