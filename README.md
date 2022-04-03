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

![Captura de pantalla 2022-04-03 a las 20 29 37](https://user-images.githubusercontent.com/98181428/161442819-6daa26f1-9785-464e-9e5e-0517235d006d.png)


**TelefonoTest**

-Telefono correcto

![Captura de pantalla 2022-04-03 a las 20 32 14](https://user-images.githubusercontent.com/98181428/161442853-0bf6af3b-5893-44c7-ac59-44dc96442a8b.png)


Tras ejecutar el test, nos devuelve un OK por lo que el test ha ido bien.

![Captura de pantalla 2022-04-03 a las 20 32 22](https://user-images.githubusercontent.com/98181428/161442863-be0c5afc-10ff-4103-86fd-e0342b69b61e.png)

-Telefono incorrecto

![Captura de pantalla 2022-04-03 a las 20 33 38](https://user-images.githubusercontent.com/98181428/161442885-a0341232-bd87-4339-8176-db908c36f4cf.png)

Tras ejecutar el test, nos devuelve un NotOK por lo que el test ha ido bien.

![Captura de pantalla 2022-04-03 a las 20 33 51](https://user-images.githubusercontent.com/98181428/161442897-d114252d-5ee2-4fc5-beda-d5e2c6fdb08f.png)



**ProcessCotrollerTest**

-Todo correcto

Como se puede apreciar en la siguiente imagen ha superado el test correctamente.
![Captura de pantalla 2022-04-03 a las 20 39 41](https://user-images.githubusercontent.com/98181428/161443056-f3fa99b7-4216-4095-b4d0-2935a7927fca.png)

-DNI incorrecto

Como se puede apreciar en la siguiente imagen ha superado el test correctamente.
![Captura de pantalla 2022-04-03 a las 20 41 37](https://user-images.githubusercontent.com/98181428/161443135-ac025e64-4edc-4e3d-acc8-aa33581cef53.png)

-Telefono incorrecto

Como se puede apreciar en la siguiente imagen ha superado el test correctamente.

![Captura de pantalla 2022-04-03 a las 20 42 35](https://user-images.githubusercontent.com/98181428/161443210-bb89d3a3-ebdf-47e5-8b51-7f4efe12ee38.png)


-AllCorrectLegacy

Como se puede apreciar en la siguiente imagen ha superado el test correctamente.

![Captura de pantalla 2022-04-03 a las 20 45 41](https://user-images.githubusercontent.com/98181428/161443281-fb082f84-8179-4ebd-8377-c1b8af1dbb2b.png)


-DNINotCorrectLegacy

Como se puede apreciar en la siguiente imagen ha superado el test correctamente.

![Captura de pantalla 2022-04-03 a las 20 46 38](https://user-images.githubusercontent.com/98181428/161443311-9f142e53-5744-4b78-a015-89d8c1e49361.png)

-TelNotCorrectLegacy

Como se puede apreciar en la siguiente imagen ha superado el test correctamente.

![Captura de pantalla 2022-04-03 a las 20 47 20](https://user-images.githubusercontent.com/98181428/161443331-5c5265f0-0413-4f0f-989b-f992caa5f433.png)


Todas las casuísticas han fucionado correctamente.

