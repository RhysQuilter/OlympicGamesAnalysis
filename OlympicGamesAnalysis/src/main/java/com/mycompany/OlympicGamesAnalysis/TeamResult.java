package com.mycompany.OlympicGamesAnalysis;

public class TeamResult
{
	/* Fields */
	private int bronzeMedals;
	private int goldMedals;
	private int goldRank;
	private String name;
	private int silverMedals;
	private int totalMedals;
	private int totalRank;

	/**
	 * Constructs a new Team Result
	 */
	public TeamResult()
	{
	}
	public TeamResult(int goldRank, String name, int goldMedals, int silverMedals, int bronzeMedals, int totalMedals, int totalRank)
	{
		this.bronzeMedals = bronzeMedals;
		this.goldMedals = goldMedals;
		this.goldRank = goldRank;
		this.name = name;
		this.silverMedals = silverMedals;
		this.totalMedals = totalMedals;
		this.totalRank = totalRank;
	}
	/* Properties */
	public int getBronzeMedals()
	{
		return bronzeMedals;
	}
	public void setBronzeMedals(int bronzeMedals)
	{
		this.bronzeMedals = bronzeMedals;
	}
	public int getGoldMedals()
	{
		return goldMedals;
	}
	public void setGoldMedals(int goldMedals)
	{
		this.goldMedals = goldMedals;
	}
	public int getGoldRank()
	{
		return goldRank;
	}
	public void setGoldRank(int goldRank)
	{
		this.goldRank = goldRank;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getSilverMedals()
	{
		return silverMedals;
	}
	public void setSilverMedals(int silverMedals)
	{
		this.silverMedals = silverMedals;
	}
	public int getTotalMedals()
	{
		return totalMedals;
	}
	public void setTotalMedals(int totalMedals)
	{
		this.totalMedals = totalMedals;
	}
	public int getTotalRank()
	{
		return totalRank;
	}
	public void setTotalRank(int totalRank)
	{
		this.totalRank = totalRank;
	}
	/* Methods */
	@Override
	public String toString()
	{
		return String.format("Medal{rank=%d, team=%s, goldTotal=%d, silverTotal=%d, bronzeTotal=%d, overallTotal=%d, rankByTotal=%d}",
				goldRank,
				name,
				goldMedals,
				silverMedals,
				bronzeMedals,
				totalMedals,
				totalRank
		);
	}
}