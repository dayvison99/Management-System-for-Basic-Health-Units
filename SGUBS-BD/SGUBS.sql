-- MySQL dump 10.13  Distrib 5.7.17, for Linux (x86_64)
--
-- Host: localhost    Database: SGUBS
-- ------------------------------------------------------
-- Server version	5.7.17-0ubuntu0.16.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `agendamento`
--

DROP TABLE IF EXISTS `agendamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `agendamento` (
  `idAgendamento` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `unidadeDeSaude_idUnidadeDeSaude` int(10) unsigned NOT NULL,
  `medico_idMedico` int(10) unsigned NOT NULL,
  `paciente_idpaciente` int(10) unsigned NOT NULL,
  `turno` varchar(20) DEFAULT NULL,
  `data_2` date DEFAULT NULL,
  PRIMARY KEY (`idAgendamento`),
  KEY `Agendamento_FKIndex1` (`paciente_idpaciente`),
  KEY `Agendamento_FKIndex2` (`medico_idMedico`),
  KEY `Agendamento_FKIndex3` (`unidadeDeSaude_idUnidadeDeSaude`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agendamento`
--

LOCK TABLES `agendamento` WRITE;
/*!40000 ALTER TABLE `agendamento` DISABLE KEYS */;
INSERT INTO `agendamento` VALUES (1,1,1,1,'12:30:00','2016-05-12'),(5,5,5,5,'16:30:00','2016-12-12'),(6,2,3,15,'12:10:00','2016-05-12');
/*!40000 ALTER TABLE `agendamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `consultaHistorico`
--

DROP TABLE IF EXISTS `consultaHistorico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `consultaHistorico` (
  `idconsulta` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `medicamento_idMedicamento` int(10) unsigned NOT NULL,
  `medico_idMedico` int(10) unsigned NOT NULL,
  `paciente_idpaciente` int(10) unsigned NOT NULL,
  `data_3` date DEFAULT NULL,
  `horario` datetime DEFAULT NULL,
  `prescricaoMedica` varchar(200) DEFAULT NULL,
  `pressaoArterial` float DEFAULT NULL,
  `peso` float DEFAULT NULL,
  `altura` float DEFAULT NULL,
  PRIMARY KEY (`idconsulta`,`paciente_idpaciente`),
  KEY `consultaHistorico_FKIndex1` (`paciente_idpaciente`),
  KEY `consultaHistorico_FKIndex2` (`medico_idMedico`),
  KEY `consultaHistorico_FKIndex3` (`medicamento_idMedicamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consultaHistorico`
--

LOCK TABLES `consultaHistorico` WRITE;
/*!40000 ALTER TABLE `consultaHistorico` DISABLE KEYS */;
/*!40000 ALTER TABLE `consultaHistorico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `controleUsuarios`
--

DROP TABLE IF EXISTS `controleUsuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `controleUsuarios` (
  `idUsuario` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `medico_idMedico` int(10) unsigned NOT NULL,
  `funcionarios_idfuncionarios` int(10) unsigned NOT NULL,
  `tecEnfermagem_idTecEnfermagem` int(10) unsigned NOT NULL,
  `senha` varchar(20) DEFAULT NULL,
  `nomeUsuario` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`),
  KEY `controleUsuarios_FKIndex1` (`tecEnfermagem_idTecEnfermagem`),
  KEY `controleUsuarios_FKIndex2` (`funcionarios_idfuncionarios`),
  KEY `controleUsuarios_FKIndex3` (`medico_idMedico`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `controleUsuarios`
--

LOCK TABLES `controleUsuarios` WRITE;
/*!40000 ALTER TABLE `controleUsuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `controleUsuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entradaMedicamentos`
--

DROP TABLE IF EXISTS `entradaMedicamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entradaMedicamentos` (
  `identrada` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `medicamento_idMedicamento` int(10) unsigned NOT NULL,
  `numeroNota` int(10) unsigned DEFAULT NULL,
  `dataEntrada` date DEFAULT NULL,
  `horario` time DEFAULT NULL,
  PRIMARY KEY (`identrada`),
  KEY `entradaMedicamentos_FKIndex1` (`medicamento_idMedicamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entradaMedicamentos`
--

LOCK TABLES `entradaMedicamentos` WRITE;
/*!40000 ALTER TABLE `entradaMedicamentos` DISABLE KEYS */;
/*!40000 ALTER TABLE `entradaMedicamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `especialidade`
--

DROP TABLE IF EXISTS `especialidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `especialidade` (
  `idEspecialidade` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `especialidade` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idEspecialidade`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `especialidade`
--

LOCK TABLES `especialidade` WRITE;
/*!40000 ALTER TABLE `especialidade` DISABLE KEYS */;
INSERT INTO `especialidade` VALUES (2,'fa'),(4,'teste'),(5,'tetetete'),(6,'0'),(7,'Pediatra'),(8,'Cirurgiao'),(9,'0'),(10,'breno'),(11,'teste a'),(12,'vlndslvkndlkvnld'),(13,'vlndslvkndlkvnld'),(14,'vlndslvkndlkvnld');
/*!40000 ALTER TABLE `especialidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcionario` (
  `idfuncionario` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `cpf` varchar(11) DEFAULT NULL,
  `rua` varchar(100) DEFAULT NULL,
  `bairro` varchar(100) DEFAULT NULL,
  `cidade` varchar(100) DEFAULT NULL,
  `telefone` int(10) unsigned DEFAULT NULL,
  `celular` int(10) unsigned DEFAULT NULL,
  `funcao` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idfuncionario`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` VALUES (1,'jaime cordeiro','104025987','rua l','centro','januaria',3691,3126,'faxineiro');
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicamento`
--

DROP TABLE IF EXISTS `medicamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicamento` (
  `idMedicamento` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `descricao` varchar(200) DEFAULT NULL,
  `quantidade` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`idMedicamento`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicamento`
--

LOCK TABLES `medicamento` WRITE;
/*!40000 ALTER TABLE `medicamento` DISABLE KEYS */;
INSERT INTO `medicamento` VALUES (1,'dipirona 3','aaaaaa',5),(2,'Paracetamou','teste',3);
/*!40000 ALTER TABLE `medicamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medico`
--

DROP TABLE IF EXISTS `medico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medico` (
  `idMedico` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `crm` int(10) unsigned DEFAULT NULL,
  `rua` varchar(50) DEFAULT NULL,
  `bairro` varchar(50) DEFAULT NULL,
  `cidade` varchar(50) DEFAULT NULL,
  `telefone` int(10) unsigned DEFAULT NULL,
  `celular` int(10) unsigned DEFAULT NULL,
  `especialidade_idEspecialidade` int(10) unsigned NOT NULL,
  `observacoes` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`idMedico`),
  KEY `medico_FKIndex1` (`especialidade_idEspecialidade`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medico`
--

LOCK TABLES `medico` WRITE;
/*!40000 ALTER TABLE `medico` DISABLE KEYS */;
INSERT INTO `medico` VALUES (1,'JOAO PAULO FREITAS',152603,'AV JK N 300','ALVORADA','JANUARIA',38362158,38915869,0,''),(2,'MEDICO A',22,'','','',0,0,0,''),(3,'teste',123456,'','','',0,0,0,''),(4,'medico c',123456,'v','v','v',36211480,91589258,0,'teste telefone'),(5,'DR DAYVISON',11111,'','','',0,0,0,''),(6,'testee2',12345,'','','',0,0,0,'');
/*!40000 ALTER TABLE `medico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paciente`
--

DROP TABLE IF EXISTS `paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paciente` (
  `idpaciente` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `cpf` varchar(11) DEFAULT NULL,
  `rua` varchar(50) DEFAULT NULL,
  `bairro` varchar(50) DEFAULT NULL,
  `cidade` varchar(50) DEFAULT NULL,
  `telefone` int(10) unsigned DEFAULT NULL,
  `celular` int(10) unsigned DEFAULT NULL,
  `tipoSanguineo` varchar(50) DEFAULT NULL,
  `localTrabalho` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idpaciente`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente`
--

LOCK TABLES `paciente` WRITE;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` VALUES (2,'dayvison marley nunes','1070258963','rua aj','centro','januaria',36211480,91582623,'a-','ifnmg'),(7,'Marcos ferreira','10598764225','rua i','alto','manga',36251,9915869,'ab','ceramica'),(8,'dayvison marley nunes silva','1070258963','coronel serrao','Boa Vista','januaria',36211480,91582623,'o','cantinho'),(9,'dayvison marley nunes silva','1070258963','rua b nº 286','Boa Vista','januaria',36211480,91582623,'o','cantinho'),(10,'maria jose nunes','12345678952','sem rua','centro','m',91258,369,'d','teste'),(11,'maria jose perreira','12345678952','sem rua','centro','m',91258,369,'d','teste'),(12,'maria jose pronto 2','12345678952','sem rua','centro','m',91258,369,'d','teste'),(13,'fagner vieira','1052','5','centro','januaria',3621,9169,'a-','nao'),(14,'Cleiton','2424','rua j','centro','janurira',2424,2424,'a-','emater'),(15,'higor soares','258369147','rua j','centro','morro',147258,369258,'a-','nao tem'),(16,'jonas','25896','fsfms','dsfmsdlfkn','sdlnvlsdv',369,366,'a+','teste');
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `saidaMedicamento`
--

DROP TABLE IF EXISTS `saidaMedicamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `saidaMedicamento` (
  `idsaidaMedicamento` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `paciente_idpaciente` int(10) unsigned NOT NULL,
  `medicamento_idMedicamento` int(10) unsigned NOT NULL,
  `qtde` int(10) unsigned DEFAULT NULL,
  `data_2` date DEFAULT NULL,
  PRIMARY KEY (`idsaidaMedicamento`),
  KEY `saidaMedicamento_FKIndex1` (`medicamento_idMedicamento`),
  KEY `saidaMedicamento_FKIndex2` (`paciente_idpaciente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `saidaMedicamento`
--

LOCK TABLES `saidaMedicamento` WRITE;
/*!40000 ALTER TABLE `saidaMedicamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `saidaMedicamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tecEnfermagem`
--

DROP TABLE IF EXISTS `tecEnfermagem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tecEnfermagem` (
  `idTecEnfermagem` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) DEFAULT NULL,
  `coren` varchar(20) DEFAULT NULL,
  `rua` varchar(50) DEFAULT NULL,
  `bairro` varchar(50) DEFAULT NULL,
  `cidade` varchar(50) DEFAULT NULL,
  `telefone` int(10) unsigned DEFAULT NULL,
  `celular` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`idTecEnfermagem`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tecEnfermagem`
--

LOCK TABLES `tecEnfermagem` WRITE;
/*!40000 ALTER TABLE `tecEnfermagem` DISABLE KEYS */;
INSERT INTO `tecEnfermagem` VALUES (1,'teste 3','13456','a','a','a',36,91);
/*!40000 ALTER TABLE `tecEnfermagem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unidadeDeSaude`
--

DROP TABLE IF EXISTS `unidadeDeSaude`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `unidadeDeSaude` (
  `idUnidadeDeSaude` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `rua` varchar(50) DEFAULT NULL,
  `bairro` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idUnidadeDeSaude`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unidadeDeSaude`
--

LOCK TABLES `unidadeDeSaude` WRITE;
/*!40000 ALTER TABLE `unidadeDeSaude` DISABLE KEYS */;
INSERT INTO `unidadeDeSaude` VALUES (1,'Unidade Leste','anbrosio nº50','centro'),(2,'Unidade Alto','Porcao','Alto');
/*!40000 ALTER TABLE `unidadeDeSaude` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-05  1:34:48
