SELECT * FROM EQUIPOS;
SELECT * FROM PARTIDOS;
SELECT * FROM ESTADISTICAS;
SELECT * FROM JUGADORES;

--1.	Mostrar el nombre de todos los jugadores ordenados alfabéticamente. (Debe devolver 432 registros.)
SELECT 
CODIGO,
NOMBRE
FROM JUGADORES 
ORDER BY 
NOMBRE ASC;

--2.	Mostrar el nombre de todos los equipos ordenados alfabéticamente.
SELECT 
NOMBRE
FROM EQUIPOS 
ORDER BY 
NOMBRE ASC;

--3.	Mostrar el nombre de los equipos del este
SELECT
NOMBRE,
CONFERENCIA
FROM EQUIPOS
WHERE CONFERENCIA LIKE '%East%';

--4.	Mostrar los equipos donde su ciudad empieza por c.
SELECT 
NOMBRE,
CIUDAD
FROM EQUIPOS
WHERE CIUDAD LIKE 'C%';

--5.	Mostrar todos los jugadores y su equipo ordenado por nombre del equipo. (Debe devolver 432 registros)
SELECT 
J.NOMBRE,
E.NOMBRE 
FROM JUGADORES J
FULL JOIN EQUIPOS E
ON J.NOMBRE_EQUIPO = E.NOMBRE
ORDER BY 
E.NOMBRE ASC;

--6.	Mostrar todos los jugadores del equipo «Raptors».
SELECT 
J.NOMBRE,
E.NOMBRE
FROM JUGADORES J
FULL JOIN EQUIPOS E 
ON J.NOMBRE_EQUIPO = E.NOMBRE
WHERE E.NOMBRE LIKE '%Raptors%';

--7.	Mostrar los puntos por partido de ‘Pau Gasol’.
SELECT 
J.NOMBRE,
E.PUNTOS_POR_PARTIDO
FROM JUGADORES J 
LEFT JOIN ESTADISTICAS E 
ON E.JUGADOR = J.CODIGO
WHERE J.NOMBRE LIKE '%Pau Gasol%';

--8.	Mostrar los puntos por partido de ‘Pau Gasol’ en la temporada ’04/05′.
SELECT 
  J.NOMBRE,
  E.PUNTOS_POR_PARTIDO
FROM JUGADORES J 
LEFT JOIN ESTADISTICAS E 
  ON E.JUGADOR = J.CODIGO AND E.TEMPORADA = '04/05'
WHERE J.NOMBRE LIKE '%Pau Gasol%';

--9.	Mostrar el número de puntos de cada jugador en toda su carrera. (Debe devolver 424 registros.)
SELECT 
    J.NOMBRE,
    SUM(E.PUNTOS_POR_PARTIDO) AS PUNTOS_TOTALES
FROM 
    JUGADORES J 
INNER JOIN 
    ESTADISTICAS E 
ON 
    E.JUGADOR = J.CODIGO
GROUP BY 
    J.NOMBRE;
    
--10.	Mostrar el número de jugadores de cada equipo.
SELECT 
E.NOMBRE,
COUNT(J.CODIGO)AS TOTAL_JUAGADORES
FROM JUGADORES J
INNER JOIN EQUIPOS E 
ON J.NOMBRE_EQUIPO = E.NOMBRE
GROUP BY 
E.NOMBRE;

--11.	Mostrar el jugador que más puntos ha realizado en toda su carrera.
SELECT 
    J.NOMBRE,
    SUM(E.PUNTOS_POR_PARTIDO) AS PUNTOS_TOTALES
FROM 
    JUGADORES J
INNER JOIN 
    ESTADISTICAS E 
ON 
    E.JUGADOR = J.CODIGO
GROUP BY 
    J.NOMBRE
HAVING 
    SUM(E.PUNTOS_POR_PARTIDO) = (
        SELECT MAX(TOTAL_PUNTOS)
        FROM (
            SELECT 
                SUM(E2.PUNTOS_POR_PARTIDO) AS TOTAL_PUNTOS
            FROM 
                ESTADISTICAS E2
            INNER JOIN 
                JUGADORES J2 ON E2.JUGADOR = J2.CODIGO
            GROUP BY 
                J2.NOMBRE
        )
    );
    
--12.	Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
SELECT 
    E.NOMBRE AS NOMBRE_EQUIPO,
    E.CONFERENCIA,
    E.DIVISION
FROM 
    JUGADORES J
INNER JOIN 
    EQUIPOS E 
ON 
    J.NOMBRE_EQUIPO = E.NOMBRE
WHERE 
    J.ALTURA = (SELECT MAX(A1.ALTURA)
                FROM JUGADORES A1);
                
--13.	Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos. (CREAR UNA VIEW)
CREATE VIEW PARTIDO_CON_MAYOR_DIFERENCIA AS
SELECT 
    EQUIPO_LOCAL,
    EQUIPO_VISITANTE,
    ABS(PUNTOS_LOCAL - PUNTOS_VISITANTE) AS DIFERENCIA
FROM 
    PARTIDOS
WHERE 
    ABS(PUNTOS_LOCAL - PUNTOS_VISITANTE) = (
        SELECT MAX(ABS(PUNTOS_LOCAL - PUNTOS_VISITANTE))
        FROM PARTIDOS
);

SELECT * FROM PARTIDO_CON_MAYOR_DIFERENCIA;

--14.	Mostrar la media de puntos en partidos de los equipos de la división Pacific. (CREAR UNA VIEW)
CREATE VIEW MEDIA_PUNTOS_PACIFIC_DIVISION AS
SELECT 
    E.NOMBRE AS NOMBRE_EQUIPO,
    AVG(P.PUNTOS_LOCAL) AS MEDIA_PUNTOS_LOCAL,
    AVG(P.PUNTOS_VISITANTE) AS MEDIA_PUNTOS_VISITANTE
FROM 
    PARTIDOS P
INNER JOIN 
    EQUIPOS E 
ON 
    P.EQUIPO_LOCAL = E.NOMBRE OR P.EQUIPO_VISITANTE = E.NOMBRE
WHERE 
    E.DIVISION = 'Pacific'
GROUP BY 
    E.NOMBRE;
    
SELECT * FROM MEDIA_PUNTOS_PACIFIC_DIVISION;

--15.	Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante. Usa una vista (CREAR UNA VIEW)
CREATE VIEW PUNTOS_CADA_EQUIPO AS
SELECT 
    E.NOMBRE AS NOMBRE_EQUIPO,
    P.CODIGO,
    P.EQUIPO_LOCAL,
    P.PUNTOS_LOCAL,
    P.EQUIPO_VISITANTE,
    P.PUNTOS_VISITANTE
FROM 
    PARTIDOS P
INNER JOIN 
    EQUIPOS E 
ON 
    P.EQUIPO_LOCAL = E.NOMBRE OR P.EQUIPO_VISITANTE = E.NOMBRE;

SELECT * FROM PUNTOS_CADA_EQUIPO;