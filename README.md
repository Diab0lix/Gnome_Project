# Gnome_Project

## Description du projet

Le projet tourne autour de la gestion de **Gnomes**. Il en va de leur achat, de leur location jusqu’à leur mis au travail. 
Des **Hunters** s’occupent d’en capturer pour pouvoir, soit les faire travailler, soit les vendre à autrui via une classe 
nommée **Order**. Des **Customers** sont également là pour pouvoir acheter, vendre et faire travailler les **Gnomes**, mais ne 
peuvent en chasser. 

Chaque **Gnome** a ses particularités : ils peuvent être jaune, rouge, gros, mince, jeune, âgé, possèdent un nom, mais 
également des types : *Shiny, DelicateHands, Handicaped, Special ou normal*. Chacun de ces types a lui-même ses particularités, 
que soit au niveau du travail qu'ils savent faire ou certaines caractéristiques qui sont restrainte en fonction du type de Gnome. Leur valeur marchande est également différente.

Le **Stock** permet le recensement de tous les **Gnomes** qui sont dans la possesion du gestionnaire de Gnome. Ce Stock contient 2 parties, la première partie sont les Gnomes disponible dans le stock et la deuxième partie sont les Gnomes mis en location avec un **Clients**. Via **Order**, il sera possible de faire du commerce de bien de **Stock** à **Client** ou inversement. 

## Implémentations restantes

- La classe **Order** n'a pas été implémentée. 
- Ajout de **Monnaie** afin de pouvoir implémentée correctement une commande, que ca soit pour louer, acheter ou vendre un Gnome. 
- Il serait aussi intéressant de rajouter une base de donnée pour sauvegarder l'état du stock et garder un historique des commandes effectuées.

