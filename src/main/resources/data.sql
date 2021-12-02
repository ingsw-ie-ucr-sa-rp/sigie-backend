#Grado
INSERT INTO grado (nombre, total_creditos_maximo, total_creditos_minimo) Values ('Bachillerato', 130, 100);
SET @grado_id =  LAST_INSERT_ID();

#Unidad_Academica
INSERT INTO unidad_academica (nombre) VALUES ('Escuela de Administración Educativa'), ('Escuela de Orientación y Educación Especial'), ('Escuela de Formación Docente'),('Escuela de Bibliotecología y Ciencias de la Información'), ('Escuela de Educación Física y Deportes'),('Instituto de Investigación y Educación');
SET @unidad_academica_id_ae =  (SELECT  unidad_academica_id FROM unidad_academica WHERE nombre='Escuela de Administración Educativa');
SET @unidad_academica_id_oee =  (SELECT  unidad_academica_id FROM unidad_academica WHERE nombre='Escuela de Orientación y Educación Especial');
SET @unidad_academica_id_fd =  (SELECT  unidad_academica_id FROM unidad_academica WHERE nombre='Escuela de Formación Docente');
SET @unidad_academica_id_bci =  (SELECT  unidad_academica_id FROM unidad_academica WHERE nombre='Escuela de Bibliotecología y Ciencias de la Información');
SET @unidad_academica_id_efd =  (SELECT  unidad_academica_id FROM unidad_academica WHERE nombre='Escuela de Educación Física y Deportes');
SET @unidad_academica_id_ie =  (SELECT  unidad_academica_id FROM unidad_academica WHERE nombre='Instituto de Investigación y Educación');

#Area
INSERT INTO area_disciplinaria (nombre) VALUES('Computación en Informática'), ('Administración'),('Humanística y social'),('Matemática'),('Otro');
SET @area_id_ci =  (SELECT  area_id FROM area WHERE nombre='Computación en Informática');
SET @area_id_a =  (SELECT  area_id FROM area WHERE nombre='Administración');
SET @area_id_hs =  (SELECT  area_id FROM area WHERE nombre='Humanística y social');
SET @area_id_m =  (SELECT  area_id FROM area WHERE nombre='Matemática');
SET @area_id_o =  (SELECT  area_id FROM area WHERE nombre='Otro');

#Plan de Estudios
INSERT INTO plan_estudio (anno_aprobacion, cantidad_ciclos, codigo_carrera, duracion_en_annos, nombre_carrera, id_item_perfil_entrada, id_item_perfil_salida, id_grado, id_unidad_academica, id_enfasis) VALUES(2020, 8, '600002',4 ,'Informática Empresarial', 'Presencial', 1, 1, 'Perfil entrada', 'Perfil Salida');
SET @plan_estudio_id_ie =  (SELECT plan_estudio_id FROM plan_estudio WHERE codigo_carrera='600002');

#Curso
INSERT INTO curso(ano_en_que_se_imparte,ciclo, creditos, electivo, horas_laboratorio, horas_practica, horas_teoria, horas_teoricas_practicas, pertenece_multiples_unidades, posicion_ciclo, nombre, sigla, area_id, modalidad_curso_id, unidad_academica_id, plan_estudio_id, carta_estudiante) VALUES (1, 1, 2, 0, 0, 0, 3, 0, 1, 1,  'Curso de Arte',  'EG-', @area_id_hs, @modalidad_curso_id_virtual, @unidad_academica_id_ie, @plan_estudio_id_ie, 'Carta 1'), (1, 1, 6, 0, 0, 0, 8, 0, 1, 1, 'Curso Integrado de Humanidades I',  'EG-I', @area_id_hs, @modalidad_curso_id_virtual, @unidad_academica_id_ie, @plan_estudio_id_ie, 'Carta 2');
