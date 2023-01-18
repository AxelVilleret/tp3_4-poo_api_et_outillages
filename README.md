TP réalisé dans le cadre du cours "POO api et outillages" de ma formation d'ingénieur. Il s'agit du 3ème TP ayant pour but du créer une application Spring Boot reposant sur les technologies suivantes :

Etape 5 :
- Spring Web est un ensemble de modules de Spring qui fournit des fonctionnalités pour développer des applications web avec Spring. Il inclut des fonctionnalités pour la gestion des requêtes HTTP, la gestion des vues, la gestion de la sécurité, la gestion des formulaires, la gestion des redirections et des forwards, entre autres. Il utilise également des composants tels que Spring MVC pour fournir un cadre pour la création d'applications web basées sur des modèles.

- Spring Data JPA est un framework de Spring qui facilite l'utilisation d'un système de gestion de persistance de données (comme Hibernate, EclipseLink) avec Java Persistence API (JPA). Il fournit des outils pour la création de requêtes de manière déclarative et simplifie la gestion de la persistance des données dans les applications Spring. Il permet également de générer automatiquement les implémentations des interfaces de référence de données pour les entités JPA.

- Hibernate est un outil de mapping objet-relationnel (ORM) open-source pour le langage de programmation Java. Il fournit un cadre pour mapper un modèle de domaine orienté objet à une base de données relationnelle. Hibernate gère la mappage des classes Java aux tables de base de données et fournit des facilités de requête et de récupération de données. Il offre également une persistance transparente, ce qui signifie que le développeur n'a pas besoin d'écrire du code spécifique à la base de données pour persister les objets. Cela en fait un choix populaire pour développer des applications d'entreprise basées sur Java.

- H2 est un SGBDR open-source écrit en Java, léger et embarquable qui peut être utilisé comme serveur autonome ou intégré à une application. Il prend en charge les principales caractéristiques des bases de données relationnelles et est souvent utilisé pour les tests et développements.

- Spring DevTools est un ensemble d'outils pour développer des applications Spring. Il fournit des fonctionnalités telles que les redémarrages automatiques, le rechargement en direct et la prise en charge du débogage pour un développement plus facile et une itération plus rapide.

- Thymeleaf est un moteur de modèle basé sur Java pour les applications Web. Il permet aux développeurs de définir et de manipuler HTML, XML et d'autres langages de balisage avec des expressions naturelles, ce qui facilite la création de modèles dynamiques et réutilisables pour les pages Web et les e-mails.

Etape 13 :
1.  Avec quelle partie du code avons-nous paramétré l'url d'appel /greeting ?
Cette partie est paramétrée dans le controller HelloWorldController.java dans la méthode greeting().

2. Avec quelle partie du code avons-nous choisi le fichier HTML à afficher ?
Le nom du template correspond au retour de la méthode greeting() dans le controller HelloWorldController.java.

3. Comment envoyons-nous le nom à qui nous disons bonjour avec le second lien ? 
Dans un premier temps, avec l'annotation @RequestParam, nous récupérons la valeur de la variable name dans l'url. On indique qu'elle n'est pas requise et que dans le cas ou elle est inexistante, on lui donne la valeur "World". Ensuite, on l'associe à la variable nomTemplate du template.

Etape 17 :
Une table ADDRESS a été créée avec tous les champs de la classe.

Etape 18 :
L'annotation Entity permet d'associer la classe Address avec une table ADRESS. L'Id est annoté Id permettant à Spring de savoir que c'est l'identifiant de la table. L'annotation GeneratedValue permet de générer automatiquement la valeur de l'identifiant dans la base de données. 
Une colonne est créée pour chaque attribut de la classe avec le même nom que l'attribut.

Etape 23 :
L'annotation @Autowired est utilisée pour l'injection de dépendance par type. L'injection de dépendance par type signifie que Spring recherche le bean qui correspond au type de la dépendance et l'injecte.

Etape 30 :
Pour importer Bootstrap dans le projet, dans la balise head du fichier index.html, j'ai ajouté la référence au CDN de Bootstrap.