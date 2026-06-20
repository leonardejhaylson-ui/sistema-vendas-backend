# API REST de Gerenciamento de Vendas e Produtos

Este projeto consiste em uma API REST desenvolvida em Java com o framework Spring Boot, projetada para gerenciar o controle de estoque de produtos em um sistema corporativo de vendas. A aplicacao foi estruturada seguindo o padrao de arquitetura em camadas, garantindo a separacao de responsabilidades e a manutenibilidade do codigo.

## Funcionalidades Principais
* **Cadastro de Produtos (POST)**: Endpoint para insercao de novos produtos informando nome, preco e quantidade em estoque.
* **Listagem de Estoque (GET)**: Endpoint para recuperacao e listagem completa de todos os itens persistidos no banco de dados.
* **Validacao de Regras de Negocio**: Camada de servico com validacoes estruturadas (ex: bloqueio de precos negativos).
* **Mapeamento Objeto-Relacional**: Persistencia de dados automatizada via ORM sem a necessidade de escrita manual de instrucoes SQL.

## Arquitetura e Padrao de Pastas
O codigo fonte esta organizado dentro do pacote principal em quatro camadas bem definidas:
* `model`: Contem as entidades que representam as tabelas do banco de dados relacionais.
* `repository`: Interfaces que herdam do JpaRepository para gerenciar as operacoes de CRUD no banco.
* `service`: Concentra as regras de negocio, validacoes logicas e tratamento de excecoes da aplicacao.
* `controller`: Camada de apresentacao REST, responsavel por expor os endpoints HTTP e manipular requisicoes e respostas em formato JSON.

## Tecnologias e Dependencias Utilizadas
* **Linguagem**: Java 17 (LTS)
* **Framework Principal**: Spring Boot 3
* **Persistencia de Dados**: Spring Data JPA / Hibernate
* **Banco de Dados**: H2 Database (Banco de dados relacional em memoria para ambiente de desenvolvimento)
* **Utilitario**: Lombok (Remocao de codigo boilerplate por meio de anotacoes)
* **Ferramenta de Construcao**: Maven

## Instrucoes para Execucao Local

1. **Clonar o Repositorio**:
   ```bash
   git clone https://github.com
   cd sistema-vendas-backend
   ```

2. **Executar a Aplicacao**:
   Abra o projeto em uma IDE (como VS Code ou IntelliJ) com suporte ao Java 17 instalado e execute a classe principal `SistemaVendasApplication.java`.

3. **Endpoints Disponiveis**:
   * **Cadastrar Produto**: `POST http://localhost:8080/api/produtos`
     * Corpo da Requisicao (JSON):
       ```json
       {
         "nome": "Notebook Gamer",
         "preco": 4500.0,
         "quantidadeEstoque": 15
       }
       ```
   * **Listar Produtos**: `GET http://localhost:8080/api/produtos`

---
Projeto de portfolio focado em arquitetura em camadas (MVC), padrao REST, ORM e desenvolvimento de backend corporativo com Spring Boot.
