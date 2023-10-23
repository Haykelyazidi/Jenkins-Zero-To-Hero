#Author  Haykel Yazidi
#Date    19/10/2023
#Description  verification affichage
Feature: Verifie l affichage des deux textes

  Scenario: se connectter sur la page
    Given utilisateur est sur la page d acceuil
    When verifie l affichage du premier texte
    And verifie l affichage du deuxieme texte
    Then afficher le message test passet
