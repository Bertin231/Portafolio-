CREATE TABLE PROPIEDAD(
ID_PROPIEDAD NUMBER,
TIPO NVARCHAR2(100),
UBICACION NVARCHAR2(200),
TAMAÑO NUMBER,
PRECIO NUMBER, 
ESTADO NVARCHAR2(100),
AÑO_CONSTRUCCION NUMBER,
DUEÑO NVARCHAR2(100),
NUM_HABITACIONES NUMBER,
DISPONIBLE NVARCHAR2(3) ,--(SI)O(NO)
CONSTRAINT PROPIEDAD_PK PRIMARY KEY (ID_PROPIEDAD)
);

INSERT INTO PROPIEDAD VALUES(1, 'CASA', 'CDMX', 150, 2500000, 'NUEVA', 2015, 'JUAN PEREZ', 3, 'SI');
INSERT INTO PROPIEDAD VALUES(2, 'DEPARTAMENTO', 'GUADALAJARA', 80, 1800000, 'USADA', 2010, 'MARIA LOPEZ', 2, 'SI');
INSERT INTO PROPIEDAD VALUES(3, 'CASA', 'MONTERREY', 200, 3200000, 'NUEVA', 2020, 'CARLOS RAMOS', 4, 'NO');
INSERT INTO PROPIEDAD VALUES(4, 'TERRENO', 'PUEBLA', 300, 900000, 'DISPONIBLE', 2005, 'ANA MARTINEZ', NULL, 'SI');
INSERT INTO PROPIEDAD VALUES(5, 'DEPARTAMENTO', 'CDMX', 90, 1500000, 'RENOVADA', 2018, 'PEDRO GOMEZ', 2, 'NO');
INSERT INTO PROPIEDAD VALUES(6, 'CASA', 'GUADALAJARA', 250, 4500000, 'LUJOSA', 2000, 'LUIS FERNANDEZ', 5, 'SI');
INSERT INTO PROPIEDAD VALUES(7, 'TERRENO', 'MONTERREY', 500, 1200000, 'DISPONIBLE', 1995, 'CAROLINA DIAZ', NULL, 'SI');
INSERT INTO PROPIEDAD VALUES(8, 'DEPARTAMENTO', 'PUEBLA', 70, 1300000, 'USADA', 2012, 'FERNANDO MORA', 1, 'NO');
INSERT INTO PROPIEDAD VALUES(9, 'CASA', 'CDMX', 180, 2900000, 'NUEVA', 2017, 'ALICIA REYES', 3, 'SI');
COMMIT;

SELECT * FROM PROPIEDAD;



--1. Mostrar las propiedades agrupadas por tipo, contando cuántas hay de cada tipo y el precio promedio de cada categoría.
SELECT TIPO, 
       COUNT(*) AS NUM_PROPIEDADES, 
       AVG(PRECIO) AS PRECIO_PROMEDIO
FROM PROPIEDAD
GROUP BY TIPO;

--2. Obtener el precio promedio de las propiedades disponibles y no disponibles, identificando si están en venta o no.
SELECT DISPONIBLE, 
       AVG(PRECIO) AS PRECIO_PROMEDIO
FROM PROPIEDAD
GROUP BY DISPONIBLE;

--3. Mostrar el precio más alto y más bajo de las propiedades disponibles, junto con la ubicación de la propiedad correspondiente.
SELECT UBICACION, PRECIO
FROM PROPIEDAD
WHERE DISPONIBLE = 'SI'
ORDER BY PRECIO DESC
FETCH FIRST 1 ROWS ONLY;  -- Para el precio más alto

SELECT UBICACION, PRECIO
FROM PROPIEDAD
WHERE DISPONIBLE = 'SI'
ORDER BY PRECIO ASC
FETCH FIRST 1 ROWS ONLY;  -- Para el precio más bajo

--4. Listar las propiedades que tengan más de 3 habitaciones, mostrando el número de habitaciones en un formato como "4 habitaciones".
SELECT UBICACION, TIPO, NUM_HABITACIONES || ' habitaciones' AS HABITACIONES
FROM PROPIEDAD
WHERE NUM_HABITACIONES > 3;

--5. Calcular el porcentaje de propiedades que están disponibles y no disponibles, en relación con el total de registros.
SELECT DISPONIBLE, 
       (COUNT(*) * 100) / (SELECT COUNT(*) FROM PROPIEDAD) AS PORCENTAJE
FROM PROPIEDAD
GROUP BY DISPONIBLE;

--6. Obtener la diferencia de precio entre la propiedad más cara y la más barata, y mostrar el resultado en un formato como "DIFERENCIA: $2,000,000.00".
SELECT 'DIFERENCIA: $' || TO_CHAR(MAX(PRECIO) - MIN(PRECIO), '999,999,999.00') AS DIFERENCIA
FROM PROPIEDAD;

--7. Identificar cuántas propiedades fueron construidas en cada década, mostrando un resultado como: "DÉCADA 1990: 2 propiedades".
SELECT 'DÉCADA ' || (FLOOR(AÑO_CONSTRUCCION / 10) * 10) AS DECADE, 
       COUNT(*) AS NUM_PROP
FROM PROPIEDAD
GROUP BY FLOOR(AÑO_CONSTRUCCION / 10) * 10
ORDER BY DECADE;

--8. Listar las propiedades cuyo precio sea mayor al promedio de todas las propiedades, junto con su diferencia respecto al promedio.
SELECT TIPO, UBICACION, PRECIO, 
       PRECIO - (SELECT AVG(PRECIO) FROM PROPIEDAD) AS DIFERENCIA
FROM PROPIEDAD
WHERE PRECIO > (SELECT AVG(PRECIO) FROM PROPIEDAD);

--9. Mostrar las propiedades donde el nombre del dueño tenga más de 12 caracteres, indicando la cantidad de caracteres en una nueva columna.
SELECT TIPO, UBICACION, DUEÑO, LENGTH(DUEÑO) AS LONGITUD_NOMBRE
FROM PROPIEDAD
WHERE LENGTH(DUEÑO) > 12;

--10. Obtener la relación entre tamaño y precio, calculando el precio por metro cuadrado de cada propiedad y ordenando los resultados de mayor a menor.
SELECT TIPO, UBICACION, PRECIO, TAMAÑO, 
       PRECIO / TAMAÑO AS PRECIO_POR_M2
FROM PROPIEDAD
ORDER BY PRECIO_POR_M2 DESC;


