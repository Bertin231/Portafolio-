--LOS CURSORES SON HERRAMIENTAS PARA REALIZAR OPERACIONES SOBRE RESULTADOS DE MANERA SECUENCIAL 
SELECT * FROM LIBRO;

CREATE OR REPLACE PROCEDURE PR_DETALLE_LIBRO
IS 
  CURSOR LIBRO_INFO IS 
          SELECT NOMBRE,
          (
          CASE GENERO
              WHEN 1 THEN 'DRAMA'
              WHEN 2 THEN 'TERROR'
              WHEN 3 THEN 'CIENCIA FICCION'
              WHEN 4 THEN 'NOVELA'
              WHEN 5 THEN 'THRILLER'
              WHEN 6 THEN 'COMEDIA'
              ELSE 'SIN GENERO'
              END
          )AS GENERO, PRECIO FROM LIBRO;
          
          --VARIABLES LOCALES 
          LV_NOMBRE LIBRO.NOMBRE%TYPE;
          LV_GENERO NVARCHAR2(100);
          LV_PRECIO NUMBER;
          BEGIN
          OPEN LIBRO_INFO;
          
          --RECUPERAR EL CURSOR Y MOSTRAR LOS DATOS
          LOOP
          
          FETCH LIBRO_INFO INTO LV_NOMBRE,LV_GENERO,LV_PRECIO;
          
          EXIT WHEN LIBRO_INFO%NOTFOUND;
          
          DBMS_OUTPUT.PUT_LINE('NOMBRE DEL LIBRO:' ||LV_NOMBRE||', GENERO'||LV_GENERO||', PRECIO'||LV_PRECIO);
          END LOOP;
          
          CLOSE LIBRO_INFO;
          END PR_DETALLE_LIBRO;
          /
          BEGIN 
              PR_DETALLE_LIBRO;
          END;
          /
          