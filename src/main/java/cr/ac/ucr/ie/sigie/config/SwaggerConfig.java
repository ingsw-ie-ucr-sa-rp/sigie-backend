package cr.ac.ucr.ie.sigie.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "SIGIE API", version = "1.0", description = "Documentación del API de SIGIE"))
public class SwaggerConfig { }
