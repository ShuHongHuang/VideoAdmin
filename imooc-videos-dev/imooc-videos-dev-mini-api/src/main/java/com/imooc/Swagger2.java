package com.imooc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {
	@Bean
	public Docket createRestApi() {
		
		// 涓簊wagger娣诲姞header鍙傛暟鍙緵杈撳叆  
        ParameterBuilder userTokenHeader = new ParameterBuilder();
        ParameterBuilder userIdHeader = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<Parameter>();  
        userTokenHeader.name("headerUserToken").description("userToken")
        	.modelRef(new ModelRef("string")).parameterType("header")
        	.required(false).build();  
        userIdHeader.name("headerUserId").description("userId")
	    	.modelRef(new ModelRef("string")).parameterType("header")
	    	.required(false).build(); 
        pars.add(userTokenHeader.build());
        pars.add(userIdHeader.build());
		
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.imooc.controller"))
				.paths(PathSelectors.any()).build()
				.globalOperationParameters(pars);
	}

	/**
	 * @Description: 鏋勫缓 api鏂囨。鐨勪俊鎭�
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				// 璁剧疆椤甸潰鏍囬
				.title("短视频的swagger2的api接口")
				// 璁剧疆鑱旂郴浜�
				.contact(new Contact("黄树鸿", "www.baidu.com", "916894816@qq.com"))
				// 鎻忚堪
				.description("用于查看糖果短视频的API接口，如何实现、测试与调用")
				// 瀹氫箟鐗堟湰鍙�
				.version("1.0").build();
	}
}
