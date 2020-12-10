-- Query the two cities in STATION with the shortest and longest CITY names, as well as their respective lengths (i.e.: number of characters in the name). If there is more than one smallest or largest city, choose the one that comes first when ordered alphabetically.

-- Sample Input

-- For example, CITY has four entries: DEF, ABC, PQRS and WXY.

-- Sample Output

-- ABC 3
-- PQRS 4
-- Explanation

-- When ordered alphabetically, the CITY names are listed as ABC, DEF, PQRS, and WXY, with lengths  and . The longest name is PQRS, but there are  options for shortest named city. Choose ABC, because it comes first alphabetically.

-- Note
-- You can write two separate queries to get the desired output. It need not be a single query.


-- (SELECT CITY, MIN(LENGTH(CITY))
--  FROM STATION
--  GROUP BY CITY
--  LIMIT 1
-- )
-- UNION
-- (SELECT CITY, MAX(LENGTH(CITY))
--  FROM STATION
--  GROUP BY CITY
--  LIMIT 1
-- );

-- SELECT MIN(LENGTH(CITY)), MAX(LENGTH(CITY)) FROM STATION;

(SELECT CITY, LENGTH(CITY)
 FROM STATION
 GROUP BY CITY
 ORDER BY LENGTH(CITY), CITY
 LIMIT 1
)
UNION
(SELECT CITY, LENGTH(CITY)
 FROM STATION
 GROUP BY CITY
 ORDER BY LENGTH(CITY) DESC
 LIMIT 1
);

-- RIGHT OUTPUT
-- Amo 3
-- Marine On Saint Croix 21

-- (
--     select city
--     from STATION
--     order by length(city), city
--     limit 1
-- )
-- UNION

-- (
--     select city
--     from STATION
--     order by length(city) desc
--     limit 1
-- );

-- Amo
-- Marine On Saint Croix

-- select city
-- from station
-- order by length(city), city
-- limit 5;

-- Amo
-- Lee
-- Roy
-- Acme
-- Alba
