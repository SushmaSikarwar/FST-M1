
SELECT salesman_id, salesman_city FROM salesman;

OUTPUT : 6 rows selected.

SALESMAN_ID	SALESMAN_CITY
    5001	New York
    5005	London
    5006	Paris
    5007	Rome
    5003	San Jose
    5008	London


SELECT * FROM salesman WHERE salesman_city='Paris';

OUTPUT : 

SALESMAN_ID	SALESMAN_NAME	SALESMAN_CITY	COMISSION
    5006	    McLyon	            Paris	        14



SELECT salesman_id, comission FROM salesman WHERE salesman_name='Paul Adam';

OUTPUT :

SALESMAN_ID	COMISSION
    5007	13