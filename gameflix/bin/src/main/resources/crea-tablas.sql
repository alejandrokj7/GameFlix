CREATE TABLE `test`.`usuarios` 
( `nombre_usuario` VARCHAR(255) NOT NULL 
, `contrasena` VARCHAR(255) NOT NULL 
, `nombre` VARCHAR(255) DEFAULT NULL 
, `apellidos` VARCHAR(255) DEFAULT NULL 
, `correo` VARCHAR(255) DEFAULT NULL 
, `fecha` VARCHAR(255) DEFAULT NULL  
, `pais` VARCHAR(255) DEFAULT NULL  
, `residencia` VARCHAR(255) DEFAULT NULL  
, `perfil` VARCHAR(255) DEFAULT NULL 
, `bloqueado` INT(11) DEFAULT NULL 
, PRIMARY KEY (`Nombre_Usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE `test`.`juegos` 
( `nombre` VARCHAR(255) NOT NULL 
, `version` VARCHAR(255) DEFAULT NULL 
, `anio` INT(11) DEFAULT NULL 
, `estudio` VARCHAR(255) DEFAULT NULL 
, `nacionalidad` VARCHAR(255) DEFAULT NULL  
, `edadmin` INT(11) DEFAULT NULL 
, `descripcion` VARCHAR(255) DEFAULT NULL 
, `enlaceVideo` VARCHAR(255) DEFAULT NULL 
, PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;




CREATE TABLE `test`.`partidas` 
( `id` INT(11) NOT NULL AUTO_INCREMENT
, `usuario` VARCHAR(255) DEFAULT NULL 
, `juego` VARCHAR(255) DEFAULT NULL 
, `fecha` VARCHAR(255) DEFAULT NULL 
, `hora` VARCHAR(255) DEFAULT NULL  
, PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



CREATE TABLE `test`.`conexiones` 
( `Id_Conexion` INT(11) NOT NULL AUTO_INCREMENT
, `Fecha` VARCHAR(255) DEFAULT NULL 
, `Hora` VARCHAR(255) DEFAULT NULL 
, `IP` VARCHAR(255) DEFAULT NULL  
, `Usuario` VARCHAR(255) DEFAULT NULL 
, `Resultado` VARCHAR(255) DEFAULT NULL 
, PRIMARY KEY (`Id_Conexion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE `director` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `apellidos` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE `pelicula` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `anio` int(11) NOT NULL,
  `imdb` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `director_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`director_id`) REFERENCES `director` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


insert into director(id,nombre,apellidos) values (1,'Francis Ford','Coppola'),
  (2,'James','Cameron');

insert into pelicula(anio,imdb,titulo,director_id) values ('1972','http://www.imdb.com/title/tt0068646/','El Padrino',1),
  ('1974','http://www.imdb.com/title/tt0071562/','El Padrino: parte II',1),
  ('1990','http://www.imdb.com/title/tt0099674/','El Padrino: parte III',1),
  ('2009','http://www.imdb.com/title/tt0499549/','Avatar',2);


