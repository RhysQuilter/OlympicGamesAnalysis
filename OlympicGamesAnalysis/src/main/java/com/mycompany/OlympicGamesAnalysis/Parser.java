package com.mycompany.OlympicGamesAnalysis;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Parser
{
	public static List<TeamResult> parseTeamResults(List<String> lines)
	{
		var teamResults = new ArrayList<TeamResult>();
		for(String line : lines)
			teamResults.add(parseTeamResult(line));
		return teamResults;
	}
	public static TeamResult parseTeamResult(String line)
	{
		var stringTokenizer = new StringTokenizer(line);
		while(stringTokenizer.hasMoreElements())
		{
			int rank = Integer.parseInt(stringTokenizer.nextToken());
			String team = stringTokenizer.nextToken();
			int goldTotal = Integer.parseInt(stringTokenizer.nextToken());
			int silverTotal = Integer.parseInt(stringTokenizer.nextToken());
			int bronzeTotal = Integer.parseInt(stringTokenizer.nextToken());
			int overallTotal = Integer.parseInt(stringTokenizer.nextToken());
			int rankByTotal = Integer.parseInt(stringTokenizer.nextToken());

			return new TeamResult(rank, team, goldTotal, silverTotal, bronzeTotal, overallTotal, rankByTotal);
		}
		return null; //shouldn't get here
	}
	private Parser() { }
}