-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 13-11-2024 a las 22:44:07
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `restaurante`
--
CREATE DATABASE IF NOT EXISTS `restaurante` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `restaurante`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle`
--

CREATE TABLE `detalle` (
  `idDetalle` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  `cantidadProductos` int(11) NOT NULL,
  `idPedido` int(11) NOT NULL,
  `importe` double NOT NULL,
  `baja` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detalle`
--

INSERT INTO `detalle` (`idDetalle`, `idProducto`, `cantidadProductos`, `idPedido`, `importe`, `baja`) VALUES
(1, 1, 3, 1, 50, 0),
(2, 1, 2, 1, 66, 0),
(3, 1, 10, 1, 330, 0),
(4, 1, 5, 1, 165, 0),
(5, 1, 5, 1, 165, 0),
(6, 2, 4, 2, 20, 0),
(7, 1, 4, 1, 132, 0),
(8, 4, 5, 1, 30, 0),
(9, 3, 2, 5, 160, 0),
(10, 6, 3, 5, 30, 0),
(11, 4, 4, 5, 24, 0),
(12, 5, 3, 5, 30, 0),
(13, 4, 9, 8, 54, 0),
(14, 5, 2, 5, 20, 0),
(15, 2, 5, 1, 25, 0),
(16, 1, 3, 1, 99, 0),
(17, 1, 5, 15, 165, 0),
(18, 2, 4, 16, 20, 0),
(19, 3, 1, 5, 80, 0),
(20, 2, 1, 4, 5, 0),
(21, 2, 2, 4, 10, 0),
(22, 3, 1, 4, 80, 0),
(23, 3, 1, 1, 80, 0),
(24, 3, 1, 1, 80, 0),
(25, 4, 2, 6, 12, 0),
(26, 2, 3, 6, 15, 0),
(27, 1, 1, 6, 33, 0),
(28, 1, 2, 6, 66, 0),
(29, 1, -2, 6, -66, 0),
(30, 1, 2, 6, 66, 0),
(31, 1, 1, 8, 33, 0),
(32, 2, 1, 8, 5, 0),
(33, 3, 1, 8, 80, 0),
(34, 1, 1, 10, 33, 0),
(35, 5, 1, 8, 10, 0),
(36, 6, 1, 8, 10, 0),
(37, 4, 1, 15, 6, 0),
(38, 1, 1, 17, 33, 0),
(39, 2, 2, 17, 10, 0),
(40, 8, 5, 17, 55, 0),
(41, 7, 1, 17, 50, 0),
(42, 7, 2, 17, 100, 0),
(43, 7, 1, 10, 50, 0),
(44, 3, 1, 10, 80, 0),
(45, 2, 1, 18, 5, 0),
(46, 3, 1, 18, 80, 0),
(47, 3, 1, 15, 80, 0),
(48, 3, 3, 18, 240, 0),
(49, 3, 2, 19, 160, 0),
(50, 1, 1, 15, 33, 0),
(51, 1, 1, 19, 33, 0),
(52, 1, 1, 20, 33, 0),
(53, 2, 1, 20, 5, 0),
(54, 2, 1, 20, 5, 0),
(55, 2, 1, 20, 5, 0),
(56, 2, 9, 19, 45, 0),
(57, 3, 2, 15, 160, 0),
(58, 5, 3, 15, 30, 0),
(59, 3, 3, 20, 240, 0),
(60, 8, 2, 20, 22, 0),
(61, 8, 4, 20, 44, 0),
(62, 9, 2, 19, 800, 0),
(63, 2, 1, 20, 5, 0),
(64, 2, 2, 20, 10, 0),
(65, 5, 1, 20, 10, 0),
(66, 4, 1, 21, 6, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesa`
--

CREATE TABLE `mesa` (
  `idMesa` int(11) NOT NULL,
  `capacidad` int(11) NOT NULL,
  `estadoMesa` int(11) NOT NULL,
  `numeroMesa` int(11) NOT NULL,
  `baja` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mesa`
--

INSERT INTO `mesa` (`idMesa`, `capacidad`, `estadoMesa`, `numeroMesa`, `baja`) VALUES
(1, 2, 1, 0, 1),
(2, 2, 1, 0, 1),
(3, 4, 1, 0, 1),
(4, 6, 1, 0, 1),
(5, 8, 1, 0, 1),
(6, 8, 1, 0, 1),
(8, 15, 2, 0, 1),
(11, 60, 1, 0, 1),
(15, 6, 1, 0, 1),
(17, 2, 2, 0, 1),
(20, 7, 1, 0, 1),
(21, 3, 1, 0, 1),
(22, 20, 1, 0, 1),
(23, 2, 1, 0, 1),
(24, 2, 1, 0, 1),
(29, 3, 1, 1, 1),
(30, 8, 1, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesero`
--

CREATE TABLE `mesero` (
  `idMesero` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(60) NOT NULL,
  `baja` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mesero`
--

INSERT INTO `mesero` (`idMesero`, `dni`, `nombre`, `apellido`, `baja`) VALUES
(6, 11111111, 'Ana', 'Lopez', 0),
(7, 22222222, 'Pedro', 'Garcia', 0),
(8, 33333333, 'Juan', 'Llopis', 0),
(9, 44444444, 'Maria', 'Perez', 0),
(10, 55555555, 'Laura', 'Olano', 0),
(11, 28383352, 'Gaby', 'Sastre', 0),
(12, 48484848, 'PATRICIO', 'LOPEZ', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `idPedido` int(11) NOT NULL,
  `idMesa` int(11) NOT NULL,
  `fechaYhoraPedido` datetime NOT NULL,
  `idMesero` int(11) NOT NULL,
  `cobrada` tinyint(1) NOT NULL,
  `baja` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`idPedido`, `idMesa`, `fechaYhoraPedido`, `idMesero`, `cobrada`, `baja`) VALUES
(1, 2, '2024-11-08 00:00:00', 11, 1, 0),
(2, 3, '2024-11-09 00:00:00', 7, 1, 0),
(3, 4, '2024-11-09 00:00:00', 7, 1, 0),
(4, 4, '2024-11-09 00:00:00', 7, 1, 0),
(5, 2, '2024-11-10 00:00:00', 11, 1, 0),
(6, 3, '2024-11-10 00:00:00', 10, 1, 0),
(7, 4, '2024-11-10 00:00:00', 8, 1, 0),
(8, 4, '2024-11-10 00:00:00', 8, 1, 0),
(9, 4, '2024-11-10 00:00:00', 7, 1, 0),
(10, 3, '2024-11-11 00:00:00', 7, 1, 0),
(11, 2, '2024-11-11 00:00:00', 6, 1, 0),
(12, 2, '2024-11-11 00:00:00', 7, 1, 0),
(13, 3, '2024-11-11 00:00:00', 7, 1, 0),
(14, 15, '2024-11-11 00:00:00', 10, 1, 0),
(15, 22, '2024-11-11 20:05:17', 11, 1, 0),
(16, 22, '2024-11-13 09:47:49', 9, 1, 0),
(17, 2, '2024-11-13 13:29:58', 9, 1, 0),
(18, 6, '2024-11-13 13:44:02', 7, 1, 0),
(19, 4, '2024-11-13 13:50:20', 7, 0, 0),
(20, 4, '2024-11-13 15:38:03', 8, 0, 0),
(21, 5, '2024-11-13 16:17:44', 7, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombreProducto` varchar(100) NOT NULL,
  `descripcion` varchar(60) NOT NULL,
  `precio` double NOT NULL,
  `categoria` varchar(60) NOT NULL,
  `stock` int(11) NOT NULL,
  `baja` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombreProducto`, `descripcion`, `precio`, `categoria`, `stock`, `baja`) VALUES
(1, 'COCA', 'DE LITRO', 2500, 'bebidas', 50, 0),
(2, 'AGUA', 'DE MEDIO', 1900, 'bebidas', 40, 0),
(3, 'CERVEZA', 'LATITA', 2300, 'bebidas', 40, 0),
(4, 'ALFAJOR', 'CHOCOLATE', 1500, 'postre', 30, 0),
(5, 'HELADO', 'FRUTILLA', 7500, 'portre', 20, 0),
(6, 'SOPA', 'DE VERDURAS', 3000, 'comidas', 19, 0),
(7, 'SPRITE', 'X 500ML', 1800, 'bebidas', 50, 0),
(8, 'GATORADE', 'X500ML', 2200, 'Bebida', 44, 0),
(9, 'HELADO', 'BOMBON SUIZO', 2600, 'Postre', 22, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `id_reserva` int(11) NOT NULL,
  `id_mesa` int(11) NOT NULL,
  `nombre_cliente` varchar(100) NOT NULL,
  `fecha_reserva` datetime NOT NULL,
  `numero_personas` int(11) NOT NULL,
  `estado` int(11) NOT NULL,
  `baja` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `detalle`
--
ALTER TABLE `detalle`
  ADD PRIMARY KEY (`idDetalle`),
  ADD KEY `idProducto` (`idProducto`),
  ADD KEY `idPedido` (`idPedido`);

--
-- Indices de la tabla `mesa`
--
ALTER TABLE `mesa`
  ADD PRIMARY KEY (`idMesa`);

--
-- Indices de la tabla `mesero`
--
ALTER TABLE `mesero`
  ADD PRIMARY KEY (`idMesero`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idPedido`),
  ADD KEY `id_mesero` (`idMesero`),
  ADD KEY `id_mesa` (`idMesa`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`id_reserva`),
  ADD KEY `id_mesa` (`id_mesa`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `detalle`
--
ALTER TABLE `detalle`
  MODIFY `idDetalle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=67;

--
-- AUTO_INCREMENT de la tabla `mesa`
--
ALTER TABLE `mesa`
  MODIFY `idMesa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT de la tabla `mesero`
--
ALTER TABLE `mesero`
  MODIFY `idMesero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idPedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `id_reserva` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle`
--
ALTER TABLE `detalle`
  ADD CONSTRAINT `detalle_ibfk_1` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`),
  ADD CONSTRAINT `detalle_ibfk_2` FOREIGN KEY (`idPedido`) REFERENCES `pedido` (`idPedido`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`idMesero`) REFERENCES `mesero` (`idMesero`),
  ADD CONSTRAINT `pedido_ibfk_3` FOREIGN KEY (`idMesa`) REFERENCES `mesa` (`idMesa`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`id_mesa`) REFERENCES `mesa` (`idMesa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
