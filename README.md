## Backend - Borne de Commande (Groupe BMW)

## Description
Serveur REST développé avec Javalin pour la gestion du menu et des commandes.

## Prérequis
* Java 21
* Maven

## Installation et Lancement
1. Compilation : `mvn clean install`
2. Lancement : Exécuter la classe principale "App.java". Le serveur démarre sur "http://localhost:7070".

## Points d'accès (Endpoints)
* `GET /categories` : Liste des catégories.
* `GET /plats` : Liste des plats.
* `POST /commandes` : Création d'une commande.

## Modélisation
L'archive de conception "BMW_design.zip" (export Modelio) se trouve à la racine de ce dépôt.
## Documentation de l'API REST (Javalin)

L'API communique exclusivement en JSON.

### 1. Menu et Catalogue
* **GET /categories** : Récupère la liste des catégories (Entrées, Plats, Boissons, Desserts).
* **GET /plats** : Récupère l'intégralité des plats disponibles.
* **GET /plats?categorie={id}** : Filtre les plats par catégorie.

### 2. Gestion des Commandes
* **POST /commandes** : Crée une nouvelle commande. 
    * *Corps de la requête* : Doit contenir les articles, quantités (>0) et les éventuelles personnalisations.
    * *Réponse* : Retourne le numéro de commande unique généré.
* **GET /commandes/{id}** : Consulte les détails d'une commande spécifique via son identifiant.
