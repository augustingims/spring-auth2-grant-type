package com.teamevsolution.auth2client.api;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@ConditionalOnClass({ ApiInfo.class, BeanValidatorPluginsConfiguration.class })
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig {


    /**
     *
     * @return Docket
     */
    @Bean
    public Docket productApi() {

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Test API")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/api/**"))
                .build()
                //.securityContexts(Collections.singletonList(securityContext()))
                //.securitySchemes(Arrays.asList(securitySchema(), apiKey(), apiCookieKey()))
                ;
    }

    /**
     *
     * @return ApiInf
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Swagger API").description("")
                .contact(new Contact("Developers", "https://projects.spring.io/spring-boot/", ""))
                .license("Open Source")
                .licenseUrl("\"https://www.apache.org/licenses/LICENSE-2.0")
                .version("1.0.0")
                .build();

    }
}
