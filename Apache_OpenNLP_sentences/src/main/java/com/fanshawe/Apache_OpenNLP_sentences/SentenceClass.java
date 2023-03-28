package com.fanshawe.Apache_OpenNLP_sentences;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;

public class SentenceClass {
	
	public void newMethod() throws IOException {
		/*
		 * InputStream modelFile = this.getClass().getClassLoader().getResourceAsStream(
		 * "opennlp-en-ud-ewt-sentence-1.0-1.9.3.bin"); SentenceModel sentModel = new
		 * SentenceModel(modelFile);
		 * 
		 * SentenceDetectorME sentenceDetector = new SentenceDetectorME(sentModel);
		 * 
		 * String input = ""; String sentences[] = sentenceDetector.sentDetect(input);
		 * 
		 * System.out.println("Sentences" + sentences.length + " first line: " +
		 * sentences[2]);
		 */	
		//ClassLoader loader = Thread.currentThread().getContextClassLoader();
		
		URL test1 = getClass().getResource("/");
		URL test2 = getClass().getClassLoader().getResource("/");            
		URL test3 = getClass().getClassLoader().getResource("../");
		
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("en-token.bin");
			    TokenizerModel model = new TokenizerModel(inputStream);
			    TokenizerME tokenizer = new TokenizerME(model);
			    String[] tokens = tokenizer.tokenize("Baeldung is a Spring Resource.");
			 
			    String output  = tokens.toString();
			    
			    if (output.contains("Baeldung")) {
			    	System.out.println("Baeldung is contained");
			    	
			    } else if (output.contains("Spring")) {
			    	System.out.println("Spring is contained");
			    	
			    }

	
	
	}

}
