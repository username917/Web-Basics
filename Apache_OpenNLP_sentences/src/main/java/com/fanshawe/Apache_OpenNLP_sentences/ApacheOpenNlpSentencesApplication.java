package com.fanshawe.Apache_OpenNLP_sentences;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ApacheOpenNlpSentencesApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ApacheOpenNlpSentencesApplication.class, args);
	
		SentenceClass newClass = new SentenceClass();
		newClass.newMethod();
	}

}
