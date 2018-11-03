package samples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import samples.models.config.OrderWebConfig;
import samples.models.order.OrderConfiguration;

@SpringBootApplication
@Import({OrderWebConfig.class, OrderConfiguration.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
