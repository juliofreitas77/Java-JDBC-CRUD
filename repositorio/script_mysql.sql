CREATE TABLE IF NOT EXISTS `Cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `Nome_Cliente` VARCHAR(100) NULL,
  `CPF_Cliente` VARCHAR(45) NOT NULL,
  `Endereco_Cliente` VARCHAR(100) NULL,
  `Bairro_Cliente` VARCHAR(45) NULL,
  `Cidade_Cliente` VARCHAR(45) NULL,
  `Cep_Cliente` VARCHAR(45) NULL,
  `DataNasc_Cliente` DATE NULL,
  `Email_Cliente` VARCHAR(45) NULL,
  `Telefone_Cliente` VARCHAR(45) NULL,
  PRIMARY KEY (`idCliente`))
ENGINE = InnoDB