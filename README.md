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
