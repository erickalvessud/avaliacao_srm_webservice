# Prova técnica Desenvolvedor Sistemas
## Camada de WebService Restfull

Antes de rodar a aplicação, precisa-se configurar o banco de dados. 
Para esse projeto estou utilizando MySQL. 

Os passos são:

### 1 - Criar a tabela no MySQL:
```
CREATE TABLE `emprestimosrm`.`cliente` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `limite_credito` DECIMAL(8,2) NOT NULL,
  `tipo_risco` CHAR(1) NOT NULL,
  `taxa_juros` DECIMAL(8,2) NULL,
  PRIMARY KEY (`id`));
```
OBS: Após criar essa tabela, altere (se necessário) o arquivo de configurações da conexão em src\main\java\br\com\srm\emprestimows\config. Por ser um projeto para demonstração de conhecimento, o meu banco sem senha.

### 2 - Importar o projeto no IDE que desejar  
  Após imoprtar, rode Spring Boot através da classe de inicialização br.com.srm.emprestimows.config.Configuracao.

Pronto! Terá o Webservice rodando no Tomcat.


  
  


