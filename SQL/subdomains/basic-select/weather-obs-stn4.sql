-- Find the difference between the total number of CITY entries in the table and the number of distinct CITY entries in the table.

SELECT count(CITY) - count(DISTINCT CITY)
FROM STATION;
