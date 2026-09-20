# Sistema de Vendas — Backend

API REST de estudo para gerenciamento de produtos e estoque, desenvolvida em Java com Spring Boot.

O projeto exercita fundamentos de backend como separação de responsabilidades, endpoints HTTP, regras de negócio e persistência relacional com JPA.

## Funcionalidades

- cadastro de produtos;
- listagem de produtos;
- validação de regras de negócio na camada de serviço;
- persistência com Spring Data JPA/Hibernate;
- banco H2 para desenvolvimento local.

## Estrutura

```text
controller  → entrada HTTP / API REST
service     → regras de negócio
repository  → acesso a dados com JPA
model       → entidades do domínio
```

## Tecnologias

- Java 17
- Spring Boot 4.1.0
- Spring Web MVC
- Spring Data JPA / Hibernate
- H2 Database
- Lombok
- Maven

> Este é um projeto de estudo/portfólio. O objetivo é demonstrar fundamentos de desenvolvimento backend e arquitetura em camadas, não representar um sistema comercial completo.

## Executando localmente

Pré-requisitos: Java 17+ e Maven (ou o Maven Wrapper incluído no projeto).

```bash
git clone https://github.com/leonardejhaylson-ui/sistema-vendas-backend.git
cd sistema-vendas-backend
./mvnw spring-boot:run
```

No Windows:

```powershell
mvnw.cmd spring-boot:run
```

## API

A implementação expõe operações de produtos sob a API da aplicação. Consulte o controller do projeto para os endpoints mantidos pela versão atual.

## Objetivo de aprendizado

Este projeto faz parte da minha evolução em backend Java, especialmente em APIs REST, organização em camadas, regras de negócio, ORM e persistência de dados.
