
--Grado
INSERT INTO grado (nombre, total_creditos_maximo, total_creditos_minimo) Values ('Bachillerato 3', 8, 2);
SET @grado_id =  LAST_INSERT_ID();

--Modalidad
INSERT INTO modalidad (tipo_modalidad) Values ('Virtual');
SET @modalidad_id = LAST_INSERT_ID();

--Area Disciplinaria
INSERT INTO area_disciplinaria (nombre_disciplinaria) Values ('Disciplina 3');
SET @area_disciplinaria_id = LAST_INSERT_ID();

--Plan de estudio
INSERT INTO plan_estudio (ano_aprobacion, cantidad_ciclos, codigo_carrera, duracion_anos, nombre_carrera, id_grado) Values (2022, 3, 6000002, 4, 'Informática', 1);
SET @plan_estudio_id = LAST_INSERT_ID();

--Curso
INSERT INTO curso (ciclo, creditos, electivo, horas_laboratorio, horas_practica, horas_teoria, horas_teorico_practica, nombre, objetivo_general, sigla, id_area_disciplinaria, id_modalidad, id_plan_estudio) Values ('I Ciclo', 4, 0, 0, 0, 4, 0, 'Cálculo diferencial e integral', 'Prueba', 'MA3021', 1, 1, 1);
SET @curso_id = LAST_INSERT_ID();

--Resultados de aprendizaje
INSERT INTO resultados_aprendizaje (descripcion) Values ('Hablar de negocio');
SET @resultados_aprendizaje_id = LAST_INSERT_ID();

--Unidad academica
INSERT INTO unidad_academica (nombre_unidad_academica) Values ('Unidad académica agregada');
SET @unidad_academica_id = LAST_INSERT_ID();

--Enfasis
INSERT INTO enfasis (descripcion, id_plan_estudio) Values ('enfatizar en el enfasis', 1);
SET @enfasis_id =  LAST_INSERT_ID();

--Itemes descripcion
INSERT INTO item_descripcion (detalle_descripcion, orden_descripcion, id_curso) Values ('Item necesario para el proyecto', 1, 1);
SET @descripcion_id =  LAST_INSERT_ID();

--Contenido
INSERT INTO contenido (orden_contenido, tema, id_curso) Values (1, 'Listas enlazadas', 1);
SET @contenido_id =  LAST_INSERT_ID();

--electivo
INSERT INTO curso (ciclo, creditos, electivo, horas_laboratorio, horas_practica, horas_teoria, horas_teorico_practica, nombre, objetivo_general, sigla, id_area_disciplinaria, id_modalidad, id_plan_estudio) Values ('I Ciclo', 4, 0, 0, 0, 4, 0, 'El curso electivo', 'Prueba 2', 'EL1345', 1, 1, 1);
SET @curso_id = LAST_INSERT_ID();

--requisito
INSERT INTO curso (ciclo, creditos, electivo, horas_laboratorio, horas_practica, horas_teoria, horas_teorico_practica, nombre, objetivo_general, sigla, id_area_disciplinaria, id_modalidad, id_plan_estudio) Values ('I Ciclo', 4, 0, 0, 0, 4, 0, 'REQUISITO IF', 'Prueba 3', 'LM6363', 1, 1, 1);
SET @curso_id = LAST_INSERT_ID();

--correquisito
INSERT INTO curso (ciclo, creditos, electivo, horas_laboratorio, horas_practica, horas_teoria, horas_teorico_practica, nombre, objetivo_general, sigla, id_area_disciplinaria, id_modalidad, id_plan_estudio) Values ('I Ciclo', 4, 0, 0, 0, 4, 0, 'Apoyo de requisito', 'Prueba 4', 'IF0173', 1, 1, 1);
SET @curso_id = LAST_INSERT_ID();

