--Grado
INSERT INTO grado (nombre, total_creditos_maximo, total_creditos_minimo) Values ('Bachillerato', 130, 100);
SET @grado_id =  LAST_INSERT_ID();

--Area
INSERT INTO area_disciplinaria (nombre) VALUES('Computación en Informática'), ('Administración'),('Humanística y social'),('Matemática'),('Otro');
SET @area_id_hs =  LAST_INSERT_ID();

--Plan de Estudios
INSERT INTO plan_estudio (anno_aprobacion, cantidad_ciclos, codigo_carrera, duracion_annos, nombre_carrera, id_grado) VALUES(2020, 8, '600002',4 ,'Informática Empresarial', @grado_id);
SET @plan_estudio_id_ie =  LAST_INSERT_ID();

--Modalidad
INSERT INTO modalidad (tipo_modalidad) values ('Semestral');
SET @modalidad_ciclo_id = LAST_INSERT_ID();

--Curso
INSERT INTO curso(anno_en_que_se_imparte, ciclo, creditos, electivo, horas_laboratorio, horas_practica, horas_teoria, horas_teorica_practica, nombre, objetivo_general, posicion_ciclo, sigla, id_area_disciplinaria, id_modalidad, id_plan_estudio) VALUES (1, 2, 3, 0, 1, 1, 1, 1, 'Curso de Arte', 'Objetivo General', 1, 'EG-', @area_id_hs, @modalidad_ciclo_id, @plan_estudio_id_ie);
