package javaParser;

import java.io.File;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File projectDir = new File("C:\\Users\\Eshan\\Desktop\\Extra\\Java Testing Project");
		StatementsLinesExample javaFiles = new StatementsLinesExample();
		 javaFiles.statementsByLine(projectDir);
        
	}

}
