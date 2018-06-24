/*
Navicat MySQL Data Transfer

Source Server         : LOCALHOST
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : hotelservice

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-06-23 13:22:05
*/


-- ----------------------------
-- Records of sistema
-- ----------------------------
INSERT INTO `sistema` VALUES ('1', '0', '0.25', '1', '2', '9');


-- ----------------------------
-- Records of categoria_produto
-- ----------------------------
INSERT INTO `categoria_produto` VALUES ('1', 'BOAS-VINDAS (WELCOME)', 'Boas-vindas (Welcome)', '1');
INSERT INTO `categoria_produto` VALUES ('2', 'A LA CARTE', 'A La Carte', '1');
INSERT INTO `categoria_produto` VALUES ('3', 'SOBREMESA (DESSERT)', 'Sobremesa (Dessert)', '1');
INSERT INTO `categoria_produto` VALUES ('4', 'BEBIDAS (DRINKS)', 'Bebidas (Drinks)', '1');
INSERT INTO `categoria_produto` VALUES ('5', 'BUFFET', 'Buffet', '1');
INSERT INTO `categoria_produto` VALUES ('6', 'MONTE O SEU (MAKE YOUR CHOICE)', 'Monte o Seu (Make Your Choice)', '1');
INSERT INTO `categoria_produto` VALUES ('7', 'BEBIDAS (BEVERAGES)', 'Bebidas (Beverages)', '1');


-- ----------------------------
-- Records of produto
-- ----------------------------
INSERT INTO `produto` VALUES ('1', '1', 'CESTA DE PÃES ARTESANAIS FEITO NO FORNO A LENHA DO RENE, TORRADAS COM AZEITE DE ERVAS, MANTEIGA FERMENTADA, GELÉIA CASEIRA, QUEIJOS, ROAST BEEF MARINADO, CALDINHO, FRITAS, BOLINHO DE MANDIOQUINHA COM BACALHAU', 'Basket of artisan breads, toast in herbal oil, cultured butter,\nhomemade jam, nomade broth, cheeses, marinated roast beef, fries and cod cassava cake', '210', '1');
INSERT INTO `produto` VALUES ('2', '2', 'BRIOCHE NA CHAPA COM COGUMELOS, OVO “PERFEITO”, BACON ARTESANAL E ESPUMA DE QUEIJO GRANA PADANO', 'Toasted brioche sauteed mushrooms and perfect egg, bacon and foam cheese grana Padano', '75.5', '1');
INSERT INTO `produto` VALUES ('3', '2', 'QUINOA COM CONSERVA DE COGUMELOS, AZEDINHA, DOCE DE LIMÃO SICILIANO E MOLHO DE IOGURTE', 'Quinoa with canned mushrooms, sourdough, sicilian lemon jam and yogurt sauce', '45.8', '1');
INSERT INTO `produto` VALUES ('4', '2', 'CHIPS DE BATATA DOCE, KEFIR, BOTTARGA E LIMÃO', 'Sweet potato chips, kefir, bottarga and lemon', '30', '1');
INSERT INTO `produto` VALUES ('5', '2', 'MINI HAMBÚRGUER DE PORCO MOURA NO BRIOCHE DA CASA COM RÚCULA, PICLES DE CEBOLA ROXA E QUEIJO PICANTE', 'Mini pork burger with arugula, purple onion pickles and spicy cheese', '27', '1');
INSERT INTO `produto` VALUES ('6', '2', 'ARROZ DE BACALHAU COM OVO E CRISPY DE MANDIOQUINHA', 'Creamy codfish with cassava crispy and egg', '27', '1');
INSERT INTO `produto` VALUES ('7', '2', 'CANELONE DE CORDEIRO COM MOLHO PECORINO E VEGETAIS', 'Lamb cannelloni with pecorino sauce and vegetables', '26', '1');
INSERT INTO `produto` VALUES ('8', '2', 'RABADA COM MILHO', 'Oxtail with corn', '25', '1');
INSERT INTO `produto` VALUES ('9', '3', 'COULIS DE MORANGO COM MERENGUE E SORVETE DE COCO', 'Strawberry coulis with merengue and coconut ice cream', '22', '1');
INSERT INTO `produto` VALUES ('10', '3', 'RABANADA COM CALDA DE DOCE DE LEITE E SORVETE DE LEITE', 'French toast with dulce de leche sauce and milk ice cream', '22', '1');
INSERT INTO `produto` VALUES ('11', '3', 'DOCES BRASILEIROS', 'Brazilian sweets', '20', '1');
INSERT INTO `produto` VALUES ('12', '4', 'ÁGUA AROMATIZADA', 'Naturally Flavored Water', '2', '1');
INSERT INTO `produto` VALUES ('13', '4', 'SUCO NATURAL', 'Fresh Juice', '2', '1');
INSERT INTO `produto` VALUES ('14', '4', 'CAFÉ PASSADO NORTE PIONEIRO', 'Coffee', '2', '1');
INSERT INTO `produto` VALUES ('15', '4', 'CHÁ', 'Tea', '2', '1');
INSERT INTO `produto` VALUES ('16', '4', 'COCKTAILS DO DIA', 'Cocktails of the day', '3', '1');
INSERT INTO `produto` VALUES ('17', '5', 'FRUTAS DA ESTAÇÃO, FRIOS E CHARCUTARIA, PÃES DE FERMENTAÇÃO NATURAL, DOCES CASEIROS, BOLOS, GRANOLAS, SUCOS, IOGURTE NATURAL', 'Season fruits, cheese and cold cuts, natural fermentation breads, homemade sweets, cakes, granuts, juices, natural yoghurt', '120.5', '1');
INSERT INTO `produto` VALUES ('18', '2', 'MINISSANDUÍCHE CAPRESE MOZZARELLA DE BÚFULA COM TOMATE FRESCO AO MOLHO PESTO', 'Caprese sanduich - buffalo mozzarella with fresh tomatoes and\npesto sauce', '25', '1');
INSERT INTO `produto` VALUES ('19', '2', 'WAFFLES COM GELÉIA E MEL', 'Waffles with jam and honey', '12', '1');
INSERT INTO `produto` VALUES ('20', '2', 'OVOS: MEXIDOS, FRITOS, OMELETE OU POCHÉ', 'Eggs: scrambled, fried, omellete or poached', '8', '1');
INSERT INTO `produto` VALUES ('21', '2', 'BACON NA CHAPA', 'Grilled bacon', '6', '1');
INSERT INTO `produto` VALUES ('22', '2', 'PÃO COM MANTEIGA NA CHAPA', 'Bread and butter on the grill', '4', '1');
INSERT INTO `produto` VALUES ('23', '2', 'PORÇÃO DE MINIPÃES DE QUEIJO', 'Serving of traditional brazilian mini cheese breads', '6', '1');
INSERT INTO `produto` VALUES ('24', '2', 'PORÇÃO DE MINIPÃES DE QUEIJO', 'Serving of traditional brazilian mini cheese breads', '8', '1');
INSERT INTO `produto` VALUES ('25', '6', 'TAPIOCA', 'Tapioca: home-made manioc flour pancakes', '4', '1');
INSERT INTO `produto` VALUES ('26', '6', 'PÃO FRANCÊS', 'French bread', '4', '1');
INSERT INTO `produto` VALUES ('27', '6', 'PÃO DE FORMA BRANCO', 'White sliced bread', '4', '1');
INSERT INTO `produto` VALUES ('28', '6', 'PÃO MULTIGRÃOS', 'Whole grain bread', '5', '1');
INSERT INTO `produto` VALUES ('29', '6', 'QUEIJO MOZZARELLA COM PRESUNTO', 'Mozzarella cheese and ham', '12', '1');
INSERT INTO `produto` VALUES ('30', '6', 'PEITO DE PERU COM QUEIJO MINAS FRESCAL', 'Turkey breast and minas frescal minas', '12', '1');
INSERT INTO `produto` VALUES ('31', '6', 'QUEIJO BRANCO OU AMARELO', 'White or yellow cheese', '12', '1');
INSERT INTO `produto` VALUES ('32', '7', 'VITAMINA DE MAMÃO COM BANANA E MAÇÃ', 'Papaya, apple and banana', '6', '1');
INSERT INTO `produto` VALUES ('33', '7', 'BANANA COM IOGURTE NATURAL, MEL E FAVA TONCA', 'Banana with plain yogurt, honey and tonka fava seeds', '6', '1');
INSERT INTO `produto` VALUES ('34', '7', 'CAFÉ EXPRESSO', 'Espresso coffee', '5', '1');
INSERT INTO `produto` VALUES ('35', '7', 'CAFÉ DESCAFEINADO CÁPSULA', 'Decaffeinated coffee (capsules)', '5', '1');
INSERT INTO `produto` VALUES ('36', '7', 'LEITE DE SOJA', 'Soy milk glass', '4', '1');
INSERT INTO `produto` VALUES ('37', '7', 'CHÁ MATE BATIDO COM FRUTAS', 'Yerba mate tea mixed with fruits', '4', '1');
INSERT INTO `produto` VALUES ('38', '7', 'TAÇA DE ESPUMANTE', 'Glass of sparkling wine', '4', '1');

-- ----------------------------
-- Records of tipo_servico
-- ----------------------------
INSERT INTO `tipo_servico` VALUES ('1', 'ALUGUEL DE CARRO', 'Os carros a serem alugados podem ser de 2 tipos: luxo e\nexecutivo. \n\nNa hora de solicitar o aluguel o hóspede tem que informar se deseja adicionar tanque cheio e seguro de automóvel. Cada um desses aditivos aumenta o valor do aluguel. \n\nOs hóspedes que alugarem carros terão em seu contrato um aditivo relativo a \"Aluguel de carro\" no valor consumido em quaisquer das unidades. Idealmente deve discriminar o que foi contratado e a quantidade de dias.', '1');
INSERT INTO `tipo_servico` VALUES ('2', 'BABYSITTER', 'Para os pais que desejarem descansar um pouco dos pequenos de 2 a 9 anos, o hotel oferece serviço de babysitter 24 horas.\n\nOs hóspedes que contratarem esse serviço terá um aditivo em seu contrato referente a \"Babysitter\" que deve indicar a quantidade de horas solicitadas e destas horas, quantas são valor dobrado.', '1');
INSERT INTO `tipo_servico` VALUES ('3', 'QUARTOS', 'Os quartos podem ou não ter cama adicional (o que influencia no preço do quarto) e ainda comportar quantidade de pessoas diferentes. \n\nExistem diferentes categorias de quartos (PRESIDENCIAL, LUXO_SIMPLES, LUXO_DUPLO, LUXO_TRIPLO, EXECUTIVO_SIMPLES, EXECUTIVO_SIMPLES, EXECUTIVO_DUPLO, EXECUTIVO_TRIPLO), os quartos presidenciais comportam até 4 pessoas e os demais até 3 pessoas.', '1');
INSERT INTO `tipo_servico` VALUES ('4', 'OUTROS', 'QUalquer outro serviço', '1');


-- ----------------------------
-- Records of servicos
-- ----------------------------
INSERT INTO `servicos` VALUES ('1', '1', 'DIÁRIA DE AUTOMÓVEL LUXO', 'Diária de Automóvel Luxo', '100', '20', '5', '3', '', '1');
INSERT INTO `servicos` VALUES ('2', '1', 'DIÁRIA DE AUTOMÓVEL EXECUTIVO', 'Diária de Automóvel Executivo', '60', '21', '5', '3', '', '1');
INSERT INTO `servicos` VALUES ('3', '1', 'SERVIÇO TANQUE CHEIO (TAXA ÚNICA*)', 'Serviço Tanque Cheio (taxa única*)', '250', '30', '0', '0', '', '1');
INSERT INTO `servicos` VALUES ('4', '1', 'CARRO ASSEGURADO (TAXA ÚNICA*)', 'Carro Assegurado (taxa única*)', '200', '30', '0', '0', '', '1');
INSERT INTO `servicos` VALUES ('5', '2', 'BABYSITTER (HORA)', 'Babysitter Hora', '45', '100', '0', '0', 'O número máximo de crianças é definido pelo número de vagas.', '1');
INSERT INTO `servicos` VALUES ('6', '3', 'QUARTO PRESIDENCIAL', 'Quarto Presidencial', '1200', '5', '4', '0', '', '1');
INSERT INTO `servicos` VALUES ('7', '3', 'QUARTO LUXO SIMPLES', 'Quarto Luxo Simples', '520', '5', '3', '0', '', '1');
INSERT INTO `servicos` VALUES ('8', '3', 'QUARTO LUXO DUPLO', 'Quarto Luxo Duplo', '570', '15', '3', '0', '', '1');
INSERT INTO `servicos` VALUES ('9', '3', 'QUARTO LUXO TRIPLO', 'Quarto Luxo Triplo', '620', '20', '3', '0', '', '1');
INSERT INTO `servicos` VALUES ('10', '3', 'QUARTO EXECUTIVO SIMPLES', 'Quarto Executivo Simples', '360', '5', '3', '0', '', '1');
INSERT INTO `servicos` VALUES ('11', '3', 'QUARTO EXECUTIVO DUPLO', 'Quarto Executivo Duplo', '385', '15', '3', '0', '', '1');
INSERT INTO `servicos` VALUES ('12', '3', 'QUARTO EXECUTIVO TRIPLO', 'Quarto Executivo Triplo', '440', '20', '3', '0', '', '1');
INSERT INTO `servicos` VALUES ('17', '4', 'SPA', 'Serviço de Spa', '150', '30', '1', '0', '', '1');
INSERT INTO `servicos` VALUES ('18', '4', 'CINEMA', 'Serviço de Cinema', '20', '50', '1', '0', '', '1');

