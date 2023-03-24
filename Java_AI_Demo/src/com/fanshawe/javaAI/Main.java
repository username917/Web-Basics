package com.fanshawe.javaAI;

import javax.swing.JOptionPane;

import opennlp.tools.tokenize.SimpleTokenizer;

public class Main {
	
	// this is a simple example that prints out the contents of an array _
	// using the Apache OpenNLP library

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleTokenizer tokenizer = SimpleTokenizer.INSTANCE;
		String tokens[] = tokenizer.tokenize("Your Service is bad");
		
		for(int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}

	}

}
