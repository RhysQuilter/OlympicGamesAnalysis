package com.mycompany.OlympicGamesAnalysis;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 *
 * @author Rhys Quilter <https://github.com/RhysQuilter>
 */
public class TaskOneCallable implements Callable<String> {

	private final List<TeamResult> teamResults;
	private final int decimalPlacePrecision;

	public TaskOneCallable(List<TeamResult> teamResults, int decimalPlacePrecision) {
		this.teamResults = teamResults;
		this.decimalPlacePrecision = decimalPlacePrecision;
	}

	@Override
	public String call() throws Exception {
		var filteredTeamResults = teamResults
				.stream()
				.filter(teamResult -> teamResult.getGoldRank() > teamResult.getTotalRank())
				.toList();
		
		double percentage = filteredTeamResults.size()*100 /(double) teamResults.size();
		var message = "Percentage of those countries whose rank is greater than their rank_by_total: %." + decimalPlacePrecision + "f%%";
		return String.format(message, percentage);
	}
	
}
/**
 *
 * @author Rhys Quilter <https://github.com/RhysQuilter>
 */
 class TaskOneCallable1 implements Callable<String> {

	private final List<TeamResult> teamResults;
	private final int decimalPlacePrecision;

	public TaskOneCallable1(List<TeamResult> teamResults, int decimalPlacePrecision) {
		this.teamResults = teamResults;
		this.decimalPlacePrecision = decimalPlacePrecision;
	}

	@Override
	public String call() throws Exception {
		var filteredTeamResults = new ArrayList<TeamResult>();
		for (TeamResult teamResult : teamResults) {
			if(teamResult.getGoldRank() > teamResult.getTotalRank())
				filteredTeamResults.add(teamResult);
		}
		
		double percentage = filteredTeamResults.size()*100 /(double) teamResults.size();
		var message = "Percentage of those countries whose rank is greater than their rank_by_total: %." + decimalPlacePrecision + "f%%";
		return String.format(message, percentage);
	}
	
}
