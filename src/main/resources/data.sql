--Grado
INSERT INTO grado (nombre, total_creditos_maximo, total_creditos_minimo) Values ('Bachillerato', 130, 100);
SET @grado_id =  LAST_INSERT_ID();