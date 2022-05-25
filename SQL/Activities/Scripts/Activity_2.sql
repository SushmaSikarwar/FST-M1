INSERT INTO salesman VALUES(5001, 'James Hoot','New York', 15);

OUTPUT : 1 row(s) inserted.


INSERT INTO salesman (salesman_id,salesman_name, salesman_city,comission 
 )  
	VALUES  
	    (5005,'Pit Alex','London',11), 
        (5006,'McLyon','Paris',14), 
        (5007,'Paul Adam','Rome',13), 
        (5003,'Lauson Hen','San Jose',12),
		(5008,'James Houston','London',18);

OUTPUT : 5 row(s) inserted.

SELECT * FROM salesman;

OUTPUT : 6 rows selected.

SALESMAN_ID	SALESMAN_NAME	SALESMAN_CITY	COMISSION
    5005	   Pit Alex	        London	        11
    5006	   McLyon	        Paris	        14
    5007	   Paul Adam	    Rome	        13
    5001	   James Hoot	    New York	    15
    5003	   Lauson Hen	    San Jose	    12
    5008	   James Houston	London	        18