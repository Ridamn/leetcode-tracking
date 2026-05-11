-- Last updated: 5/11/2026, 9:58:40 AM
# Write your MySQL query statement below
select Email
from person
group by email
having count(Email)>1;