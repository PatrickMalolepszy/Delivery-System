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
   Case name life cycle of product
4. 
#### Scope: Transport Delivery system
  
#### Level: Sub Function
  
#### Primary Actor: Product Manager ( one who scan products)
  
#### Stakeholders and interests :  
1. Manager: Wants to know how many products came in when does the came in and need to be scanned into data base for record and which vehicle will have these products ( according to its route) .
2. Driver: How many products are in his vehicle and what is his route and is there any delicate products need to be handled properly
3. Company: What type of products they are having and how efficiency they are delivering it (how many rounds to same place).
4. Customer: When will they receive there package and when to expect there product and to call person if change in product destination on client is not at location of delivery 

#### Preconditions:
Product manager and driver is identified and authenticated 
Success guarantee: product is scanned and stacked all products of same delivery location and area together . If there will be charges for it or not . product delivered to customer on time in right condition and delivery is recorded on system

#### Main Success Scenario: 
1. Product id is selected and searched in warehouse.
2. Product(or products ) are packed with right label and address.
3. Product is scanned from warehouse and loaded in vehicle.
4. Product reach destination either(client or another ware house to shipped to next location)
5. Step 1-4 is repeated until product reach the customer and its recorded on system making cycle complete.

#### Extensions: Alternative flow : 
1. Product quantity in database was not right ( might be because it might be broken). and because of it that product is not in warehouse. so have to transfer order to different warehouse location.
2. Scanning document not working properly
3. Address on product is noted wrong 
4. Wrong product is loaded in wrong vehicle ( now its travelling to different location)
5. Product is misplaced in way of transportation .
6. vehicle broke (causing delay in  delivery process)
in any of these cases you have to start process from begging or it happen in between of delivery process then have to follow main success scenarios process from last ware house where any of these incidents happened until product reaches client .

#### Special Requirement : Real time tracking system of all drivers to tell estimate time of product delivery and any change in delivery schedule 
Good and easy to use scanners for products (touch screen preferably)
Robust system so that we dont lose product information ( shipped or left in warehouse or if out for delivery or delivered ) in case of system failure 

#### Frequency of Occurrence : Could be nearly continuous
Miscellaneous: If product is shipped internationally border clearance can take time. Sometimes some product can be illegal in being shipped countries.
