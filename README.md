# Practica 6: Testing de una aplicacion de Spring Boot

Para esta sexta práctica se quiere añadir unos test a las clases proporcionadas, las cuales son:

- DNI & Telefono (Unit Tests) (Cada clase tiene un método y varias casuísticas para probar)
- ProcessController (E2E Tests) (2 endpoints)

A continuación se muestran los diferentes casos que se han llevado a cabo.

**DNITest**
-DNI correcto
![Captura de pantalla 2022-04-03 a las 20 23 31](https://user-images.githubusercontent.com/98181428/161442481-f96803f6-68a4-48c0-801a-98292c892b4a.png)
Tras ejecutar el test nos devuelve un OK, por lo que el test ha ido bien.
![Captura de pantalla 2022-04-03 a las 20 25 52](https://user-images.githubusercontent.com/98181428/161442564-e8ba62c6-52cb-46b2-8727-8d790a251c16.png)

-DNI mal introducido
![Captura de pantalla 2022-04-03 a las 20 26 19](https://user-images.githubusercontent.com/98181428/161442607-233b8828-2c15-452c-8b6f-ad37a87e42d3.png)
Tras ejecutar el test devuelve un NotOK1 por lo que el test ha ido bien.
![Captura de pantalla 2022-04-03 a las 20 26 41](https://user-images.githubusercontent.com/98181428/161442628-71c25645-4280-45f1-b837-b1a2e6e5daaf.png)

-DNI con la letra incorrrecta
![Captura de pantalla 2022-04-03 a las 20 28 09](https://user-images.githubusercontent.com/98181428/161442657-89c0eb1c-df4f-409a-a347-fb2a8353eb10.png)
Tras ejecutar el test, nos devuelve un NotOK2 por lo que el test ha ido bien.
![Captura de pantalla 2022-04-03 a las 20 28 25](https://user-images.githubusercontent.com/98181428/161442685-6601dd72-cff5-4411-8d94-ab342cb36980.png)

-DNI inválido
![Captura de pantalla 2022-04-03 a las 20 29 28](https://user-images.githubusercontent.com/98181428/161442715-a6d480fe-5e25-4b73-9e54-49586eb78062.png)
Tras ejecutar el test, nos devuelve un NotOK3 por lo que el test ha ido bien.


