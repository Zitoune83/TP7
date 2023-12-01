<!DOCTYPE html>
<html>
<head>
    <title>Récapitulatif de la commande</title>
</head>
<body>
    <h1>Récapitulatif de la commande</h1>
    
    <h2>Produits commandés:</h2>
    <ul>
        <c:forEach items="${produitsCommandes}" var="produit">
            <li>${produit.libelle} - ${produit.description}</li>
        </c:forEach>
    </ul>
</body>
</html>
