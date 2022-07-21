
--Grado
INSERT INTO grado (nombre, total_creditos_maximo, total_creditos_minimo) Values ('Bachillerato 3', 8, 2);
SET @grado_id =  LAST_INSERT_ID();

--Modalidad
INSERT INTO modalidad (tipo_modalidad) Values ('Virtual');
SET @modalidad_id = LAST_INSERT_ID();

INSERT INTO modalidad (tipo_modalidad) Values ('Presencial');
SET @modalidad_id = LAST_INSERT_ID();

INSERT INTO modalidad (tipo_modalidad) Values ('Hibrido');
SET @modalidad_id = LAST_INSERT_ID();

--Area Disciplinaria
INSERT INTO area_disciplinaria (nombre) Values ('Disciplina 3');
SET @area_disciplinaria_id = LAST_INSERT_ID();

INSERT INTO area_disciplinaria (nombre) Values ('Disciplina 4');
SET @area_disciplinaria_id = LAST_INSERT_ID();

INSERT INTO area_disciplinaria (nombre) Values ('Disciplina 5');
SET @area_disciplinaria_id = LAST_INSERT_ID();

--Plan de Estudio
INSERT INTO plan_estudio (ano_aprobacion, cantidad_ciclos, codigo_carrera, duracion_anos, nombre_carrera, id_grado) Values (2022, 3, 6000002, 4, 'Informática', 1);
SET @plan_estudio_id = LAST_INSERT_ID();

INSERT INTO plan_estudio (ano_aprobacion, cantidad_ciclos, codigo_carrera, duracion_anos, nombre_carrera, id_grado) Values (2022, 3, 6000003, 4, 'Maestria', 1);
SET @plan_estudio_id = LAST_INSERT_ID();

--Curso
INSERT INTO curso (ciclo, creditos, electivo, horas_laboratorio, horas_practica, horas_teoria, horas_teorico_practica, nombre, objetivo_general, sigla, id_area_disciplinaria, id_modalidad, id_plan_estudio) Values ('I Ciclo', 4, 0, 0, 0, 4, 0, 'Cálculo diferencial e integral', 'Prueba', 'MA3021', 1, 1, 1);
SET @curso_id = LAST_INSERT_ID();

--Unidad Academica
INSERT INTO unidad_academica (nombre_unidad_academica) Values ('Unidad académica 1');
SET @unidad_academica_id = LAST_INSERT_ID();

INSERT INTO unidad_academica (nombre_unidad_academica) Values ('Unidad académica 2');
SET @unidad_academica_id = LAST_INSERT_ID();

INSERT INTO unidad_academica (nombre_unidad_academica) Values ('Unidad académica 3');
SET @unidad_academica_id = LAST_INSERT_ID();

--Enfasis
INSERT INTO enfasis (descripcion, id_plan_estudio) Values ('Enfasis en BD', 1);
SET @enfasis_id =  LAST_INSERT_ID();

INSERT INTO enfasis (descripcion, id_plan_estudio) Values ('Enfasis en IA', 1);
SET @enfasis_id =  LAST_INSERT_ID();

--Itemes Descripción
INSERT INTO item_descripcion (detalle_descripcion, orden_descripcion) Values ('Curso que damanda tiempo', 1);
SET @descripcion_id =  LAST_INSERT_ID();

INSERT INTO item_descripcion (detalle_descripcion, orden_descripcion) Values ('Un muy bonito curso', 2);
SET @descripcion_id =  LAST_INSERT_ID();

--Contenido
INSERT INTO contenido (orden_contenido, tema) Values (1, 'Listas enlazadas');
SET @contenido_id =  LAST_INSERT_ID();

INSERT INTO contenido (orden_contenido, tema) Values (2, 'Tema de algoritmos');
SET @contenido_id =  LAST_INSERT_ID();

INSERT INTO contenido (orden_contenido, tema) Values (3, 'Tema de SO');
SET @contenido_id =  LAST_INSERT_ID();

--Electivo
INSERT INTO curso (ciclo, creditos, electivo, horas_laboratorio, horas_practica, horas_teoria, horas_teorico_practica, nombre, objetivo_general, sigla, id_area_disciplinaria, id_modalidad, id_plan_estudio) Values ('I Ciclo', 4, 0, 0, 0, 4, 0, 'El curso electivo', 'Prueba 2', 'EL1345', 1, 1, 1);
SET @curso_id = LAST_INSERT_ID();

--Requisito
INSERT INTO curso (ciclo, creditos, electivo, horas_laboratorio, horas_practica, horas_teoria, horas_teorico_practica, nombre, objetivo_general, sigla, id_area_disciplinaria, id_modalidad, id_plan_estudio) Values ('I Ciclo', 4, 0, 0, 0, 4, 0, 'REQUISITO IF', 'Prueba 3', 'LM6363', 1, 1, 1);
SET @curso_id = LAST_INSERT_ID();

--Correquisito
INSERT INTO curso (ciclo, creditos, electivo, horas_laboratorio, horas_practica, horas_teoria, horas_teorico_practica, nombre, objetivo_general, sigla, id_area_disciplinaria, id_modalidad, id_plan_estudio) Values ('I Ciclo', 4, 0, 0, 0, 4, 0, 'Apoyo de requisito', 'Prueba 4', 'IF0173', 1, 1, 1);
SET @curso_id = LAST_INSERT_ID();

--Resultados aprendizaje
INSERT INTO resultados_aprendizaje(id_resultado_aprendizaje, sentencia_resultado) VALUES (1,'Aprender');
INSERT INTO resultados_aprendizaje(id_resultado_aprendizaje, sentencia_resultado) VALUES (2,'Programar');

--Referencias bibliograficas
INSERT INTO referencia_bibliografica (id_bibliografia, referencia) VALUES ('1', 'L&L');
INSERT INTO referencia_bibliografica (id_bibliografia, referencia) VALUES ('2', 'D&D');


