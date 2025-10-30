-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 30/10/2025 às 01:17
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `jovem programadora`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `alunas`
--

CREATE TABLE `alunas` (
  `id` int(11) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `idade` int(11) NOT NULL,
  `sexo` char(1) NOT NULL,
  `id_cidade` int(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `alunas`
--

INSERT INTO `alunas` (`id`, `nome`, `idade`, `sexo`, `id_cidade`) VALUES
(20, 'gabrielle', 19, 'F', NULL),
(21, 'monique', 17, 'F', NULL),
(22, 'layssa', 17, 'F', NULL),
(23, 'sara', 17, 'F', 3);

-- --------------------------------------------------------

--
-- Estrutura para tabela `cidades`
--

CREATE TABLE `cidades` (
  `id` int(11) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `UF` char(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `cidades`
--

INSERT INTO `cidades` (`id`, `nome`, `UF`) VALUES
(3, 'Colatina', 'Es'),
(4, 'Sao Paulo', 'SP'),
(5, 'Rio de Janeiro', 'RJ'),
(6, 'Belo Horizonte', 'MG'),
(7, 'Vitoria', 'ES'),
(8, 'niterói', 'RJ'),
(9, 'campinas', 'SP'),
(10, 'uberlandia', 'MG'),
(11, 'guarulhos', 'SP'),
(12, 'aracruz', 'ES'),
(13, 'baixo guandu', 'ES');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `alunas`
--
ALTER TABLE `alunas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_cidades_alunas` (`id_cidade`);

--
-- Índices de tabela `cidades`
--
ALTER TABLE `cidades`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `alunas`
--
ALTER TABLE `alunas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de tabela `cidades`
--
ALTER TABLE `cidades`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `alunas`
--
ALTER TABLE `alunas`
  ADD CONSTRAINT `fk_cidades_alunas` FOREIGN KEY (`id_cidade`) REFERENCES `cidades` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
