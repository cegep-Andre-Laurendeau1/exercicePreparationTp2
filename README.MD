## **User Story 1:** Ajouter un produit
En tant que client, je veux ajouter des produits à mon catalogue  
**Critères de succès:**
- Pour chaque produit à insérer au catalogue, je fournis les détails du produit et l'insère au catalogue afin de pouvoir l'acheter plus tard

## **User Story 2:** Voir historique des produits
En tant que client, je veux voir l'historique de mes achats  
**Critères de succès:**
- Je fournis l'id du client pour lequel je veux voir l'historique.  Le système me retourne un sommaire des commandes ainsi que des produits achetes.
- Si l'id fourni est invalide, je reçois un message d'erreur indiquant 'mauvais client'
- S'il n'y a aucune commande pour le client fourni, je reçois un message d'erreur m'indiquant 'aucune commande'
- S'il y a des commandes, le système retourne un historique des commandes incluant le détail des produits achetés (nom produit, quantité)

## **User Story 3:** En tant que Client, je veux ajouter un produit dans mon panier
En tant que Client, j'ajoute l'id du produit que je veux acheter ainsi que la quantité désirée  
**Critères de succès:**
- Quand le client fournis l'id d'un produit ainsi que la quantité, le système retourne pour chaque ajout l'état modifié du cart

## **User Story 4:** Checkout
En tant que Client, je veux faire le checkout de ma commande  
**Critères de succès:**
- Le client doit voir l'état de son 'cart'
- Le client peut alors effectuer l'achat du contenu de son cart
- Un message d'erreur est affiché si l'achat n'a pas passé
- Le client voit le sommaire et détail de sa commande