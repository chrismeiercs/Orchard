SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema OrchardDB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `OrchardDB` ;
USE `OrchardDB` ;

-- -----------------------------------------------------
-- Table `OrchardDB`.`Comp_Cells`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `OrchardDB`.`Comp_Cells` (
  `Batch` VARCHAR(45) NOT NULL,
  `Initial_Eff` INT NULL,
  `Initial_Recomb` INT NULL,
  `Cell_Type` VARCHAR(45) NULL,
  `Diluted` TINYINT(1) NULL,
  `Date_Made` VARCHAR(45) NULL,
  PRIMARY KEY (`Batch`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `OrchardDB`.`Transformation`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `OrchardDB`.`Transformation` (
  `Date` DATE NOT NULL,
  `Efficiency` INT NULL,
  `Plasmid` VARCHAR(45) NULL,
  `TimeConstant` FLOAT NULL,
  `Notebook` INT NULL,
  `Start_Page` INT NULL,
  `Stop_Page` INT NULL,
  `Method` VARCHAR(45) NULL,
  `Comp_Cells_Batch` INT NOT NULL,
  PRIMARY KEY (`Date`, `Comp_Cells_Batch`),
  INDEX `fk_Transformation_Comp_Cells1_idx` (`Comp_Cells_Batch` ASC),
  CONSTRAINT `fk_Transformation_Comp_Cells1`
    FOREIGN KEY (`Comp_Cells_Batch`)
    REFERENCES `OrchardDB`.`Comp_Cells` (`Batch`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `OrchardDB`.`Plate`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `OrchardDB`.`Plate` (
  `idPlate` VARCHAR(3) NOT NULL,
  `Method` VARCHAR(45) NULL,
  PRIMARY KEY (`idPlate`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `OrchardDB`.`Gene`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `OrchardDB`.`Gene` (
  `Locus` VARCHAR(14) NOT NULL,
  `Function` VARCHAR(500) NULL,
  `Plate` VARCHAR(10) NOT NULL,
  `Start` INT NULL,
  `Stop` INT NULL,
  `IsKO` VARCHAR(3) NULL,
  `NumOfTfns` VARCHAR(45) NULL,
  `Conc` FLOAT NULL,
  `Type` VARCHAR(2) NULL,
  PRIMARY KEY (`Locus`, `Plate`),
  INDEX `fk_Gene_Plate_idx` (`Plate` ASC),
  CONSTRAINT `fk_Gene_Plate`
    FOREIGN KEY (`Plate`)
    REFERENCES `OrchardDB`.`Plate` (`idPlate`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `OrchardDB`.`Transformation_has_Gene`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `OrchardDB`.`Transformation_has_Gene` (
  `Transformation_Date` DATE NOT NULL,
  `Gene_Number` INT NOT NULL,
  `Gene_Plate_idPlate` VARCHAR(3) NOT NULL,
  `TimeConstant` FLOAT NULL,
  `Colonies` INT NULL,
  `Shared` TINYINT(1) NULL,
  `SharedWith` INT NULL,
  `TfnNumber` INT NULL,
  `KOProduced` TINYINT(1) NULL,
  `Notes` VARCHAR(500) NULL,
  `DNA_Amt` VARCHAR(45) NULL,
  PRIMARY KEY (`Transformation_Date`, `Gene_Number`, `Gene_Plate_idPlate`),
  INDEX `fk_Transformation_has_Gene_Gene1_idx` (`Gene_Number` ASC, `Gene_Plate_idPlate` ASC),
  INDEX `fk_Transformation_has_Gene_Transformation1_idx` (`Transformation_Date` ASC),
  CONSTRAINT `fk_Transformation_has_Gene_Transformation1`
    FOREIGN KEY (`Transformation_Date`)
    REFERENCES `OrchardDB`.`Transformation` (`Date`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Transformation_has_Gene_Gene1`
    FOREIGN KEY (`Gene_Number` , `Gene_Plate_idPlate`)
    REFERENCES `OrchardDB`.`Gene` (`Locus` , `Plate`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
