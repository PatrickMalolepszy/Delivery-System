# Case Name: Warehouse Delivery Departure.

### Scope:
Transport Delivery System

### Level:
Sub-Function

### Primary Actor:
Warehouse Worker

### Stakeholders and Interests:

*Warehouse Manager:* The manager should know the amount of products that come in and out of the warehouse. This will be done by scanning in items and storing  it into an SQL database. The manager should always be up-to-date with any information regarding the warehouse. The manager should be able to detect if there is a problem with the system and analyze the situation.

*Driver:* The driver needs to know what the number of items in their load and if there are any products which need special care. For example delicate products or overweight packages. The driver will deliver item from point A to B.

*Customer:* The customer should know any information regarding the item they have requested. For example they should know the estimated date when the item is suppose to arrive. The customer should be able to cancel request before item has been shipped to user.

### Preconditions:
- Warehouse is open, operational, and the driver should have arrived in order for the supply to be shipped to end-user.
- No external issues like a natural disaster.
- A user request an item via the online system, which will implement an escrow system to ensure the trading of items is safe and secure. Once the system confirms that the items are in stock and the user has the minimum funds for the company the system will then determine the best way to deliver items; the delivery of items can happen by either boat, plane or truck. Once item is sent out on delivery or system will email back to the end-user if the transaction was complete and how long it should take to deliver

### Success guarantee:
System records receipt of loading of delivery vehicle. The inventory of the warehouse is updated to account for the items leaving. The driver receives all information required to deliver the load. The driver should update the system once the customer has received their package to ensure packages are delivered and customer is pleased with delivery service.

### Main Success Scenario:
1. Warehouse receives a request for a shipment and starts delivery operations.
2. The system looks up each item and provides the location of where the item is stored.
3. Each item is then scanned before it is loaded onto the transport vehicle(s).
4. If items require special treatment it should be taking care of at this stage.
5. Repeat 2-4 until all items are loaded.
6. System prints a summary for the load.
7. The driver will take a copy of the summary as it will provide their delivery instructions.

* The main.main success scenario should occur with almost every delivery. The extensions are exception and deal with any external problems, because of this our extensions can technically be part of our main.main success scneario if the issue occurs*

### Extensions:
If a product is loaded onto a vehicle it should first be scanned. The system should be able to detect if the item is suppose to be in this vehicle by comparing the address of where the vehicle is going and where the item is suppose to be shipped. If these items have identical address the item should be able to go on the truck; otherwise the system should indicate a flag and tell the worker that it should not be loaded.

Warehouse receives an order to fulfill however has no transport vehicles available as all are in use. The system saves the order to a list which will be prompted to the warehouse workers when a vehicle becomes available for loading.

If the product quantity in the database is incorrect the loaders will not be able to find items needed for shipment. This should be fixed by manually updating the database to its correct quantity. If the order is no longer able to be fulfilled at the current warehouse due to stock change it can be transferred elsewhere.

If an item is broken when loaded the workers should get another item from the stock. If this does happen the database should be decremented. If there are no more items the system should update the order to the customer and tell them that the item will be delayed due to internal issues.

If item requires external treatment like bubble wrap and it is not currently available. The system should create a request/flag for more bubble wrap. This should be a top priority as items would not be delivered until these requirements are meet. Once the external item is in stock the delievery should continue from its last step. If external requirements will take time to be in stock the customer will receive a notification with the new expected delivery date.

### Special Requirement:

A computer to run the system on. Preferred one with enough power to handle the software and a reliable make. This computer is going to be dealing with large data sets and user information so it should have a secure network and it should be quick in order to meet customer approval.

Technology and Data Variations List:

Scanners to scan items into the delivery vehicles.
Computer that stores and calculates information

Frequency of Occurrence: This could be nearly continuous as items can always be shipped during operating times. This depends on the demand of an item; if it has a high demand rate the system should be running continuously.

### Miscellaneous:

*Open Issues:*
What to do when product needs to travel internationally? Eg duties, border clearances, foreign money exchange etc.
Should the warehouse be able to shut down in the midst of loading a delivery?
Explore options for backup and recovery of systems.

### Reasons for choosing use case:

Our group decided to make a fully dressed use case for the warehouse delivery system as it implements the most important features in our system. It is diverse enough where all the important features of the other use-cases is also  implemented in this use-case. This use-case also explains the most important details of our system: as it ranges from the request the customer has to make, to how the item will be picked from the manufacturing warehouse, and how the item is delivered to the customer. This use-case explains the general idea of our project and how it works.

### Reasons we updated this use case:

Our previous use-case lacked the information in order to portray an idea of the warehouse delivery system. We wanted to make our use-case easily easily legible and linear in the sense that our use case does not create any ambiguity for anybody else reading the use-case. In order to ensure the information is portrayed correctly we added additional information to our previous scenario from our last submission.

