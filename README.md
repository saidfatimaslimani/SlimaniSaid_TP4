 #     TP n°4

#   Le problème d’arbitrage
             
#   By Slimani Fatima && Said Fatma 

                 
                 
    Ce TP a pour objectif de vous faire écrire un programme java qui va détecter des opportunités d’arbitrages dans un graphe.
                       
    
    Après les recherches sur la problématique suivante : comment détecter une opportunité d’arbitrage ? en d’autres termes : comment détecter
    un circuit absorbant dans le graphe ? on a trouver plusieurs algorithmes comme Bellman Ford Djekestra ,....
                       
                       
     Dans notre TP, nous avons utilise l'algorithme de Bellman-Ford qui résout le problème des plus courts chemins avec origine unique 
     dans le cas le plus général où les poids des arcs peuvent avoir des valeurs négatives.
      
      
     Nous avons passer pars les étapes suivants :
     
    1- initialise les distances de la source à tous les sommets en tant qu'infini et la distance à la source elle-même en tant que 0.
    Créez un tableau dist[] de taille |V| avec toutes les valeurs infinies sauf dist[src] où src est le sommet source.
     
     
    2-Faire |V|-1 fois où |V| est le nombre de sommets dans le graphe les instructions suivantes.
         Répéter pour chaque arête u-v
         Si dist[v]>dist[u]+poids l'arête u-v, mettez à jour dist[v]=dist[u]+poind de l'arête u-v.
         
    3-Si dist[v] > dist [u] + poids de l'arête u-v, alors "le graphe contient un cycle de pondération négatif"
    
L’idée de l’étape 3 est que l’étape 2 garantit les distances les plus courtes si le graphe ne contient pas de cycle de pondération négatif.
Si nous parcourons toutes les arêtes une fois de plus et nous obtenons un chemin plus court pour tout sommet, il y a un cycle de pondération négatif
