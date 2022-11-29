
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
INSERT INTO plan_estudio (ano_aprobacion, cantidad_ciclos, codigo_carrera, duracion_anos, nombre_carrera, imagenes_relacionadas ,id_grado) Values (2022, 3, 6000002, 4, 'Informática',0, 1);
SET @plan_estudio_id = LAST_INSERT_ID();

INSERT INTO plan_estudio (ano_aprobacion, cantidad_ciclos, codigo_carrera, duracion_anos, nombre_carrera,imagenes_relacionadas, id_grado) Values (2022, 3, 6000003, 4, 'Maestria',0, 1);
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
INSERT INTO item_descripcion (detalle_descripcion, orden_descripcion, id_curso) Values ('Curso que damanda tiempo', 1, 1);
SET @descripcion_id =  LAST_INSERT_ID();

INSERT INTO item_descripcion (detalle_descripcion, orden_descripcion, id_curso) Values ('Un muy bonito curso', 1, 1);
SET @descripcion_id =  LAST_INSERT_ID();

--Contenido
INSERT INTO contenido (orden_contenido, tema, id_curso)
Values (1, 'Listas enlazadas', 1);
SET @contenido_id =  LAST_INSERT_ID();

INSERT INTO contenido (orden_contenido, tema, id_curso)
Values (1, 'Tema de algoritmos', 1);
SET @contenido_id =  LAST_INSERT_ID();

INSERT INTO contenido (orden_contenido, tema, id_curso)
Values (1, 'Tema de SO', 1);
SET @contenido_id =  LAST_INSERT_ID();

--Electivo
INSERT INTO curso (ciclo, creditos, electivo, horas_laboratorio, horas_practica, horas_teoria, horas_teorico_practica, nombre, objetivo_general, sigla, id_area_disciplinaria, id_modalidad, id_plan_estudio)
Values ('I Ciclo', 4, 0, 0, 0, 4, 0, 'El curso electivo', 'Prueba 2', 'EL1345', 1, 1, 1);
SET @curso_id = LAST_INSERT_ID();

--Requisito
INSERT INTO curso (ciclo, creditos, electivo, horas_laboratorio, horas_practica, horas_teoria, horas_teorico_practica, nombre, objetivo_general, sigla, id_area_disciplinaria, id_modalidad, id_plan_estudio)
Values ('I Ciclo', 4, 0, 0, 0, 4, 0, 'REQUISITO IF', 'Prueba 3', 'LM6363', 1, 1, 1);
SET @curso_id = LAST_INSERT_ID();

--Correquisito
INSERT INTO curso (ciclo, creditos, electivo, horas_laboratorio, horas_practica, horas_teoria, horas_teorico_practica, nombre, objetivo_general, sigla, id_area_disciplinaria, id_modalidad, id_plan_estudio)
Values ('I Ciclo', 4, 0, 0, 0, 4, 0, 'Apoyo de requisito', 'Prueba 4', 'IF0173', 1, 1, 1);
SET @curso_id = LAST_INSERT_ID();

--Descripcion Plan Estudio
INSERT INTO descripcion_plan_estudio (detalle_descripcion_plan_estudio, orden_descripcion_plan_estudio, id_plan_estudio)
VALUES('La carrera de Informática Empresarial forma profesionales con capacidad para el desarrollo de sistemas, la administración de proyectos informáticos tendientes a organizar sistemas, recursos y finanzas en la empresa, optimizando el acceso, la sistematización y la organización de la información.', 1, 1);
SET @descripcion_plan_estudio_id = LAST_INSERT_ID();

--Referencia Bibliográfica
INSERT INTO referencia_bibliografica (referencia)
VALUES('Tanembaum, A. (2009). Sistemas Operativos Modernos. Prentice Hall, 3ra edition.');
SET @bibliografia_id = LAST_INSERT_ID();

--Resultados Aprendizaje
INSERT INTO resultados_aprendizaje (sentencia_resultado)
VALUES ('El estudiante es capaz de conocer la máquina abstracta que proporcionan los sistemas operativos a través de los servicios que ofrecen.');
SET @resultado_aprendizaje_id = LAST_INSERT_ID();

--Subcontenido
INSERT INTO sub_contenido (orden_sub_contenido, sub_tema, id_contenido)
VALUES (1, 'Condiciones de bloqueo', 1);
SET @sub_contenido_id = LAST_INSERT_ID();

--Tipo Item Perfil Entrada
INSERT INTO tipo_item_perfil_entrada (nombre_tipo)
VALUES ('Aptitudes deseables');
SET @tipo_id = LAST_INSERT_ID();

INSERT INTO tipo_item_perfil_entrada (nombre_tipo)
VALUES ('Habilidades y características');
SET @tipo_id = LAST_INSERT_ID();

INSERT INTO tipo_item_perfil_entrada (nombre_tipo)
VALUES ('Tareas típicas');
SET @tipo_id = LAST_INSERT_ID();

--Tipo Item Perfil Salida
INSERT INTO tipo_item_perfil_salida (nombre_tipo)
VALUES ('Perfil Profesional');
SET @tipo_id = LAST_INSERT_ID();

INSERT INTO tipo_item_perfil_salida (nombre_tipo)
VALUES ('Mercado laboral');
SET @tipo_id = LAST_INSERT_ID();

--Item Perfil Entrada
INSERT INTO item_perfil_entrada (descripcion, orden, id_plan_estudio, id_tipo)
VALUES ('Capaz de trabajar bajo presión', 1, 1, 1);
SET @tipo_perfil_entrada_id = LAST_INSERT_ID();

INSERT INTO item_perfil_entrada (descripcion, orden, id_plan_estudio, id_tipo)
VALUES ('Habilidad para trabajar en equipo', 2, 1, 1);
SET @tipo_perfil_entrada_id = LAST_INSERT_ID();

INSERT INTO item_perfil_entrada (descripcion, orden, id_plan_estudio, id_tipo)
VALUES ('Dar mantenimiento ', 1, 1, 2);
SET @tipo_perfil_entrada_id = LAST_INSERT_ID();

INSERT INTO item_perfil_entrada (descripcion, orden, id_plan_estudio, id_tipo)
VALUES ('Diseñar aplicaciones eficientes', 2, 1, 2);
SET @tipo_perfil_entrada_id = LAST_INSERT_ID();

INSERT INTO item_perfil_entrada (descripcion, orden, id_plan_estudio, id_tipo)
VALUES ('Desarrollo de sistemas de información, al trabajar en todas las etapas del proceso: planificación, diseño, programación y pruebas.', 1, 1, 3);
SET @tipo_perfil_entrada_id = LAST_INSERT_ID();

INSERT INTO item_perfil_entrada (descripcion, orden, id_plan_estudio, id_tipo)
VALUES ('Participación en trabajos de investigación, prácticas empresariales y trabajo comunal universitario.', 2, 1, 3);
SET @tipo_perfil_entrada_id = LAST_INSERT_ID();

--Item Perfil Salida
INSERT INTO item_perfil_salida (descripcion, orden, id_plan_estudio, id_tipo)
VALUES ('La formación del informático empresarial se construye a partir de tres áreas de conocimiento: la computación, la informática y la administración, con el apoyo de la matemática y lógica, teniendo como ejes conductores la ética y el humanismo', 1, 1, 1);
SET @tipo_perfil_salida_id = LAST_INSERT_ID();

INSERT INTO item_perfil_salida (descripcion, orden, id_plan_estudio, id_tipo)
VALUES ('Instituciones autónomas', 1, 1, 2);
SET @tipo_perfil_salida_id = LAST_INSERT_ID();

INSERT INTO item_perfil_salida (descripcion, orden, id_plan_estudio, id_tipo)
VALUES ('Proyección internacional', 2, 1, 2);
SET @tipo_perfil_salida_id = LAST_INSERT_ID();
