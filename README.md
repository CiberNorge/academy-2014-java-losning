academy-2014-java-losning
=========================

Java løsningsforslag for Ciber Academy 2014

Under følger en enkel instruksjon for å sette opp applikasjonen etter du har klonet repositoriet lokalt.
Alle kommadoene, hvis ikke annet spesifisert, skal kjøres fra root-katalogen av prosjektet.

Fra shell
---------

Kjør `gradlew clean build` for å bygge prosjektet. Første gangen vil alle avhengigheter bli lastet ned,
inkludert gradle.

Kjør `java -jar ./web/build/libs/cibrary-web-1.0.0-SNAPSHOT.jar` for å starte applikasjonen. Åpne en browser og gå
til adressen [http://localhost:8080/](http://localhost:8080/) for å se at applikasjonen kjører.

Fra IntelliJ
------------

Generér IntelliJ sine prosjektfiler ved å kjøre `gradlew cleanIdea idea`.

Start IntelliJ og last prosjektet ved å gå på `File -> Open...`. Velg root-katalogen til prosjektet.

Du kan starte applikasjonen direkte fra IntelliJ ved å "kjøre" Application-klassen. Finn Application.java
(`web\src\main\java\no\ciber\academy\server\Application.java`), høyreklikk og velg `Run/Debug Application.main().

Åpne en browser og gå til adressen [http://localhost:8080/](http://localhost:8080/) for å se at applikasjonen kjører.
