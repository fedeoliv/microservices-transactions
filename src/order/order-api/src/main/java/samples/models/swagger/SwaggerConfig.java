package samples.models.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig { 
    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Order API Documentation")
            .description("This is an API sample for choreography-based sagas in order to maintain data consistency in a microservice architecture.")
            .license("MIT")
            .licenseUrl("https://github.com/fernandoBRS/microservices-transactions/blob/master/LICENSE")
            .termsOfServiceUrl("")
            .version("0.0.1")
            .contact(new Contact("Fernando de Oliveira", "", "fedeoliv@microsoft.com"))
            .build();
    }
                                      
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)
            .select()                                  
                .apis(RequestHandlerSelectors.any())              
                .paths(PathSelectors.any())                          
                .build()
            .apiInfo(apiInfo());                                           
    }
}
