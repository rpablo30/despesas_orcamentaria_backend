# Desafio Gastos Recife em 2017 (Back-end)
Crie um App em Angular e Backend Java com SpringBoot, para ler e apresentar dados
sobre os gastos do Recife

datasource http://dados.recife.pe.gov.br/dataset/despesas-orcamentarias/resource/d4d8a7f0-d4be-4397-b950-f0c991438111

## Detalhes do desafio
  - O sistema deve ter três visualizações:
    -  Mostrando as despesas totais em cada mês
    -  Mostrando as despesas totais agrupadas por categoria
    -  Mostrar de onde vem o dinheiro agrupado por fonte
  - Também escolha uma das seguintes opções para implementar:
    - Possibilitar a edição e persistência dos dados.
    - Unificar as três visualizações em uma única tela (SPA - Single Page Application)

## Inicializando o Projeto
Este projeto foi feito utilizando o Spriong Boot 3.1, Java 17 e PostgreSql

### configurando o Ambiente

 - Será necessario instalar as dependencias Java e Spring: [como iniciar com o Spring](https://spring.io/quickstart).
 - Será necessario instalar o PostgreSql: [Download Postgres](https://www.postgresql.org/download/).
   - Alternativamente, você pode mudar para a branch feature/h2-database e ignorar as configurações de database, [ir para banch H2](https://github.com/Allanfd12/gastos-recife-back/tree/feature/h2-database#readme).
 - Será necessário criar uma nova database vazia no banco de dados, por exemplo, de nome `spring-recife`
 - Opcionalmente, você poderá utilizar o [Gastos recife Front-end](https://github.com/Allanfd12/gastos-recife-front) para facilitar a visualziação.

### configurando o Projeto

Após configurar corretamente as dependencias, será necessário ir no arquivo `src/main/resources/application.properties` e definir os dados de conexão com o banco.

**Atenção**
`spring.datasource.url= jdbc:postgresql://localhost:15432/spring-recife` representa url de conexão com o banco de dados, certifique-se de que a porta e o nome da database estão corretos.
a porta padrão de conexão do PostgreSql é a **5432** e deverá ser configurada, caso siga com uma instalação normal do postgre.

Uma vez definida as dependencias, o projeto poderá ser iniciado utilizando seu IDE favorito, ou rodando o comando `./mvnw spring-boot:run` na raiz do projeto.

Os testes podem ser executados usando o comando `./mvnw test`

Por padrão, será criado um ponto de acesso em http://localhost:8080/.

## Rotas Disponiveis

EndPoint | Função |  Metodo |
:--------- | :------ | :------ |
 /despesas| Permite o cadastro de um novo registro de despesa | POST |
 /despesas/{ano}/total| Retorna o total de despesas de um ano | GET |
 /despesas/{ano}/categoria| Retorna o total de despesas de um ano agrupado por categoria | GET |
 /despesas/{ano}/mes| Retorna o total de despesas de um ano agrupado por mês | GET |
 /despesas/{ano}/fonte| Retorna o total de despesas de um ano agrupado por fonte de recurso | GET |



