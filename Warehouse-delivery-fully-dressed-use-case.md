# Case Name: Warehouse Delivery Departure.

### Scope: 
Transport Delivery System

### Level: 
Sub-Function

### Primary Actor: 
Warehouse Worker
 
### Stakeholders and Interests:

*Warehouse Manager:* Should know the amount of products that come in and out of the warehouse. This will be done by scanning in items and storing  it into a database. The manager should always be up-to-date with any information regarding the warehouse.

*Driver:* The driver needs to know what the number of items in their load and if there are any products which need special care. For example delicate products or overweight packages.

*Customer:* The customer should know any information regarding the item they have requested. For example they should know the estimated date when the item is suppose to arrive.
 
### Preconditions:
Warehouse is open, operational, and the driver should have arrived in order for the supply to be shipped to end-user.

### Success guarantee: 
System records receipt of loading of delivery vehicle. The inventory of the warehouse is updated to account for the items leaving. The driver receives all information required to deliver the load.
 
### Main Success Scenario:
1. Warehouse receives a request for a shipment and starts delivery operations. 
2. The system looks up each item and provides the location of where the item is stored. 
3. Each item is then scanned before it is loaded onto the transport vehicle(s). 
4. Repeat 2-3 until all items are loaded.
5. System prints a summary for the load. 
6. The driver will take a copy of the summary as it will provide their delivery instructions.
   
### Extensions:
If a product is loaded onto a vehicle it should first be scanned. The system should be able to detect if the item is suppose to be in this vehicle by comparing the address of where the vehicle is going and where the item is suppose to be shipped. If these items have identical address the item should be able to go on the truck; otherwise the system should indicate a flag and tell the worker that it should not be loaded.

Warehouse receives an order to fulfill however has no transport vehicles available as all are in use. The system saves the order to a list which will be prompted to the warehouse workers when a vehicle becomes available for loading.

If the product quantity in the database is incorrect the loaders will not be able to find items needed for shipment. This should be fixed by manually updating the database to its correct quantity. If the order is no longer able to be fulfilled at the current warehouse due to stock change it can be transferred elsewhere.

If an item is broken when loaded the workers should get another item from the stock. If this does happen the database should be decremented. If there are no more items the system should update the order to the customer and tell them that the item will be delayed due to internal issues. 

### Special Requirement: 

A computer to run the system on. Preferred one with enough power to handle the software and a reliable make. 

Technology and Data Variations List:

Scanners to scan items into the delivery vehicles.

Frequency of Occurrence: This could be nearly continuous as items can always be shipped during operating times. This depends on the demand of an item; if it has a high demand rate the system should be running continuously. 

### Miscellaneous:

*Open Issues:*
What to do when product needs to travel internationally? Eg duties, border clearances, foreign money exchange etc.
Should the warehouse be able to shut down in the midst of loading a delivery?
Explore options for backup and recovery of systems.
