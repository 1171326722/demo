package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger配置类
 * @author wangzh
 *
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
	
	@Bean
    public Docket demoApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());

    }


	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("汽车租赁系统")
				.description("xxx科技有限公司")
				.termsOfServiceUrl("http://www.xxx.com")
				.version("1.1")
				.build();
	}
}

