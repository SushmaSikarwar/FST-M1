SELECT * FROM orders
WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

OUTPUT : 4 rows selected.
ORDER_NO	PURCHASE_AMOUNT	ORDER_DATE	CUSTOMER_ID	SALESMAN_ID
    70002	    65.26	    05-OCT-12	    3002	5001
    70005	    2400.6	    27-JUL-12	    3007	5001
    70008	    5760	    15-AUG-12	    3002	5001
    70013	    3045.6	    25-APR-12	    3002	5001


SELECT * FROM orders
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='New York');

OUTPUT : 4 rows selected.
ORDER_NO	PURCHASE_AMOUNT	ORDER_DATE	CUSTOMER_ID	SALESMAN_ID
    70002	    65.26	    05-OCT-12	    3002	5001
    70005	    2400.6	    27-JUL-12	    3007	5001
    70008	    5760	    15-AUG-12	    3002	5001
    70013	    3045.6	    25-APR-12	    3002	5001


SELECT grade, COUNT(*) FROM customers
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

OUTPUT : 2 rows selected.
GRADE	COUNT(*)
  200	  3
  300	  3

SELECT order_no, purchase_amount, order_date, salesman_id FROM orders
WHERE salesman_id IN( SELECT salesman_id FROM salesman
WHERE comission=( SELECT MAX(comission) FROM salesman));

OUTPUT : no data found