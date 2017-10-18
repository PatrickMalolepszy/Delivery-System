# Delivery System

## Example Domain Objects:

### Transport:
- driver
- cost / km
- speed
- weight capacity
#### Example Transport implementations:
- Boat
- Airplane
- Truck  

### Driver
- name
- age
- years experience
- Type of license (boat, airplane, etc...)

### Cargo:
- list of items
- total weight
- total price

### Item
- has weight
- name
- quantity
- price
- id

### Shipping & Receiving
- Store
- Warehouse
- Supplier (only deliver)
#### Example properties
- stock of items
- owner
- location

### Payment
- debit
- cash
- credit
- crypto? (etc)

# Use Cases:


## Scope: Request delivery of materials to location

### Level: Sub-Function

### Primary Actor: Customers

### Stakeholders and interest:
1. Company: The store or warehouse wants to receive/send items
2. Driver: The driver has to send the item via boat, plane, or truck(implements interface)
3. System: Has to figure out how the items will get to the location it is assigned and by what methods

### Preconditions: 
1. The customer(Store) has to know what items they will request and this item has to be in stock from wherever they are receiving it 
2. Method of delivery has been figured out by system
3. For simplicity, there will be no external factor for delivery system that could affect delivery(etc Natural disaster)

### Main Success Scenario:
1. User demands equipment(For example user might want 5,000 bananas)
2. System figure out how to send supplies with the best route
3. Supply is delivered

### Extensions:
1.Assumption right now is perfect world

### Special Requirements: 
1.Supply has to be in stock( stock supply cannot exceed demand )
2.Customer has to have enough money to pay for the items requested

### The frequency of Occurrence:
1. Demand vs supply, if supply is high the system will be continuous. If nobody needs it then the system will be at a stall


# Receiving Supplier Transport
#### Author: Joel Rorseth


### Brief Format
Transport vehicle from a supplier arrives at company location. A warehouse manager / receiver verifies 
the number of items expected to be received, and the cargo is unloaded. Inventory counts are updated 
for received items, and confirmation of successful delivery is recorded. Deliveries expecting cargo 
from this shipment are made aware of new stock totals.


### Casual Format
*Main Success Scenario*: A supplier's transport vehicle arrives at the company location. A warehouse
manager checks the delivery, confirming that every item expected to be received by the software has 
been delivered. Cargo is unloaded, delivery is recorded as being successful. The updated inventory
counts make the system aware of new stock to be filled in pending orders.

*Alternate Scenarios:*

If the manager determines that the delivery is missing expected items or is short in quantity, the
cargo is unloaded anyways, however the software records only the actual amount received into inventory.
A note or flag is set in the system to denote the shortage in expected inventory.

If the manager determines that the delivery contains extra items or its quantity is in excess, then all
cargo except for any excess is unloaded and recorded accurately into the inventory system. 

If the manager determines that the delivery is missing some items *and* has also brought along extra items,
only the amount anticipated by the delivery system is unloaded, with any excess being left on the truck.
A note or flag is set in the system to denote the shortage in expected inventory.

If the software system crashes or becomes unresponsive at any point, the delivery is received in full, or
to the best of the manager's ability in regards to known stock totals. When working once again, the shipment
is recorded with proper totals, which have been recorded by hand.


# Receive Shipment:
Transport vehicle arrives at destination location. A receiver records the time that the delivery has arrived. The transport cargo is unloaded in parts, with each item being recorded into the location's inventory. Once the cargo is fully unloaded a printable receipt is generated to record the successful delivery.

# Warehouse Delivery Departure: 
1. Product id is selected and searched in warehouse.
2. Product(or products ) are packed with right label and address.
3. Product is scanned from warehouse and loaded in vehicle.
4. Product reach destination either(client or another ware house to shipped to next location)
5. Step 1-4 is repeated until product reach the customer and its recorded on system making cycle complete.
