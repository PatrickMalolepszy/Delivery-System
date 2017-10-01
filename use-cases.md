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
2. // Joel put use case here
3. // Patrick put use case here
4. Warehouse Delivery Departure: 
1. Product id is selected and searched in warehouse.
2. Product(or products ) are packed with right label and address.
3. Product is scanned from warehouse and loaded in vehicle.
4. Product reach destination either(client or another ware house to shipped to next location)
5. Step 1-4 is repeated until product reach the customer and its recorded on system making cycle complete.
