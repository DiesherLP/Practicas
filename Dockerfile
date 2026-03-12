# Etapa 1: Compilar el proyecto con Maven
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app

# Copiamos el código fuente y el pom.xml
COPY . .

# Compilamos el proyecto saltando los tests para ir más rápido
RUN mvn clean package -DskipTests

# Etapa 2: Ejecutar la aplicación con un JRE ligero
FROM eclipse-temurin:17-jre
WORKDIR /app

# Copiamos el archivo JAR generado en la etapa anterior
# Importante: Asegúrate de que tu JAR se genere en /target/
COPY --from=build /app/target/*.jar app.jar

# Exponemos el puerto (Render usa puertos dinámicos)
EXPOSE 8080

# Comando para iniciar la aplicación optimizando memoria
CMD ["java", "-Xmx256m", "-jar", "app.jar"]