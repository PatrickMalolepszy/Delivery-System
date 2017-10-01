# Delivery System

## Domain Objects:

### Transport:
- driver
- cost / km
- speed
- weight capacity
#### Example Transport implementations:
- Boat
- Airplane
- Truck
- Drones?   

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

## User Cases

### examples:
- Request delivery of materials to location (customer story)
- Add materials to inventory on transport arrival (warehouse manager story)
- Delivery fulfilled from location X to Y (driver story)
- Items being added to warehouse from supplier

1. // Jose put use case here
##Scope: Request delivery of materials to location

###Level: Sub-Function

###Primary Actor: Customers

###Stakeholders and interest:
1.Company: The store or warehouse wants to receive/send items
2.Driver: The driver has to send the item via boat, plane, or truck(implements interface)
3.System: Has to figure out how the items will get to the location it is assigned and by what methods

###Preconditions: 
1.The customer(Store) has to know what items they will request and this item has to be in stock from wherever they are receiving it 
2.Method of delivery has been figured out by system
3.For simplicity, there will be no external factor for delivery system that could affect delivery(etc Natural disaster)

###Main Success Scenario:
1.User demands equipment(For example user might want 5,000 bananas)
2.System figure out how to send supplies with the best route
3.Supply is delivered

###Extensions:
1.Assumption right now is perfect world

###Special Requirements: 
1.Supply has to be in stock( stock supply cannot exceed demand )
2.Customer has to have enough money to pay for the items requested

###The frequency of Occurrence:
1. Demand vs supply, if supply is high the system will be continuous. If nobody needs it then the system will be at a stall

2. // Joel put use case here
3. Receive Shipment:
Transport vehicle arrives at destination location. A receiver records the time that the delivery has arrived. The transport cargo is unloaded in parts, with each item being recorded into the location's inventory. Once the cargo is fully unloaded a printable receipt is generated to record the successful delivery.
4. // Jitesh put use case here
