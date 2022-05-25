SELECT customer_id, customer_name FROM customers a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id)
UNION
SELECT salesman_id, a.salesman_name FROM salesman a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id)
ORDER BY customer_name;

OUTPUT : 5 rows selected.
CUSTOMER_ID	CUSTOMER_NAME
    3009	Geoff Cameron
    3005	Graham Zusi
    5001	James Hoot
    5003	Lauson Hen
    3002	Nick Rimando


SELECT a.salesman_id, a.salesman_name, order_no, 'highest on', order_date FROM salesman a, orders b
WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date)
UNION
SELECT a.salesman_id, a.salesman_name, order_no, 'lowest on', order_date FROM salesman a, orders b
WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);

OUTPUT : 12 rows selected.
SALESMAN_ID	SALESMAN_NAME	ORDER_NO	'HIGHESTON'	ORDER_DATE
    5001	James Hoot	    70002	    lowest on	 05-OCT-12
    5001	James Hoot	    70005	    highest on	 27-JUL-12
    5001	James Hoot	    70005	    lowest on	 27-JUL-12
    5001	James Hoot	    70008	    highest on	 15-AUG-12
    5001	James Hoot	    70008	    lowest on	 15-AUG-12
    5001	James Hoot	    70013	    highest on	 25-APR-12
    5001	James Hoot	    70013	    lowest on	 25-APR-12
    5003	Lauson Hen	    70003	    highest on	 10-OCT-12
    5003	Lauson Hen	    70004	    highest on	 17-AUG-12
    5005	Pit Alex	    70009	    lowest on	 10-SEP-12
    5006	Pierre	        70010	    lowest on	 10-OCT-12
    5007	Paul Adam	    70011	    lowest on	 17-AUG-12