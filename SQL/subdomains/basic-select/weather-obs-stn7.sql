-- Query the list of CITY names ending with vowels (a, e, i, o, u) from STATION. Your result cannot contain duplicates.

/*
Enter your query here.
*/
select distinct city
from station
where city REGEXP '.+[aeiou]$';
