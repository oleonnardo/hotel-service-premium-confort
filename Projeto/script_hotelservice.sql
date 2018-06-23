/*
Navicat MySQL Data Transfer

Source Server         : LOCALHOST
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : hotelservice

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-06-23 13:22:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sistema`
-- ----------------------------
DROP TABLE IF EXISTS `sistema`;
CREATE TABLE `sistema` (
  `id` int(11) NOT NULL,
  `tarifacao` tinyint(1) NOT NULL DEFAULT '0',
  `valor_tarifacao` double NOT NULL DEFAULT '0',
  `babysitter_por_hora` tinyint(1) NOT NULL DEFAULT '1',
  `babysitter_idade_min` int(11) NOT NULL DEFAULT '2',
  `babysitter_idade_max` int(11) NOT NULL DEFAULT '9',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- ----------------------------
-- Table structure for `hospede`
-- ----------------------------
DROP TABLE IF EXISTS `hospede`;
CREATE TABLE `hospede` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) NOT NULL,
  `email` varchar(100) NOT NULL,
  `cpf` varchar(20) NOT NULL,
  `nascimento` date NOT NULL,
  `cep` int(11) NOT NULL,
  `logradouro` varchar(250) NOT NULL,
  `numero` int(11) NOT NULL,
  `complemento` varchar(200) DEFAULT NULL,
  `bairro` varchar(250) NOT NULL,
  `cidade` varchar(250) NOT NULL,
  `estado` varchar(200) NOT NULL COMMENT 'A=Aberto e F=Fechado',
  `telefone` varchar(45) DEFAULT NULL,
  `celular` varchar(45) DEFAULT NULL,
  `data_inicial` date NOT NULL,
  `data_final` date NOT NULL,
  `tipo_cartao` int(11) NOT NULL,
  `cartao_credito` varchar(45) NOT NULL,
  `data_vencimento` date NOT NULL,
  `codigo_seguranca` int(11) NOT NULL,
  `status_contrato` enum('A','F','C') NOT NULL DEFAULT 'A',
  PRIMARY KEY (`id`),
  UNIQUE KEY `cpf_UNIQUE` (`cpf`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



-- ----------------------------
-- Table structure for `categoria_produto`
-- ----------------------------
DROP TABLE IF EXISTS `categoria_produto`;
CREATE TABLE `categoria_produto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `descricao` text,
  `ativo` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- ----------------------------
-- Table structure for `produto`
-- ----------------------------
DROP TABLE IF EXISTS `produto`;
CREATE TABLE `produto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `categoria_produto_id` int(11) NOT NULL,
  `titulo` varchar(250) NOT NULL,
  `descricao` text NOT NULL,
  `preco` double NOT NULL,
  `ativo` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `fk_produto_categoria_produto1_idx` (`categoria_produto_id`),
  CONSTRAINT `fk_produto_categoria_produto1` FOREIGN KEY (`categoria_produto_id`) REFERENCES `categoria_produto` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



-- ----------------------------
-- Table structure for `tipo_servico`
-- ----------------------------
DROP TABLE IF EXISTS `tipo_servico`;
CREATE TABLE `tipo_servico` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(250) NOT NULL,
  `descricao` text,
  `ativo` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- ----------------------------
-- Table structure for `servicos`
-- ----------------------------
DROP TABLE IF EXISTS `servicos`;
CREATE TABLE `servicos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_servico_id` int(11) NOT NULL,
  `nome` varchar(250) NOT NULL,
  `descricao` text NOT NULL,
  `preco` double NOT NULL COMMENT 'Preço (por unidade) do serviço',
  `vagas` int(11) NOT NULL DEFAULT '0' COMMENT 'Quantidade de vagas disponiveis pelo serviço',
  `qtde_pessoa_max` int(11) NOT NULL COMMENT 'Número máximo de pessoas que o serviço comporta.',
  `qtde_crianca_max` int(11) DEFAULT '0',
  `obs` text,
  `ativo` tinyint(1) NOT NULL DEFAULT '1' COMMENT '\n',
  PRIMARY KEY (`id`),
  KEY `fk_servicos_tipo_servico1_idx` (`tipo_servico_id`),
  CONSTRAINT `fk_servicos_tipo_servico1` FOREIGN KEY (`tipo_servico_id`) REFERENCES `tipo_servico` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION

) ENGINE=InnoDB DEFAULT CHARSET=latin1;



-- ----------------------------
-- Table structure for `compra_produto`
-- ----------------------------
DROP TABLE IF EXISTS `compra_produto`;
CREATE TABLE `compra_produto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hospede_id` int(11) NOT NULL,
  `produto_id` int(11) NOT NULL,
  `data_compra` datetime NOT NULL,
  `porcoes` int(11) NOT NULL,
  `obs` text,
  `ativo` enum('S','N') DEFAULT 'S',
  PRIMARY KEY (`id`),
  KEY `fk_compra_produto_hospede1_idx` (`hospede_id`),
  KEY `fk_compra_produto_produto1_idx` (`produto_id`),
  CONSTRAINT `fk_compra_produto_hospede1` FOREIGN KEY (`hospede_id`) REFERENCES `hospede` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_compra_produto_produto1` FOREIGN KEY (`produto_id`) REFERENCES `produto` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for `compra_servico`
-- ----------------------------
DROP TABLE IF EXISTS `compra_servico`;
CREATE TABLE `compra_servico` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hospede_id` int(11) NOT NULL,
  `servicos_id` int(11) NOT NULL,
  `qtde_criancas` int(11) NOT NULL,
  `qtde_pessoas` int(11) NOT NULL,
  `obs` text,
  `data_compra` text NULL,
  `ativo` enum('S','N') DEFAULT 'S',
  PRIMARY KEY (`id`),
  KEY `fk_compra_servico_hospede1_idx` (`hospede_id`),
  KEY `fk_compra_servico_servicos1_idx` (`servicos_id`),
  CONSTRAINT `fk_compra_servico_hospede1` FOREIGN KEY (`hospede_id`) REFERENCES `hospede` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_compra_servico_servicos1` FOREIGN KEY (`servicos_id`) REFERENCES `servicos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


