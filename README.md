# decrypto-smc

Breve explicación de como resolvi el desafío:

Cree una aplicacion spring boot que consta de un API que permite obtener las estadísticas de los mercados de cada país, tal como como lo explica la consigna

El stack tecnológico se compone de Java - Spring boot para el backend, MySQL como base de datos y Railway como servicio cloud (gratuito). La documentación generada por swagger la pueden encontrar en https://decrypto-smc-production.up.railway.app/swagger-ui/index.html#/

Debajo se detallan las tablas que contiene la base de datos y sus relaciones

![image](https://github.com/SantiagoCarnezis/decrypto-smc/assets/62964148/555c3ad9-19ee-4d6e-910b-e94432879016)


Decidí representar los países con una tabla en la base de datos (dinámico) aunque podría utilizarse un enum que represente a cada país (estático)

En caso de querer probar la API en postman. Debajo dejo el proyect listo para importar y que puedan realizar las pruebas por ustedes mismos
[Desafio decrypto.postman_collection.json](https://github.com/user-attachments/files/15750428/Desafio.decrypto.postman_collection.json)
[Railway host.postman_environment.json](https://github.com/user-attachments/files/15750430/Railway.host.postman_environment.json)
[Local.postman_environment.json](https://github.com/user-attachments/files/15750429/Local.postman_environment.json)


Ya están precargados algunos mercados y clientes pero en caso de querer agregar mas, lo pueden realizar mediante la API (post /market, post /client)





