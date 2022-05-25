UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

OUTPUT : 1 row(s) updated.

UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

OUTPUT : 0 row(s) updated.

UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

OUTPUT : 1 row(s) updated.

SELECT * FROM salesman;

OUTPUT : 6 rows selected.

SALESMAN_ID	SALESMAN_NAME	SALESMAN_CITY	COMISSION	GRADE
    5001	James Hoot	        New York	    15	     100
    5005	Pit Alex	        London	        11	     100
    5006	Pierre	            Paris	        14	     100
    5007	Paul Adam	        Rome	        13	     200
    5003	Lauson Hen	        San Jose	    12	     100
    5008	James Houston	    London	        18	     100