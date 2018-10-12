package com.coder520.mamabike;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.coder520.mamabike.**.dao")
@EnableTransactionManagement
public class MamabikeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MamabikeApplication.class, args);
	}

	/**
	 * 用fastJson覆盖jackson
	 * @return
	 */
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		FastJsonHttpMessageConverter fastJsonConverter = new FastJsonHttpMessageConverter();
		HttpMessageConverter<?> converter = fastJsonConverter;
		return new HttpMessageConverters(converter);
	}

}
