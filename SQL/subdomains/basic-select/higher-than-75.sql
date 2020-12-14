-- Query the Name of any student in STUDENTS who scored higher than  Marks. Order your output by the last three characters of each name. If two or more students both have names ending in the same last three characters (i.e.: Bobby, Robby, etc.), secondary sort them by ascending ID.

-- Sample Output

-- Ashley
-- Julia
-- Belvet
-- Explanation

-- Only Ashley, Julia, and Belvet have Marks > . If you look at the last three characters of each of their names, there are no duplicates and 'ley' < 'lia' < 'vet'.

/*
Enter your query here.
*/
SELECT NAME
FROM STUDENTS
WHERE MARKS > 75
ORDER BY SUBSTRING(NAME, -3) ASC, ID ASC;
