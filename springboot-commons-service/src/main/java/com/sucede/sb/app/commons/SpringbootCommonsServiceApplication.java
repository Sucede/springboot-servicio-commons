package com.sucede.sb.app.commons;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//Con esto deshabilitamos la autoconfiguración del DataSource, ya que no necesitamos aquí JPA
//También hemos eliminado la dependencia de h2 después de la primera configuración a través del Starter
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootCommonsServiceApplication {

}
