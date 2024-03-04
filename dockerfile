# Use a imagem base com o JDK para compilar o código
FROM openjdk:17-ea-jdk-oracle AS builder

# Configurar o diretório de trabalho
WORKDIR /app

# Copiar o arquivo pom.xml para instalar as dependências antes de copiar o código-fonte
COPY pom.xml .

# Copiar todo o código-fonte para o contêiner
COPY . .

# Compilar o código-fonte
RUN ./mvnw package -DskipTests

# Segunda etapa: Copiar o artefato compilado para a imagem do Maven
FROM maven:3.8.5-openjdk-17 AS final

# Configurar o diretório de trabalho
WORKDIR /app

# Copiar o arquivo JAR da primeira etapa para a segunda etapa
COPY --from=builder /app/target/*.jar /app/api_teacher.jar

# Porta em que sua aplicação Spring Boot está rodando
EXPOSE 8081

# Comando para executar a aplicação quando o contêiner iniciar
CMD ["java", "-jar", "api_teacher.jar"]
