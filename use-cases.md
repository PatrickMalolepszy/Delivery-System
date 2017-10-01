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
-Scope: Request delivery of materials to location

-Level: Sub Function

-Primary Actor: Custome

-Stakeholders and interest:
1.Company: The store or warehouse wants to receive/send items
2.Driver: The driver has to send the item via boat, plane, or truck(iimplements interface)
3.System: Has to figure out how the items gets to its location and by what methods

-Preconditions: 
1.The customer(Store) has to know what items they are getting and has to be in stock from wherever they are receiving it 
2.Method of delievery has been figuered out by system
3.For simplicity, there will be no external factor for deliever system that could affect delievery(Natural disaster)

-Main success Scenario:
2.System figure out how to send supplies with best route
3.Supply is delievered

-Extensions:
1.Assumption right now is perfect world

-Special Requirements: 
1.Supply has to be in stock( stock supply can not exceed demand )
2.Customer has enought money to pay for the items

-Frequency of Occurence:
1. Depends on the demands of supply. If supply is high the system will be continous. If nobody needs it then they system will be at a stall

2. // Joel put use case here
3. // Patrick put use case here
4. // Jitesh put use case here
