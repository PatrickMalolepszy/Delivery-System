## 60-322: Assignment 4 Part 2

### Q3

**Jose 50%, Jitesh 50%, edited by Patrick and Joel**

Please see the folder Q3 for the three interaction diagrams.

### Q4

**Joel 75%, Patrick 25%**

DCD provided in folder Q4

### Q5

**Patrick 75%, Joel 25%**

Code provided under src folder. Java jar executable located at src/artifacts. Run the java jar with the following command:

```
java -jar Delivery-System.jar
```

The following is an example run through:

```
----Warehouse Menu----
Please select one of the following:
1: See pending orders
2: Start loading order
3: Shutdown system
1
orderId='2ff1c016', 
items=[{quantity=2, 
	description=
	itemId='4327', 
	description:'desk', 
	price=342.98, 
	warehouseLocation='5RD'}}, 
, {quantity=6, 
	description=
	itemId='6537', 
	description:'pen', 
	price=5.32, 
	warehouseLocation='7DF'}}, 
, {quantity=12, 
	description=
	itemId='9735', 
	description:'pencil', 
	price=2.1, 
	warehouseLocation='1SD'}}, 
, {quantity=6, 
	description=
	itemId='1234', 
	description:'paper', 
	price=23.14, 
	warehouseLocation='2FB'}}, 
], 
customer=name='Joe Smith'}, 
source=streetAddr='432 Miller St. Victoria', country='CAN', province='BC'}, 
destination=streetAddr='123 St. John St. W Windsor', country='CAN', province='ON'}, 
trackingNumber='1349652d', 
orderedOn=Mon Nov 20 19:06:23 EST 2017}
----Warehouse Menu----
Please select one of the following:
1: See pending orders
2: Start loading order
3: Shutdown system
2
Please enter the order id you would like to start loading:
2ff1c016
Please load one of the following items:
id: 1234, quantity: 6, description: paper, location: 2FB
id: 6537, quantity: 6, description: pen, location: 7DF
id: 9735, quantity: 12, description: pencil, location: 1SD
id: 4327, quantity: 2, description: desk, location: 5RD
Please enter item id that has been loaded:
1234
How many did you load?
8
Looks like you loaded too many items! Please remove 2 items
Please load one of the following items:
id: 6537, quantity: 6, description: pen, location: 7DF
id: 9735, quantity: 12, description: pencil, location: 1SD
id: 4327, quantity: 2, description: desk, location: 5RD
Please enter item id that has been loaded:
6537
How many did you load?
3
Please load one of the following items:
id: 6537, quantity: 3, description: pen, location: 7DF
id: 9735, quantity: 12, description: pencil, location: 1SD
id: 4327, quantity: 2, description: desk, location: 5RD
Please enter item id that has been loaded:
6537
How many did you load?
3
Please load one of the following items:
id: 9735, quantity: 12, description: pencil, location: 1SD
id: 4327, quantity: 2, description: desk, location: 5RD
Please enter item id that has been loaded:
9735
How many did you load?
12
Please load one of the following items:
id: 4327, quantity: 2, description: desk, location: 5RD
Please enter item id that has been loaded:
4327
How many did you load?
4
Looks like you loaded too many items! Please remove 2 items

You are finished order #2ff1c016
----Warehouse Menu----
Please select one of the following:
1: See pending orders
2: Start loading order
3: Shutdown system
3
```

