package com.example.excellencesys.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket myDoctor(){
        Docket docket=new Docket(DocumentationType.SWAGGER_2);
        ApiInfo apiInfo=new ApiInfo("每日优鲜",
                "如有疑问或者错误请联系下面邮箱",
                "1.0",
                "apiDocs",
                "123456789@qq.com",
                "",
                "");
        docket.apiInfo(apiInfo);
        return docket;
    }

}
