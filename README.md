# Gnome_Project

##Description du projet

Le projet tourne autour de la gestion de **Gnomes**. Il en va de leur achat, de leur location jusqu’à leur mis au travail. 
Des **Hunters** s’occupent d’en capturer pour pouvoir, soit les faire travailler, soit les vendre à autrui via une classe 
nommée **Order**. Des **Customers** sont également là pour pouvoir acheter, vendre et faire travailler les **Gnomes**, mais ne 
peuvent en chasser. 

Chaque **Gnome** a ses particularités : ils peuvent être jaune, rouge, gros, mince, jeune, âgé, possèdent un nom, mais 
également des types : *Shiny, DelicateHands, Handicaped, Special*. Chacun de ces types a lui-même ses particularités, 
comme, par exemple, des couleurs spéciales pour le *Shiny* que les autres types n’ont pas. Leur valeur marchande est 
également différente.

Le **Stock** permet le recensement de tous les **Gnomes** qui ne sont pas en circulation entre les **Clients**. Via **Order**, il sera 
possible de faire du commerce de **Client** à **Client** ou bien de **Stock** à **Client**.

##Implémentations restantes

La classe **Order** n'a pas été implémentée. Il serait aussi intéressant de rajouter une base de donnée pour savegarder l'état du stock.

