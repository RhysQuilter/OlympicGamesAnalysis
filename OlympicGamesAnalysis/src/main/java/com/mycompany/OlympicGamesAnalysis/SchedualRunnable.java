package com.mycompany.OlympicGamesAnalysis;

import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Rhys Quilter <https://github.com/RhysQuilter>
 */
public class SchedualRunnable implements Runnable {

	private final List<TeamResult> teamResults;

	public SchedualRunnable(List<TeamResult> teamResults) {
		this.teamResults = teamResults;

	}

	@Override
	public void run() {
		System.out.println("Task3 Runnable begins at:" + new Date());
		int min = 1;
		int max = 86;
		int randomRank = ThreadLocalRandom.current().nextInt(min, max + 1); // getting random number

		List<TeamResult> randomTeamResults = teamResults.stream()
				.filter(teamResult -> teamResult.getGoldRank() == randomRank) // print the rank of each record in the file that matches the random number
				.toList();

		System.out.printf("Print Team Result for random rank %d%n", randomRank);

		if (randomTeamResults.isEmpty()) {
			System.out.printf("no record found with a result of %d%n", randomRank);

		} else {
			randomTeamResults.forEach(System.out::println);
		}

	}

}
