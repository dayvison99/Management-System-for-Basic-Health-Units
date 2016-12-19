-- MySQL dump 10.13  Distrib 5.7.13, for Linux (x86_64)
--
-- Host: localhost    Database: SGUBS
-- ------------------------------------------------------
-- Server version	5.7.13-0ubuntu0.16.04.2

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
  `horario` datetime DEFAULT NULL,
  `data_2` date DEFAULT NULL,
  PRIMARY KEY (`idAgendamento`),
  KEY `Agendamento_FKIndex1` (`paciente_idpaciente`),
  KEY `Agendamento_FKIndex2` (`medico_idMedico`),
  KEY `Agendamento_FKIndex3` (`unidadeDeSaude_idUnidadeDeSaude`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agendamento`
--

LOCK TABLES `agendamento` WRITE;
/*!40000 ALTER TABLE `agendamento` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `especialidade`
--

LOCK TABLES `especialidade` WRITE;
/*!40000 ALTER TABLE `especialidade` DISABLE KEYS */;
/*!40000 ALTER TABLE `especialidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionarios`
--

DROP TABLE IF EXISTS `funcionarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcionarios` (
  `idfuncionarios` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `endereço` varchar(100) DEFAULT NULL,
  `telefone` int(10) unsigned DEFAULT NULL,
  `funcao` varchar(20) DEFAULT NULL,
  `cpf` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`idfuncionarios`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionarios`
--

LOCK TABLES `funcionarios` WRITE;
/*!40000 ALTER TABLE `funcionarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `funcionarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicamento`
--

DROP TABLE IF EXISTS `medicamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicamento` (
  `idMedicamento` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `descricao` varchar(200) DEFAULT NULL,
  `quantidade` int(10) unsigned DEFAULT NULL,
  `nome` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idMedicamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicamento`
--

LOCK TABLES `medicamento` WRITE;
/*!40000 ALTER TABLE `medicamento` DISABLE KEYS */;
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
  `especialidade_idEspecialidade` int(10) unsigned NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `crm` int(10) unsigned DEFAULT NULL,
  `rua` varchar(50) DEFAULT NULL,
  `bairro` varchar(50) DEFAULT NULL,
  `cidade` varchar(50) DEFAULT NULL,
  `telefone` int(10) unsigned DEFAULT NULL,
  `celular` int(10) unsigned DEFAULT NULL,
  `observacoes` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`idMedico`),
  KEY `medico_FKIndex1` (`especialidade_idEspecialidade`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medico`
--

LOCK TABLES `medico` WRITE;
/*!40000 ALTER TABLE `medico` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente`
--

LOCK TABLES `paciente` WRITE;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;
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
  `telefone` int(10) unsigned DEFAULT NULL,
  `endereco` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idTecEnfermagem`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tecEnfermagem`
--

LOCK TABLES `tecEnfermagem` WRITE;
/*!40000 ALTER TABLE `tecEnfermagem` DISABLE KEYS */;
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
  `Nome` varchar(100) DEFAULT NULL,
  `endereço` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idUnidadeDeSaude`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unidadeDeSaude`
--

LOCK TABLES `unidadeDeSaude` WRITE;
/*!40000 ALTER TABLE `unidadeDeSaude` DISABLE KEYS */;
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

-- Dump completed on 2016-12-19 10:15:12
