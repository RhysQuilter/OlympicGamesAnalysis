# Olympic Games Analysis

## Requirements
- [Java SE Development Kit 16](https://www.oracle.com/java/technologies/javase-jdk16-downloads.html)

## Background

The summer Olympic Games are held every four years with the most recent games being held in Tokyo. For each event there is a gold, silver and bronze medal awarded to the top three teams or individual athletes. The Olympic medal table shows each country in order from most gold medals won to the least number of gold medals won. Silver and bronze medals are used as tie-breaks, should there be two nations with an equal amount of gold medals.

## File Description

The file [./assets/medals.txt](./assets/medals.txt) contains 93 different records about the different countries/teams who won medals at the recent Tokyo Olympic Games.  A screen-grab of the first ten records in the file (along with column headings are shown below).

```txt
Rank    Team            Gold    Silver    Bronze    Total    Rank_by_Total
1       USA             39      41        33        113      1
2       China           38      32        18        88       2
3       Japan           27      14        17        58       5
4       Great_Britain	22      21        22        65       4
5       ROC             20      28        23        71       3
6       Australia       17      7         22        46       6
7       Netherlands     10      12        14        36       9
8       France          10      12        11        33       10
9       Germany         10      11        16        37       8
10      Italy           10      10        20        40       7
```
The fields in the file are as follows:

- ***Rank***: The teams overall rank in terms of Gold medals won.
- ***Team***: The team/country.
- ***Gold***: Number of gold medals won.
- ***Silver***: The number of silver medals won.
- ***Bronze***: The number of bronze medals won.
- ***Total***: The total number of medals won by a team/country.
- ***Rank_by_total:*** The rank of a team/country based on the total number of medals won.

## Starter Code

In the starter code that is available for this assignment, a `Medal` class is provided and models a record from the file.

A class called `FileParser` is also provided and contains one public method – `readFile`. This method accepts the file name as an argument and will then read each record from the file, convert it to a `Medal` object and then add the object to a list. It is this `List` of `Medal` objects that the method returns.

## Tasks

### Task One:

Write and execute a `Callable` that will accept two arguments - a list of medals and an `int` value (call it **X**). The `Callable` will then determine and return the percentage of countries whose rank is greater than their rank_by_total. However, before you return the percentage value you must format it to  **X** decimal places.

```output
Percentage of those countries whose rank is greater than their rank_by_total: 48.39%
```
*The percentage value when X has a value of 2.*

```output
Percentage of those countries whose rank is greater than their rank_by_total: 48.3871%
```

*The percentage value when X has a value of 4.*

### Task Two

Schedule a `Runnable` to run every 5 seconds with an initial delay of 3 seconds. The `Runnable` should generate a random number between 1 and 86 and then print the rank of each record in the file that matches the random number.  You need to be cognizant of the fact that more than one record may share the same rank (in which case you should print all matching records). Should your application generate a random number/rank that isn't found in the file, you should print a suitable error message.

```output
No record found with a rank of 61
Medal{rank=9, team-Germany, goldTotal=10, silverTotal=11, bronzeTotal=16, overallTotal=37, rankByTotal=8}
Medal{rank=85, team=Finland, goldTotal=0, silverTotal=0, bronzeTotal=2, overallTotal=2, rankByTotal=66}
No record found with a rank of 57
Medal{rank=14, team=Cuba, goldTotal=7, silverTotal=3, bronzeTotal=5, overallTotal=15, rankByTotal=18}
Medal{rank=31, team-Slovenia, goldTotal=3, silverTotal=1, bronzeTotal=1, overallTotal=5, rankByTotal=42}
Medal{rank=34, team=Chinese_Taipei, goldTotal=2, silverTotal=4, bronzeTotal=6, overallTotal=12, rankByTotal=22}
Medal{rank=84, team-Mexico, goldTotal=0, silverTotal=0, bronzeTotal=4, overallTotal=4, rankByTotal=47}
No record found with a rank of 51
Medal{rank=21, team-Jamaica, goldTotal=4, silverTotal=, bronzeTotal=4, overallTotal=9, rankByTotal=26}
No record found with a rank of 64
Medal{rank=23, team-Sweden, goldTotal=3, silverTotal=6, bronzeTotal=0, overallTotal=9, rankByTotal=26}
Medal{rank=9, team-Germany, goldTotal=10, silverTotal=1, bronzeTotal=16, overallTotal=37, rankByTotal=8}
Medal{rank=54, team=Egypt, goldTotal=1, silverTotal=1, bronzeTotal=4, overallTotal=6, rankByTotal=39}
```

### Task Three

Write and execute a `Callable` that will accept a single argument – a list of medals. The `Callable` must then return a filtered list of those medals objects whose *team* name ends in either “stan” or “land”. The filtered list must be ordered by *rank_by_total*. You must then display the filtered and ordered list on the console.

```output
Medal{rank=13, team=New_Zealand, goldTotal=7, silverTotal=6, bronzeTotal=7, overallTotal=20, rankByTotal=13}
Medal{rank=17, team-Poland, goldTotal=4, silverTotal=5, bronzeTotal=5, overallTotal=14, rankByTotal=19}
Medal{rank=24, team-Switzerland, goldTotal=3, silverTotal=4, bronzeTotal=6, overallTotal=13, rankByTotal=20}
Medal{rank=83, team-Kazakhstan, goldTotal=0, silverTotal=0, bronzeTotal=8, overallTotal-8, rankByTotal=29}
Medal{rank=32, team-Uzbekistan, goldTotal=3, silverTotal=0, bronzeTotal=2, overallTotal=5, rankByTotal=42}
Medal{rank=39, team-Ireland, goldTotal=2, silverTotal=0, bronzeTotal=2, overallTotal=4, rankByTotal=47}
Medal{rank=70, team-Kyrgyzstan, goldTotal=0, silverTotal=2, bronzeTotal=1, overallTotal=3, rankByTotal=60}
Medal{rank=59, team=Thailand, goldTotal=1, silverTotal=0, bronzeTotal=1, overallTotal=2, rankByTotal=66}
Medal{rank=85, team-Finland, goldTotal=0, silverTotal=0, bronzeTotal=2, overallTotal=2, rankByTotal=66}
Medal{rank=77, team=Turkmenistan, goldTotal=0, silverTotal=1, bronzeTotal=0, overallTotal=1, rankByTotal=77}
```

### Task Four

Write and execute a `Callable` that will accept three arguments – a list of medals, an offset (specified as an int) and a sort key. The sort key will indicate that the list should be sorted in descending order by the number of either gold, silver or bronze medals won. You can model the sort key in whatever way you want. It could be a simple String holding a value of “Gold”, “Silver” or “Bronze”, you could model it as a lambda expression or a [Comparator](https://docs.oracle.com/javase/7/docs/api/java/util/Comparator.html)

After the list has been sorted, the `Callable` should then return a subset of the sorted list (based on the offset).

```output
Medal{rank=1, team=USA, goldTotal=39, silverTotal=41, bronzeTotal=33, overallTotal=113, rankByTotal=1}
Medal{rank=2, team=China, goldTotal=38, silverTotal=32, bronzeTotal=18, overallTotal=88, rankByTotal=2}
Medal{rank=3, team=Japan, goldTotal=27, silverTotal=14, bronzeTotal=17, overallTotal=58, rankByTotal=5}
Medal{rank=4, team-Great Britain, goldTotal=22, silverTotal=21, bronzeTotal=22, overallTotal=65, rankByTotal=4}
Medal{rank=5, team=ROc, goldTotal=20, silverTotal=28, bronzeTotal=23, overallTotal=71, rankByTotal=3}
Medal{rank=6, team=Australia, goldTotal=17, silverTotal=7, bronzeTotal=22, overallTotal=46, rankByTotal=6}
Medal{rank=10, team=Italy, goldTotal=10, silverTotal=10, bronzeTotal=20, overallTotal=40, rankByTotal=7}
Medal{rank=9, team-Germany, goldTotal=10, silverTotal=11, bronzeTotal=16, overallTotal=37, rankByTotal=8}
Medal{rank=8, team=France, goldTotal=10, silverTotal=12, bronzeTotal=11, overallTotal=33, rankByTotal=10}
Medal{rank=7, team=Netherlands, goldTotal=10, silverTotal=12, bronzeTotal=14, overallTotal=36, rankByTotal=9}
Medal{rank=14, team=Cuba, goldTotal=7, silverTotal=3, bronzeTotal=5, overallTotal=15, rankByTotal=18}
Medal{rank=13, team=New_Zealand, goldTotal=7, silverTotal=6, bronzeTotal=7, overallTotal=20, rankByTotal=13}
Medal{rank=12, team-Brazil, goldTotal=7, silverTotal=6, bronzeTotal=8, overallTotal=21, rankByTotal=12}
Medal{rank=11, team=Canada, goldTotal=7, silverTotal=6, bronzeTotal=11, overallTotal=24, rankByTotal=11}
Medal{rank=16, team=Republic_of_Korea, goldTotal=6, silverTotal=4, bronzeTotal=10, overallTotal=20, rankByTotal=13}
```

Above, is a screen grab where the sort key was gold with an offset of 15.

```output
Medal{rank=1, team=USA, goldTotal=39, silverTotal=41, bronzeTotal=33, overallTotal=113, rankByTotal=1}
Medal{rank=2, team-China, goldTotal=38, silverTotal=32, bronzeTotal=18, overallTotal=88, rankByTotal=2}
Medal{rank=5, team=ROc, goldTotal=20, silverTotal=28, bronzeTotal=23, overallTotal=71, rankByTotal=3}
Medal{rank=4, team=Great_Britain, goldTotal=22, silverTotal=21, bronzeTotal=22, overallTotal=65, rankByTotal=4}
Medal{rank=3, team=Japan, goldTotal=27, silverTotal=14, bronzeTotal=17, overallTotal=58, rankByTotal=5}
```

Above, is a screen grab where the sort key was silver with an offset of 5.

```output
Medal{rank=1, team=USA, goldTotal=39, silverTotal=41, bronzeTotal=33, overallTotal=113, rankByTotal=1}
Medal{rank=5, team=ROc, goldTotal=20, silverTotal=28, bronzeTotal=23, overallTotal=71, rankByTotal=3}
Medal{rank=6, team=Australia, goldTotal=17, silverTotal=7, bronzeTotal=22, overallTotal=46, rankByTotal=6}
```

Above, is a screen grab where the sort key was bronze with an offset of 3.

When sorting the list, consider the [Collections API](https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html) or Streaming the list. You will find a nice example of using the Java 8 Comparator [here](https://www.javatpoint.com/Comparator-interface-in-collection-framework).


### Allocation of marks

|Tasks|marks|
|-|-|
|Task 1|12 marks|
|Task 2|15 marks|
|Task 3|20 marks|
|Task 4|53 marks|

**All four tasks are to be submitted to a suitable Executor service and are to run concurrently.**

## Tools Used
* [Apache NetBeans 12.4](https://netbeans.apache.org/)
* [VS Code](https://code.visualstudio.com/), [Java Extension](https://code.visualstudio.com/docs/languages/java)
* [GitPod](https://gitpod.io/)
---
Copyright (c) 2020 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.