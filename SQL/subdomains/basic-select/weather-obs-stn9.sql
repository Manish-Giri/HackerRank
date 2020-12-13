-- Query the list of CITY names from STATION that do not start with vowels. Your result cannot contain duplicates.

/*
Enter your query here.
*/

SELECT DISTINCT CITY
FROM STATION
WHERE CITY REGEXP '^[^aeiou]+';
