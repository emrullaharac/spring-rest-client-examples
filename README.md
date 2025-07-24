# Spring REST Client Examples

Dieses Projekt zeigt, wie man in Spring Boot verschiedene externe REST-APIs konsumieren kann. Es ist im Rahmen einer Übung entstanden und demonstriert die Verwendung von `RestTemplate` oder `WebClient` zur Datenübertragung.

## 📦 Inhalt

Das Projekt besteht aus drei Teilen:

### 1. Rick & Morty API

- `/api/characters` – Gibt eine reduzierte Liste aller Charaktere zurück.
- `/api/characters/{id}` – Gibt einen einzelnen Charakter zurück.
- `/api/characters?status=alive` – Gibt gefilterte Charaktere (z.B. nur lebende).
- `/api/characters/species-statistic?species=Human` – Gibt die Anzahl lebender Charaktere einer Spezies zurück.

**Datenquelle:** [https://rickandmortyapi.com](https://rickandmortyapi.com)

### 2. Book API (Bonus)

- `/api/books/{isbn}` – Holt ein Buch anhand der ISBN.

**Datenquelle:** [https://my-json-server.typicode.com/Flooooooooooorian/BookApi/books](https://my-json-server.typicode.com/Flooooooooooorian/BookApi/books)

### 3. GitHub API (Bonus)

- `/api/github/{username}` – Gibt das öffentliche GitHub-Profil eines Users zurück.

**Datenquelle:** [https://api.github.com/users/{username}](https://api.github.com/users/{username})

---

## 🚀 Setup & Start

1. Projekt klonen:

   ```bash
   git clone https://github.com/dein-benutzername/spring-rest-client-examples.git
   ```

2. Mit Maven bauen und starten:

   ```bash
   ./mvnw spring-boot:run
   ```

3. Teste die Endpoints mit Postman oder curl:

   ```bash
   curl http://localhost:8080/api/characters
   ```

---

## 💠 Technologien

- Java 17+
- Spring Boot (Web, Lombok)
- RestTemplate (oder WebClient)
- Maven

---

## 📄 Lizenz

Dieses Projekt ist zu Übungszwecken entstanden.

