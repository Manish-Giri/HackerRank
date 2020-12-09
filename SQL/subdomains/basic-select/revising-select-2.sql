-- Query the NAME field for all American cities in the CITY table with populations larger than 120000. The CountryCode for America is USA.

SELECT name
FROM CITY
WHERE population > 120000 AND countrycode='USA'
