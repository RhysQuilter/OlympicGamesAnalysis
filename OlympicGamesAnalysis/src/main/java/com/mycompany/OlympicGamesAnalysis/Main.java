/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.mycompany.OlympicGamesAnalysis;

import java.io.IOException;
import static java.util.Collections.list;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main
{
	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException
	{
		String filePath = args.length == 0 ? "./assets/medals.txt" : args[0];
		List<TeamResult> teamResults = FileParser.parseTeamResults(filePath);
		//System.out.println(teamResults);
		int precision = 2;	
		
		final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(7);

		/* Task 1 */
		final Future<String> greaterGoldRankFuture1 = executorService.submit(new TaskOneCallable(teamResults, precision));
		final Future<String> greaterGoldRankFuture2 = executorService.submit(new TaskOneCallable(teamResults, 4));
		
		System.out.println("Task 1: The percentage of countries whose rank is greater than their Total Medal Rank");
		System.out.println(greaterGoldRankFuture1.get());
		System.out.println(greaterGoldRankFuture2.get());
		
		/* Task 2*/
		
		int initialDelay = 3;
		int delay = 5;
		
		executorService.scheduleWithFixedDelay(new SchedualRunnable(teamResults), initialDelay, delay, TimeUnit.SECONDS);
		
		
				
	}
}