-- Write a query identifying the type of each record in the TRIANGLES table using its three side lengths. Output one of the following statements for each record in the table:

-- Equilateral: It's a triangle with  sides of equal length.
-- Isosceles: It's a triangle with  sides of equal length.
-- Scalene: It's a triangle with  sides of differing lengths.
-- Not A Triangle: The given values of A, B, and C don't form a triangle.
-- Input Format

-- The TRIANGLES table is described as follows:

-- Sample Output

-- Isosceles
-- Equilateral
-- Scalene
-- Not A Triangle
-- Explanation

-- Values in the tuple  form an Isosceles triangle, because .
-- Values in the tuple  form an Equilateral triangle, because . Values in the tuple  form a Scalene triangle, because .
-- Values in the tuple  cannot form a triangle because the combined value of sides  and  is not larger than that of side .

/*
Enter your query here.
*/

-- SELECT

-- (CASE
--     WHEN (A = B AND B = C AND C = A) THEN "Equilateral"
--     WHEN A = B THEN "Isosceles"
--     WHEN (A != B AND B != C) THEN "Scalene"
--     WHEN (A + B) < C THEN "Not A Triangle"
--     ELSE "something else"
-- END)
-- FROM TRIANGLES;


SELECT
  CASE 
    WHEN A + B <= C OR A + C <= B OR B + C <= A THEN 'Not A Triangle'
    WHEN A = B AND B = C THEN 'Equilateral'
    WHEN A = B OR A = C OR B = C THEN 'Isosceles'
    ELSE 'Scalene'
  END
FROM TRIANGLES;

