--Grado
INSERT INTO grado(nombre, total_creditos_maximo, total_creditos_minimo) Values ('Bachillerato', 130, 100);
SET @grado_id =  LAST_INSERT_ID();


--PlanEstudio
INSERT INTO plan_estudio(ano_aprobacion, cantidad_ciclos, codigo_carrera, duracion_anos, nombre_carrera, id_grado)
Values (2020, 7, 10092, 4, 'Informática Empresarial', 1);
SET @id_plan_estudio =  LAST_INSERT_ID();


--TipoPerfilEntrada
INSERT INTO tipo_perfil_entrada(nombre_tipo)
Values ("Habilidades deseables");
SET @id_tipo =  LAST_INSERT_ID();

INSERT INTO tipo_perfil_entrada(nombre_tipo)
Values ("Tareas típicas");
SET @id_tipo =  LAST_INSERT_ID();


--ItemPerfilEntrada
INSERT INTO item_perfil_entrada (descripcion,id_plan_estudio,id_tipo)
Values ("Facilidad para el trabajo con material cuantitativo en especial para el razonamiento lógico matemático.", 1,1);
SET @id_tipo_perfil_entrada =  LAST_INSERT_ID();

INSERT INTO item_perfil_entrada (descripcion,id_plan_estudio,id_tipo)
Values ("Facilidad para comunicar a otros información técnica.", 1,1);
SET @id_tipo_perfil_entrada =  LAST_INSERT_ID();

INSERT INTO item_perfil_entrada (descripcion,id_plan_estudio,id_tipo)
Values ("Seguro de si mismo, con iniciativa y dispuesto a tomar decisiones ante los retos que se le presenten.", 1,1);
SET @id_tipo_perfil_entrada =  LAST_INSERT_ID();

INSERT INTO item_perfil_entrada (descripcion,id_plan_estudio,id_tipo)
Values (" Interés por los continuos cambios en las tecnologías de la información.", 1,1);
SET @id_tipo_perfil_entrada =  LAST_INSERT_ID();

INSERT INTO item_perfil_entrada (descripcion,id_plan_estudio,id_tipo)
Values (" Adquisición de conocimientos para el análisis cuantitativo en áreas como: cálculo, álgebra, estructuras discretas, análisis numérico, investigación de operaciones, probabilidad, estadísticas, economía y finanzas
.", 1,2);
SET @id_tipo_perfil_entrada =  LAST_INSERT_ID();

INSERT INTO item_perfil_entrada (descripcion,id_plan_estudio,id_tipo)
Values (" Interés por los continuos cambios en las tecnologías de la información.", 1,2);
SET @id_tipo_perfil_entrada =  LAST_INSERT_ID();

INSERT INTO item_perfil_entrada (descripcion,id_plan_estudio,id_tipo)
Values (" Análisis de modelos informáticos aplicables a las actividades de las empresas.", 1,2);
SET @id_tipo_perfil_entrada =  LAST_INSERT_ID();


--TipoPerfilSalida
INSERT INTO tipo_perfil_salida(nombre_tipo)
Values ("Perfil profesional");
SET @id_tipo =  LAST_INSERT_ID();

INSERT INTO tipo_perfil_salida(nombre_tipo)
Values ("Mercado laboral");
SET @id_tipo =  LAST_INSERT_ID();

INSERT INTO tipo_perfil_salida(nombre_tipo)
Values ("Comunicación de estudios");
SET @id_tipo =  LAST_INSERT_ID();

--ItemPerfilSalida
INSERT INTO item_perfil_salida(descripcion,id_plan_estudio,id_tipo)
Values ("La formación del informático empresarial se construye a partir de tres áreas del conocimiento: la computación, la informática y la administración, con el apoyo de la matemática y la lógica, teniendo como ejes la ética y el humanismo. Este profesional esta capacitado para analizar, diseñar y programar sistemas, utilizando tecnología de punta, así como para la planificación, control y dirección de la gestión informática en la empresa o institución. ", 1,1);
SET @id_tipo_perfil_salida=  LAST_INSERT_ID();

INSERT INTO item_perfil_salida (descripcion,id_plan_estudio,id_tipo)
Values ("Instituciones autónomas.", 1,2);
SET @id_tipo_perfil_salida=  LAST_INSERT_ID();

INSERT INTO item_perfil_salida (descripcion,id_plan_estudio,id_tipo)
Values ("Gobierno central.", 1,2);
SET @id_tipo_perfil_salida=  LAST_INSERT_ID();

INSERT INTO item_perfil_salida (descripcion,id_plan_estudio,id_tipo)
Values ("Industrias.", 1,2);
SET @id_tipo_perfil_salida=  LAST_INSERT_ID();

INSERT INTO item_perfil_salida (descripcion,id_plan_estudio,id_tipo)
Values ("Empresas privadas.", 1,2);
SET @id_tipo_perfil_salida=  LAST_INSERT_ID();

INSERT INTO item_perfil_salida (descripcion,id_plan_estudio,id_tipo)
Values ("Educación superior estatal y privada.", 1,2);
SET @id_tipo_perfil_salida=  LAST_INSERT_ID();

INSERT INTO item_perfil_salida (descripcion,id_plan_estudio,id_tipo)
Values ("Centros de investigación.", 1,2);
SET @id_tipo_perfil_salida=  LAST_INSERT_ID();

INSERT INTO item_perfil_salida (descripcion,id_plan_estudio,id_tipo)
Values ("Oficinas dedicadas a la consultoría y servicios computacionales.", 1,2);
SET @id_tipo_perfil_salida=  LAST_INSERT_ID();

INSERT INTO item_perfil_salida (descripcion,id_plan_estudio,id_tipo)
Values ("El estudiante graduado de esta carrera puede continuar sus estudios de Licenciatura o Maestría en el área Informática en cualquiera de las Universidades Públicas del país.", 1,3);
SET @id_tipo_perfil_salida=  LAST_INSERT_ID();

