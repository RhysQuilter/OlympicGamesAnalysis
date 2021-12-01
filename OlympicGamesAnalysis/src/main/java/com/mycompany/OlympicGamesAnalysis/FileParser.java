package com.mycompany.OlympicGamesAnalysis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileParser
{
	public static List<TeamResult> parseTeamResults(String file) throws IOException
	{
		Path path = Paths.get(file);
		List<String> lines = Files.readAllLines(path);
		if(!lines.isEmpty())
			lines.remove(0);// Remove Headings
		return Parser.parseTeamResults(lines);
	}
	private FileParser() { }
}