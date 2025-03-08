SELECT * FROM JUEGOS;

CREATE OR REPLACE PROCEDURE PK_DETALLE_JUEGOS
IS 
    CURSOR JUEGOS_INFO IS
        SELECT NOMBRE,
            (CASE CONSOLA 
                WHEN 1 THEN 'PLAY STATION'
                WHEN 2 THEN 'XBOX'
                WHEN 3 THEN 'NINTENDO'
                WHEN 4 THEN 'SEGA'
                WHEN 5 THEN 'GAME BOY'
                ELSE 'CONSOLA NO REGISTRADA'
            END) AS CONSOLA,
            GENERO, PRECIO, COLOR, FORMATO
        FROM JUEGOS;
    
    LV_NOMBRE JUEGOS.NOMBRE%TYPE;
    LV_CONSOLA NVARCHAR2(100); 
    LV_GENERO NVARCHAR2(100);
    LV_PRECIO NUMBER;
    LV_COLOR NVARCHAR2(100);
    LV_FORMATO NVARCHAR2(100);
    
BEGIN
    OPEN JUEGOS_INFO;
    
    LOOP
        FETCH JUEGOS_INFO INTO LV_NOMBRE, LV_CONSOLA, LV_GENERO, LV_PRECIO, LV_COLOR, LV_FORMATO;
        
        EXIT WHEN JUEGOS_INFO%NOTFOUND;
        
        DBMS_OUTPUT.PUT_LINE('NOMBRE DEL JUEGO: ' || LV_NOMBRE || ', CONSOLA: ' || LV_CONSOLA || ', GENERO: ' || LV_GENERO || ', PRECIO: ' || LV_PRECIO || ', COLOR: ' || LV_COLOR || ', FORMATO: ' || LV_FORMATO);
    END LOOP;
    
    CLOSE JUEGOS_INFO;
END PK_DETALLE_JUEGOS;
/
BEGIN
    PK_DETALLE_JUEGOS;
END;
/