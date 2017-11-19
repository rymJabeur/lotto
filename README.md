Pour l'implémentation du jeu, j'ai mis en place :
- une interface graphique qui permet de jouer et afficher le résultat
- un service LottoService qui implémente la méthode de jeu
- un controleur LottoController
- deux entités : 
  - LottoList: qui permet de créer une liste d'une taille x contenant des valeurs aléatoire entre une borneInf et une borneSup
  - LottoResult : qui contient les 3 listes du tirage : 
    - deux listes de 5 éléments tirés au hasard dont les valeurs sont entre 0 et 50 -> qui seront affichés en vert
    - une liste de deux éléments tirés au hasard dont les valeurs sont entre 0 et 5 -> qui seront affichés en rouge
 - des fichiers de configurations :
  - applicationContext.xml
  - web.xml
  - logs.properties.
  - lotto.css
  - messages.properties
  
