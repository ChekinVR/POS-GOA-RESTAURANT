-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-12-2022 a las 21:22:33
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `restaurant_goa`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `config`
--

CREATE TABLE `config` (
  `id` int(11) NOT NULL,
  `ruc` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `nombre` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `telefono` varchar(11) COLLATE utf8_spanish_ci NOT NULL,
  `direccion` text COLLATE utf8_spanish_ci NOT NULL,
  `mensaje` varchar(255) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `config`
--

INSERT INTO `config` (`id`, `ruc`, `nombre`, `telefono`, `direccion`, `mensaje`) VALUES
(1, '1111111111', 'Goa Indian Restaurant', '3336156173', 'C. Manuel López Cotilla 1520 A, Col Americana,', 'Gracias por la compra');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `confped`
--

CREATE TABLE `confped` (
  `id` int(11) DEFAULT NULL,
  `id_sala` int(11) DEFAULT NULL,
  `num_mesa` int(11) DEFAULT NULL,
  `fecha` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `total` decimal(10,2) DEFAULT NULL,
  `estado` enum('PENDIENTE','FINALIZADO') DEFAULT NULL,
  `usuario` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_pedidos`
--

CREATE TABLE `detalle_pedidos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `cantidad` decimal(10,2) NOT NULL,
  `comentario` text COLLATE utf8_spanish_ci DEFAULT NULL,
  `id_pedido` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `detalle_pedidos`
--

INSERT INTO `detalle_pedidos` (`id`, `nombre`, `precio`, `cantidad`, `comentario`, `id_pedido`) VALUES
(1, 'MUSHROOM KI SHAMMI', '110.00', '1.00', '', 1),
(2, 'MUSHROOM KI SHAMMI', '110.00', '1.00', '', 1),
(3, 'MUSHROOM KI SHAMMI', '110.00', '1.00', '', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidos`
--

CREATE TABLE `pedidos` (
  `id` int(11) NOT NULL,
  `id_sala` int(11) NOT NULL,
  `num_mesa` int(11) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `total` decimal(10,2) NOT NULL,
  `estado` enum('PENDIENTE','FINALIZADO') COLLATE utf8_spanish_ci NOT NULL DEFAULT 'PENDIENTE',
  `usuario` varchar(100) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `pedidos`
--

INSERT INTO `pedidos` (`id`, `id_sala`, `num_mesa`, `fecha`, `total`, `estado`, `usuario`) VALUES
(1, 1, 1, '2022-12-09 19:50:32', '330.00', 'PENDIENTE', 'Administrador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `platos`
--

CREATE TABLE `platos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `fecha` date DEFAULT NULL,
  `categoria` varchar(40) COLLATE utf8_spanish_ci DEFAULT NULL,
  `sub_categoria` varchar(40) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `platos`
--

INSERT INTO `platos` (`id`, `nombre`, `precio`, `fecha`, `categoria`, `sub_categoria`) VALUES
(1, 'FRENCH FRIES', '70.00', '2022-12-07', 'Entradas', NULL),
(2, 'ONION BHAJI', '110.00', '2022-12-07', 'Entradas', NULL),
(3, 'MUSHROOM KI SHAMMI', '110.00', '2022-12-07', 'Entradas', NULL),
(4, 'CHILLI PANEER', '110.00', '2022-12-07', 'Entradas', NULL),
(5, 'SAMOSA VEGETARIANA', '110.00', '2022-12-07', 'Entradas', NULL),
(6, 'SAMOSA POLLO', '110.00', '2022-12-07', 'Entradas', NULL),
(7, 'CHICKEN TIKKA', '115.00', '2022-12-07', 'Entradas', NULL),
(8, 'CHICKEN SEEKH KABAB', '115.00', '2022-12-07', 'Entradas', NULL),
(9, 'CHICKEN 65', '115.00', '2022-12-07', 'Entradas', NULL),
(10, 'MURG AFGHANI TIKKA', '115.00', '2022-12-07', 'Entradas', NULL),
(11, 'TANDOORI CHICKEN', '115.00', '2022-12-07', 'Entradas', NULL),
(12, 'LAHSUNI FISH TIKKA', '110.00', '2022-12-07', 'Entradas', NULL),
(13, 'AMRITSARI FISH', '110.00', '2022-12-07', 'Entradas', NULL),
(14, 'MUTTON SEEKH KABAB', '130.00', '2022-12-07', 'Entradas', NULL),
(15, 'NAAN', '45.00', '2022-12-07', 'Extras', NULL),
(16, 'HARA BHARA NAAN', '45.00', '2022-12-07', 'Extras', NULL),
(17, 'LACCA PARATHA', '50.00', '2022-12-07', 'Extras', NULL),
(18, 'TANDOORI ROTI', '40.00', '2022-12-07', 'Extras', NULL),
(19, 'ALOO PARATHA', '70.00', '2022-12-07', 'Extras', NULL),
(20, 'PANEER PARATHA', '79.00', '2022-12-07', 'Extras', NULL),
(21, 'MIX PARATHA', '79.00', '2022-12-07', 'Extras', NULL),
(22, 'PAPADUMS', '40.00', '2022-12-07', 'Extras', NULL),
(23, 'RAITA NAVABI', '40.00', '2022-12-07', 'Extras', NULL),
(24, 'PUDINA CHUTNEY', '40.00', '2022-12-07', 'Extras', NULL),
(25, 'ARROZ', '50.00', '2022-12-07', 'Extras', NULL),
(26, 'PICKLE', '50.00', '2022-12-07', 'Extras', NULL),
(27, 'ENSALADA HINDU', '45.00', '2022-12-07', 'Extras', NULL),
(28, 'AMRITSARI ZINGHA', '130.00', '2022-12-07', 'Entradas', NULL),
(29, 'GARLIC PRAWN', '130.00', '2022-12-07', 'Entradas', NULL),
(30, 'ENSALADA W/ CHICKEN', '120.00', '2022-12-07', 'Ensaladas Frias', NULL),
(31, 'ENSALADA W/ PANEER', '120.00', '2022-12-07', 'Ensaladas Frias', NULL),
(32, 'ENSALADA W/ PRAWNS', '130.00', '2022-12-07', 'Ensaladas Frias', NULL),
(33, 'aver', '123.00', '2022-12-07', 'Entradas', 'Arroz Especial'),
(34, 'PITOBI', '100.00', '2022-12-07', 'Entradas', 'Vegetariano');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salas`
--

CREATE TABLE `salas` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `mesas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `salas`
--

INSERT INTO `salas` (`id`, `nombre`, `mesas`) VALUES
(1, 'Adentro', 8),
(2, 'Terraza', 6),
(3, 'Para llevar 2', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `nombre` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `correo` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `pass` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `rol` varchar(20) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `nombre`, `correo`, `pass`, `rol`) VALUES
(1, 'Administrador', 'admin', 'pass', 'Administrador'),
(2, 'MESERO', 'Mesero', '', 'Mesero');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `config`
--
ALTER TABLE `config`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `detalle_pedidos`
--
ALTER TABLE `detalle_pedidos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_pedido` (`id_pedido`);

--
-- Indices de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_sala` (`id_sala`);

--
-- Indices de la tabla `platos`
--
ALTER TABLE `platos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `salas`
--
ALTER TABLE `salas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `config`
--
ALTER TABLE `config`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `detalle_pedidos`
--
ALTER TABLE `detalle_pedidos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `platos`
--
ALTER TABLE `platos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT de la tabla `salas`
--
ALTER TABLE `salas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle_pedidos`
--
ALTER TABLE `detalle_pedidos`
  ADD CONSTRAINT `detalle_pedidos_ibfk_1` FOREIGN KEY (`id_pedido`) REFERENCES `pedidos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD CONSTRAINT `pedidos_ibfk_1` FOREIGN KEY (`id_sala`) REFERENCES `salas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
