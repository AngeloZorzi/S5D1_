package it.S5D1.S5D1.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "coperto")
@Getter
@Setter
public class CopertoConfig {
    private double costo;
}

