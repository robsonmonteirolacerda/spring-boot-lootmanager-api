# 🧙 LootManager API

Backend API para gerenciamento de jogadores e drops de loot, inspirada em sistemas de loot de jogos MMORPG (ex: World of Warcraft).

O projeto foi desenvolvido com foco em **boas práticas de arquitetura**, separação de responsabilidades, escalabilidade e organização de código, servindo tanto como projeto de estudo quanto como base real para aplicações maiores.

---

## 🚀 Tecnologias

- Java 21
- Spring Boot 3+
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven
- Jakarta Validation
- Lombok
- REST API
- Postman (testes)

---

## 🧱 Arquitetura

Estrutura baseada em camadas (padrão de mercado):

controller -> API / REST
service -> Regras de negócio
repository -> Acesso a dados
dto -> Transporte de dados
entity -> Modelo de domínio
config -> Configurações

---

## 📦 Módulos atuais

### 👤 Player

- Cadastro de jogador
- Listagem de jogadores

### 🎁 Loot

- Registro de drops
- Associação com jogadores
- Histórico de drops
- Base para sistema de loot (em evolução)

---

👨‍💻 Autor

Robson Monteiro
Desenvolvedor Backend Java | Spring Boot | Arquitetura de Sistemas

GitHub: https://github.com/robsonmonteirolacerda
