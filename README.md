# CARLOS CASTRO ALDROVER 1º DAM

## Kata de "Frank Bruno's Boxing" en Java

Orientado del: https://github.com/dfleta/frank-brunos-boxing.git

### Descripción:
En un combate de boxeo, hay tres jueces/zas sentados al lado del ring.

Cada uno de ellos/as rellena una tarjeta de puntos. En este caso: blanca, azul y rosa.

El actual sistema de puntuación del boxeo se conoce como "Sistema obligatorio de 10 puntos".

Esta es una descripción general básica de cómo funciona:

- Los jueces califican cada asalto individualmente en una escala de 10 puntos. La mayoría de asaltos se califican 10-9,
  con el boxeador/a que lo hizo mejor puntuando 10 y "ganando" el asalto, y el otro boxeador/a puntuando 9.
- Si un boxeador es derribado o lastimado lo suficiente como para que el árbitro cuente de pie, ese boxeador pierde
  un punto. Si un púgil domina un asalto, controla y lanza mejores golpes en todo momento y también derriba a su oponente,
  el resultado final del asalto es 10-8.
- El /la árbitro puede indicar a los tres jueces/zas que resten un punto a un púgil en cualquier asalto. Lo harán si éste
  ha hecho algo para romper las reglas, como una falta intencionada (golpe bajo, cabezazo, o el favorito de Mike Tyson,
  morder la oreja de un oponente).
## Tecnologías utilizadas

- **Lenguaje:** Java 21
- **Build Tool:** Maven
- **Testing:** JUnit 4
- **IDE:** IntelliJ IDEA / VS Code

---

## Cómo ejecutar el proyecto

### Maven:

```bash
# Compilar el package del proyecto:
  mvn clean package
# Ejecutar tests:
  mvn test
# Ejecutar el JAR:
  java -jar target/ricky-buisiness-1.0-SNAPSHOT.jar
```