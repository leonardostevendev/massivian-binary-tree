# massivian-binary-tree
Api rest para creacion de arbol binario y obtencion de menor ancestro comun.

El proyecto esta desarrollado con maven sobre IDE IntelliJ IDEA 

para descargarlo y tener en ambiente de desarrollo simplemente hacer clone del proyecto y abrirlo con el IDE

para probar el compilado correspondiente a los fuentes actuales, en la seccion de RELEASES descargar el war y ejecutarlo con la instrucición:

java -jar binary-tree-0.0.1-SNAPSHOT.war

lo cual desplegara el api sobre el tomcat embebido

#Hay 2 endpoints
se pueden probar haciendo en postman una peticion por post a 
http://localhost:8080/api/tree/lca 
con el request body:
{"tree": [67,39,76,28,44,74,85,29,83,87], "node1":29, "node2":44}

y un endpoint para crear el arbol y ver como quedó organizado:
http://localhost:8080/api/tree

alli se envia solo la lista de datos que lo componen y retorna el arbol completo 

request body: 
[67,39,76,28,44,74,85,29,83,87]

para ambas peticiones el Content-Type es application/json

y para ver el arbol de manera organizada pueden tomar el response de /api/tree/ copiarlo y pegarlo en la siguiente pagina :
https://vanya.jp.net/vtree/

Buena Suerte !


