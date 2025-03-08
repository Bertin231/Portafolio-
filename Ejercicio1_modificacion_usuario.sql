--DDL-->Lenguajes para definir y modificar la estructura de los objetos en las bases de datos --> CREATE,UPDATE,ALTER Y DROP
--DML-->Lenguaje de manipulacion de datos --> SELECT, INSERT, UPADATE Y DELETE
--DCL-->Lenguaje de control de datos --> GRANT, REOVOKE

--MODIFICAR LA SESION ACTUAL PARA LA EJECUCION DE SCRIPTS
ALTER SESSION SET "_ORACLE_SCRIPT" = TRUE;

--CREACION DE UN NUEVO USUARIO Y SU CONTRASEÑA
CREATE USER ENUCOM IDENTIFIED BY CURSO2025;

--OTORGAR TODOS LOS PRIVILEGIOS
GRANT ALL PRIVILEGES TO ENUCOM;

--
