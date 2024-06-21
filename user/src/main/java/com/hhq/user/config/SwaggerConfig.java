//package com.hhq.user.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//@Configuration
//public class SwaggerConfig {
//
//
//    Boolean swaggerEnable=true;
//    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.OAS_30).apiInfo(apiInfo())
//                // 是否开启
//                .enable(swaggerEnable).select()
//                // 扫描的路径包
//                .apis(RequestHandlerSelectors.basePackage("xxx.xxx.controller"))
//                // 指定路径处理PathSelectors.any()代表所有的路径
//                .paths(PathSelectors.any()).build().pathMapping("/");
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("Swagger3集成SpringBoot2.7 - demo示例")
//                .description("springboot | swagger")
//                // 作者信息
//                .contact(new Contact("作者信息", "个人主页url", "email"))
//                .version("1.0.0")
//                .build();
//    }
//}