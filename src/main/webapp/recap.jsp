<!DOCTYPE html>
<html>
<head>
    <title>R�capitulatif de la commande</title>
</head>
<body>
    <h1>R�capitulatif de la commande</h1>
    
    <h2>Produits command�s:</h2>
    <ul>
        <c:forEach items="${produitsCommandes}" var="produit">
            <li>${produit.libelle} - ${produit.description}</li>
        </c:forEach>
    </ul>
</body>
</html>
