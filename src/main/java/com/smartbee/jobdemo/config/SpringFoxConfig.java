package com.smartbee.jobdemo.config;

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

/**
 * @author prinswu
 * @version v1.0
 * @since v1.0 2020/5/18
 */
@Configuration
@EnableSwagger2
public class SpringFoxConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
//                .securityContexts(Arrays.asList(actuatorSecurityContext()))
//                .securitySchemes(Arrays.asList(basicAuthScheme()));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Job Demo API Document - Prins Wu")
                .description("For job demo spring boot web")
//                .termsOfServiceUrl("localhost")
                .version("1.0")
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
                .contact(new Contact("Prins Wu", "https://www.linkedin.com/in/prinswu/", "prinswu@gmail.com"))
                .build();
    }

//    private SecurityContext actuatorSecurityContext() {
//        return SecurityContext.builder()
//                .securityReferences(Arrays.asList(basicAuthReference()))
//                .forPaths(PathSelectors.ant("/actuator/**"))
//                .build();
//    }

//    private SecurityScheme basicAuthScheme() {
//        return new BasicAuth("basicAuth");
//    }

//    private SecurityReference basicAuthReference() {
//        return new SecurityReference("basicAuth", new AuthorizationScope[0]);
//    }
}
