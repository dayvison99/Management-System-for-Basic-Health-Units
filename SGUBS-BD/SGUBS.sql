CREATE TABLE agendamento (
  idAgendamento INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  unidadeDeSaude_idUnidadeDeSaude INTEGER UNSIGNED NOT NULL,
  medico_idMedico INTEGER UNSIGNED NOT NULL,
  paciente_idpaciente INTEGER UNSIGNED NOT NULL,
  horario DATETIME NULL,
  data_2 DATE NULL,
  PRIMARY KEY(idAgendamento),
  INDEX Agendamento_FKIndex1(paciente_idpaciente),
  INDEX Agendamento_FKIndex2(medico_idMedico),
  INDEX Agendamento_FKIndex3(unidadeDeSaude_idUnidadeDeSaude)
);


CREATE TABLE controleUsuarios (
  idUsuario INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  medico_idMedico INTEGER UNSIGNED NOT NULL,
  funcionarios_idfuncionarios INTEGER UNSIGNED NOT NULL,
  tecEnfermagem_idTecEnfermagem INTEGER UNSIGNED NOT NULL,
  senha VARCHAR(20) NULL,
  nomeUsuario VARCHAR(100) NULL,
  PRIMARY KEY(idUsuario),
  INDEX controleUsuarios_FKIndex1(tecEnfermagem_idTecEnfermagem),
  INDEX controleUsuarios_FKIndex2(funcionarios_idfuncionarios),
  INDEX controleUsuarios_FKIndex3(medico_idMedico)
);

CREATE TABLE entradaMedicamentos (
  identrada INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  medicamento_idMedicamento INTEGER UNSIGNED NOT NULL,
  numeroNota INTEGER UNSIGNED NULL,
  dataEntrada DATE NULL,
  horario TIME NULL,
  PRIMARY KEY(identrada),
  INDEX entradaMedicamentos_FKIndex1(medicamento_idMedicamento)
);

CREATE TABLE especialidade (
  idEspecialidade INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  especialidade VARCHAR(50) NULL,
  PRIMARY KEY(idEspecialidade)
);

CREATE TABLE funcionario (
  idfuncionario INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nome VARCHAR(100) NULL,
  cpf VARCHAR(11) NULL,
  rua VARCHAR(100) NULL,
  bairro VARCHAR(100) NULL,
  cidade VARCHAR(100) NULL,
  telefone INTEGER UNSIGNED NULL,
  celular INTEGER UNSIGNED NULL,
  funcao VARCHAR(20) NULL,
  PRIMARY KEY(idfuncionario)
);

CREATE TABLE medicamento (
  idMedicamento INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  descricao VARCHAR(200) NULL,
  quantidade INTEGER UNSIGNED NULL,
  nome VARCHAR(100) NULL,
  PRIMARY KEY(idMedicamento)
);

CREATE TABLE medico (
  idMedico INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nome VARCHAR(100) NULL,
  crm INTEGER UNSIGNED NULL,
  rua VARCHAR(50) NULL,
  bairro VARCHAR(50) NULL,
  cidade VARCHAR(50) NULL,
  telefone INTEGER UNSIGNED NULL,
  celular INTEGER UNSIGNED NULL,
  especialidade_idEspecialidade INTEGER UNSIGNED NOT NULL,
  observacoes VARCHAR(200) NULL,
  PRIMARY KEY(idMedico),
  INDEX medico_FKIndex1(especialidade_idEspecialidade)
);

CREATE TABLE paciente (
  idpaciente INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nome VARCHAR(100) NULL,
  cpf VARCHAR(11) NULL,
  rua VARCHAR(50) NULL,
  bairro VARCHAR(50) NULL,
  cidade VARCHAR(50) NULL,
  telefone INTEGER UNSIGNED NULL,
  celular INTEGER UNSIGNED NULL,
  tipoSanguineo VARCHAR(50) NULL,
  localTrabalho VARCHAR(50) NULL,
  PRIMARY KEY(idpaciente)
);

CREATE TABLE tecEnfermagem (
  idTecEnfermagem INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nome VARCHAR(200) NULL,
  coren VARCHAR(20) NULL,
  telefone INTEGER UNSIGNED NULL,
  endereco VARCHAR(50) NULL,
  PRIMARY KEY(idTecEnfermagem)
);

CREATE TABLE unidadeDeSaude (
  idUnidadeDeSaude INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nome VARCHAR(100) NULL,
  rua VARCHAR(50) NULL,
  bairro VARCHAR(50) NULL,
  PRIMARY KEY(idUnidadeDeSaude)
);
CREATE TABLE consultaHistorico(
  idconsulta INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  medicamento_idMedicamento INTEGER UNSIGNED NOT NULL,
  medico_idMedico INTEGER UNSIGNED NOT NULL,
  paciente_idpaciente INTEGER UNSIGNED NOT NULL,
  data_3 DATE NULL,
  horario DATETIME NULL,
  prescricaoMedica VARCHAR(200) NULL,
  pressaoArterial FLOAT NULL,
  peso FLOAT NULL,
  altura FLOAT NULL,
  PRIMARY KEY(idconsulta, paciente_idpaciente),
  INDEX consultaHistorico_FKIndex1(paciente_idpaciente),
  INDEX consultaHistorico_FKIndex2(medico_idMedico),
  INDEX consultaHistorico_FKIndex3(medicamento_idMedicamento)
);
CREATE TABLE saidaMedicamento (
  idsaidaMedicamento INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  paciente_idpaciente INTEGER UNSIGNED NOT NULL,
  medicamento_idMedicamento INTEGER UNSIGNED NOT NULL,
  qtde INTEGER UNSIGNED NULL,
  data_2 DATE NULL,
  PRIMARY KEY(idsaidaMedicamento),
  INDEX saidaMedicamento_FKIndex1(medicamento_idMedicamento),
  INDEX saidaMedicamento_FKIndex2(paciente_idpaciente)
);



