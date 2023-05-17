-- 175. Combining two tables 
SELECT p.firstName, p.lastName, a.city, a.state 

FROM Person p

LEFT JOIN Address a

ON p.personId =  a.personId

-- 181. Employees Earning More Than Their Managers
SELECT e1.name AS Employee

FROM Employee e1

LEFT JOIN Employee e2 

#can be solved w/ INNER JOIN as well.

ON e1.managerId = e2.id

WHERE e1.salary > e2.salary


-- 182. Duplicate Emails
SELECT email as Email

FROM Person 

GROUP BY email 

HAVING COUNT(DISTINCT id) > 1
--Having is used instead of WHERE as the values are aggregate values



-- 183. Customers Who Never Order
SELECT c.name AS Customers

FROM Customers c 

LEFT JOIN Orders o 

ON c.id = o.customerId

WHERE o.id IS NULL
---------------alt way---------
SELECT c.name AS Customers
FROM Customers c 
WHERE c.id NOT IN
(SELECT c.id
FROM Customers c
INNER JOIN Orders o 
ON c.id = o.customerId)

-- 577. Employee Bonus
SELECT e.name, b.bonus

FROM Employee e

LEFT JOIN Bonus b 

ON e.empId = b.empId

WHERE b.bonus < 1000 

OR b.bonus IS NULL

-- 584. Find Customer Referee
SELECT name

FROM Customer 

WHERE referee_id <> 2
-- <> is not equal to symbol in SQL

OR referee_id IS NULL


