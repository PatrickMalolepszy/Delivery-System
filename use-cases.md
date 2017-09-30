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
2. Receiving Supplier Transport
Transport vehicle from a supplier arrives at company location. A warehouse manager / receiver verifies the number of
items expected to be received, and the cargo is unloaded. Inventory counts are updated for received items, and confirmation 
of successful delivery is recorded. Deliveries expecting cargo from this shipment are made aware of new stock totals..
3. // Patrick put use case here
4. // Jitesh put use case here
