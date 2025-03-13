# Sistema de Delivery

## 📌 Sobre o Projeto

Este projeto é um sistema de delivery que permite cadastrar produtos, categorias de produtos e usuários. O objetivo do sistema é facilitar o gerenciamento de itens e clientes para um serviço de entrega, com funcionalidades de cadastro, atualização, consulta e remoção.

## 👥 Equipe do Projeto  

[![LA1SA0](https://img.shields.io/badge/LA1SA0-FF4081?style=for-the-badge&logo=github&logoColor=white)](https://github.com/LA1SA0)
[![correabeas](https://img.shields.io/badge/correabeas-7C4DFF?style=for-the-badge&logo=github&logoColor=white)](https://github.com/correabeas)
[![carolgonc](https://img.shields.io/badge/carolgonc-536DFE?style=for-the-badge&logo=github&logoColor=white)](https://github.com/carolgonc)
[![0M1n40](https://img.shields.io/badge/0M1n40-03A9F4?style=for-the-badge&logo=github&logoColor=white)](https://github.com/0M1n40)
[![anakelys](https://img.shields.io/badge/anakelys-00BCD4?style=for-the-badge&logo=github&logoColor=white)](https://github.com/anakelys)
[![desireeferreira](https://img.shields.io/badge/desireeferreira-4CAF50?style=for-the-badge&logo=github&logoColor=white)](https://github.com/desireeferreira)
[![laura-azevedo](https://img.shields.io/badge/laura--azevedo-FF9800?style=for-the-badge&logo=github&logoColor=white)](https://github.com/laura-azevedo)

## 🛠 Tecnologias Utilizadas

- **Backend:** Java com Spring Boot  
- **Banco de Dados:** MySQL  
- **ORM:** Hibernate (JPA)  
- **Gerenciamento de Dependências:** Maven  
- **Ferramenta de Testes:** Insomnia

## 📂 Estrutura do Projeto

O sistema gerencia três entidades principais: **Produto**, **Categoria** e **Usuário**.

### 1. Produto
- `id (Long)` - Identificador único do produto  
- `nome (String)` - Nome do produto  
- `descricao (String)` - Descrição detalhada do produto  
- `preco (float)` - Preço do produto
-  `estoque (Double)` - Quantidade do produto 

### 2. Categoria
- `id (Long)` - Identificador único da categoria  
- `nome (String)` - Nome da categoria  
- `descricao (String)` - Descrição da categoria  

### 3. Usuário
- `id (Long)` - Identificador único do usuário  
- `nome (String)` - Nome completo do usuário  
- `usuario (String)` - Email do usuário
-  `senha (String)` - Senha do usuário  
- `foto (String)` - Foto do usuário

## 🔧 Funcionalidades (CRUD)

### Produto
- **Criar Produto (POST)** → `localhost:8080/produtos`  
- **Listar Todos os Produtos (GET)** → `localhost:8080/produtos`  
- **Buscar Produto por ID (GET)** → `localhost:8080/produtos/{id}`  
- **Atualizar Produto (PUT)** → `localhost:8080/produtos/{id}`  
- **Excluir Produto (DELETE)** → `localhost:8080/produtos/{id}`

### Categoria
- **Criar Categoria (POST)** → `localhost:8080/categorias`  
- **Listar Todas as Categorias (GET)** → `localhost:8080/categorias`  
- **Buscar Categoria por ID (GET)** → `localhost:8080/categorias/{id}`  
- **Atualizar Categoria (PUT)** → `localhost:8080/categorias/{id}`  
- **Excluir Categoria (DELETE)** → `localhost:8080/categorias/{id}`

### Usuário
- **Criar Usuário (POST)** → `localhost:8080/usuarios`  
- **Listar Todos os Usuários (GET)** → `localhost:8080/usuarios/all`
- **Consultar o usuario pelo nome(GET)** → `localhost:8080/usuarios/nome/{nome}`  
- **Buscar Usuário por ID (GET)** → `localhost:8080/usuarios/{id}`  
- **Atualizar Usuário (PUT)** → `localhost:8080/usuarios/{id}`  
- **Excluir Usuário (DELETE)** → `localhost:8080/usuarios/{id}`

## 🚀 Como Executar o Projeto

### 1️⃣ Pré-requisitos:
- Java 17+  
- Spring Boot  
- MySQL  
- Maven

### 2️⃣ Clonando o Repositório:

```bash
°windows
git clone https://github.com/0M1n40/Projeto2_Delivery.git
cd Projeto2_Delivery
````
```bash
°linux
git clone git@github.com:0M1n40/Projeto2_Delivery.git
cd Projeto2_Delivery
