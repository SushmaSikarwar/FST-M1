select SUM(purchase_amount) AS "Total sum" from orders;

OUTPUT : 
Total sum
17541.18

select AVG(purchase_amount) AS "Average" from orders;

OUTPUT :
Average
1461.765

select MAX(purchase_amount) AS "Maximum" from orders;

OUTPUT :
Maximum
5760

select MIN(purchase_amount) AS "Minumum" from orders;

OUTPUT :
Minumum
65.26