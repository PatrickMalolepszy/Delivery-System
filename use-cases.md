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
4. Scope   : Transport Delivery system
  
  Level   : sub function
  
  Primary Actor : Product manager ( one who scan products)
  
  Stakeholders and interests :  
  manager :wants to know how many products came in when does the came in and need to be sccaned into data base for record and which vehicle will have these products ( according to its route) .
   driver: how many products are in his vehicle and what is his route and is there any delicate products need to be handeled properly
   company : what type of products they are having and how efficienly they are delivering it(how many rounds to same place).
   coustomer : when will they recieve there package and when to expect there product and to call person if change in product destination on client is not at location of delivery 
  
  Preconditions:
  Product manager and driver is identified and authenticated 
   Success guarantee: product is scanned and stacked all products of same delivery location and area together . If there will be charges for it or not . product delivered to coustomer on time in right condition and delivery is recorded on system
   Main Success Scenario: 1. product id is selected and searched in warehouse.
   2 product(or products ) are packed with right label and adress .
   3 product is scanned from warehouse and loaded in vehicle .
   4 product reach destination either(client or another ware house to shipped to next location)
   5 step 1-4 is repeated until product reach the coustomer and its recorded on system making cycle complete.
   
   Extensions: Alternative flow : product quantity in database was not right ( might be beacuse it might be broken). and because of it that product is not in warehouse. so have to transfer order to different warehouse location..
   2 Scanning document not working properly
   3 address on product is noted wrong 
   4 wrong product is loaded in wrong vehicle ( now its travelling to diffrent location)
   5 product is misplaced in way of transportation .
   6 vehicle broke (causing delay in  delivery process)
   in any of these cases you have to start process from begging or it happen in between of delivery process then have to follow main success scenarion process from last ware house where any of these incidents happened until product reaches client .
   
   Special Requirement : Realtime tracking system of all drivers to tell astimate time of product delivery and any change in delivery schedule 
   Good and easy to use scanners for products (touch screen preferably)
   Robost system so that we dont lose product information ( shipped or left in warehouse or if out for delivery or delivered ) in case of system failure 
   
   Frequency of Occurrence : COuld be nearly continuous
   Miscellaneos : if product is shipped internationally border clearence can take time . sometimes some product can be illegal in being shipped countries.
   
