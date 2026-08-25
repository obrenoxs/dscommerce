# DSCommerce

> 🚧 **Projeto em desenvolvimento** — este repositório está sendo construído como parte do curso [Java Spring Professional](https://devsuperior.club/courses/5) da [Dev Superior](https://devsuperior.com.br), ministrado pelo Prof. Dr. Nelio Alves.

## 📋 Sobre o projeto

O **DSCommerce** é um sistema de e-commerce educacional, cujo objetivo é aplicar, na prática, os principais conceitos de desenvolvimento back-end com Java e Spring Boot. O sistema mantém um cadastro de usuários, produtos e categorias, permitindo que usuários naveguem por um catálogo de produtos, montem um carrinho de compras e finalizem pedidos.

### Premissas do sistema

- Modelo de domínio relativamente simples, porém abrangente, explorando diferentes tipos de relacionamento entre entidades (muitos-para-um, muitos-para-muitos etc.).
- Aplicação de conhecimentos fundamentais de desenvolvimento de software.
- Implementação das principais funcionalidades esperadas de um profissional iniciante (cadastros, fluxos de caso de uso, autenticação, etc.).

## 🎯 Visão geral funcional

O sistema permite que:

- Usuários **anônimos** consultem o catálogo de produtos, gerenciem o carrinho de compras, façam login e se cadastrem (*sign up*).
- **Clientes** atualizem seus próprios dados, registrem pedidos e visualizem seu histórico de pedidos.
- **Administradores** tenham acesso à área administrativa, com CRUD de produtos, categorias e usuários, além de registro de pagamentos e relatórios de pedidos.

### Casos de uso

| Caso de uso | Visão geral | Acesso |
|---|---|---|
| Consultar catálogo | Listar produtos disponíveis, podendo filtrar pelo nome | Público |
| Gerenciar carrinho | Incluir/remover itens do carrinho e alterar quantidades | Público |
| Sign up | Cadastrar-se no sistema | Público |
| Login | Efetuar login no sistema | Público |
| Registrar pedido | Salvar um pedido a partir dos dados do carrinho | Usuário logado |
| Atualizar perfil | Atualizar o próprio cadastro | Usuário logado |
| Visualizar pedidos | Visualizar os pedidos já feitos pelo próprio usuário | Usuário logado |
| Manter produtos | CRUD de produtos, com filtro por nome | Somente Admin |
| Manter categorias | CRUD de categorias, com filtro por nome | Somente Admin |
| Manter usuários | CRUD de usuários, com filtro por nome | Somente Admin |
| Registrar pagamento | Salvar os dados do pagamento de um pedido | Somente Admin |
| Reportar pedidos | Relatório de pedidos, filtrável por data | Somente Admin |

## 🧩 Modelo conceitual

Principais entidades do domínio:

- **User**: id, name, email, phone, birthDate, password, roles (client, admin)
- **Product**: id, name, description, price, imgUrl
- **Category**: id, name
- **Order**: id, moment, status, client, itens, payment
- **OrderItem**: produto, quantidade e preço (armazenado no item para preservar o histórico de venda, mesmo que o preço do produto mude futuramente)
- **Payment**: id, moment
- **OrderStatus** (enum): `WAITING_PAYMENT`, `PAID`, `SHIPPED`, `DELIVERED`, `CANCELED`

Relacionamentos de destaque:

- Um `Order` pertence a um `User` (client), e um usuário pode ter vários pedidos.
- Um `Order` possui vários `OrderItem`, cada um referenciando um `Product`.
- Um `Product` pode pertencer a várias `Category` e vice-versa (muitos-para-muitos).
- Um `User` pode ter uma ou mais `roles` (perfis de acesso).

## 🛠️ Tecnologias e configurações

| Tecnologia | Versão / detalhe |
|---|---|
| Java | 17 |
| Spring Boot | 3.0.0 |
| Gerenciador de dependências | Maven |
| Persistência | Spring Data JPA / Hibernate |
| Banco de dados (desenvolvimento/testes) | H2 Database (em memória) |
| Banco de dados (produção) | MySQL *(a integrar)* |
| Segurança | Spring Security + JWT *(a integrar)* |

## 📄 Documentação

- Documento de requisitos completo disponível na pasta `docs/` (ou referenciar aqui conforme adicionado ao repositório).
- Protótipos de tela: [Figma](https://www.figma.com/file/ZrGNVNG0kZL6txDv4G8P6s/DSCommerce)

## 👤 Autor

Desenvolvido por **Breno Oliveira de Souza** como parte dos estudos em desenvolvimento back-end com Java.

- GitHub: [@obrenoxs](https://github.com/obrenoxs)
- LinkedIn: [Breno Souza](https://www.linkedin.com/in/breno-oliveira-souza/)