package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.TargetService;

@SpringBootApplication
public class AopSampleApplication {

	/** 起動 */
	public static void main(String[] args) {
		SpringApplication.run(AopSampleApplication.class, args).getBean(AopSampleApplication.class).exe();
	}
	
	/** DI */
	@Autowired
	private TargetService service;

	/** 実行 */
	private void exe() {
		service.sayHello("太郎");
		// 分かりやすいように区切りを表示
		System.out.println("■□■□■□■□■□");
		service.sayGoodbye("花子");
	}

}
