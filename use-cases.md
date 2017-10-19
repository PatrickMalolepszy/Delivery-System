# Delivery System Use Cases:

# Request delivery of materials to location
#### Author: Jose Alba


### Brief Format
The store or warehouse has to request an item which will be processed by a POS system which will create the outline of how the item will be sent to the requested location. This item can be delivered by our 'driver' in either boat, plane, or truck. Once delivered to a warehouse or store it will be approved by the end-user.

### Casual Format

*Main Success Scenario*: A user request an item via the online system, which will implement an escrow system to ensure the trading of items is safe and secure. Once the system confirms that the items are in stock and the user has the minimum funds for the company the system will then determine the best way to deliver items; the delivery of items can happen by either boat, plane, or truck. Once the item is sent out on delivery or system will email back to the end-user if the transaction was complete and how long it should take to deliver. 

*Alternate Scenarios*:

In order for the system to work the customer(store) should not be able to choose an item not currently in stock. This will be accomplished by having flags to check if the stock is not available if this proves true then the item should not be displayed to the end user.

If the demand of an item is higher than the current supply our system should prompt the user and tell them that there aren't enough items in stock. They will then be asked if they want to continue their purchase.

If the customer does not have enough money to purchase an item the escrow system should return the money back to the customer and tell the customer that the transaction failed due to lack of funding. By introducing an escrow system to the system we are ensuring that transactions such as these will not be a problem for our system.


# Receiving Supplier Transport
#### Author: Joel Rorseth


### Brief Format
Transport vehicle from a supplier arrives at the company's location. A warehouse manager/receiver verifies the number of items expected to be received, and the cargo is unloaded. Inventory counts are updated for received items, and confirmation of successful delivery is recorded. Deliveries expecting cargo from this shipment are made aware of new stock totals.


### Casual Format
*Main Success Scenario*: A supplier's transport vehicle arrives at the company location. A warehouse manager checks the delivery, confirming that every item expected to be received by the software has been delivered. Cargo is unloaded, delivery is recorded as being successful. The updated inventory counts make the system aware of new stock to be filled in pending orders.

*Alternate Scenarios:*

If the manager determines that the delivery is missing expected items or is short in quantity, the
cargo is unloaded anyways, however, the software records only the actual amount received into inventory.
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
Transport vehicle arrives at the destination location. A receiver records the time that the delivery has arrived. The transport cargo is unloaded in parts, with each item being recorded into the location's inventory. Once the cargo is fully unloaded a printable receipt is generated to record the successful delivery.

# Warehouse Delivery Departure:
#### Author: Jitesh ( edited by Patrick & Jose)

### Casual Format
*Main Success Scenario*: Warehouse receives a request for a shipment and starts delivery operations. The system looks up each item and provides the location of where the item is stored. Each item is then scanned before it is loaded onto the transport vehicle(s). Once all items have been added to the transport vehicle the system prints a label for the load. The driver will take the label as it will provide instructions on the destination.

*Alternative Scenarios:*
If a product is loaded onto a vehicle it should first be scanned. The system should be able to detect if the item is suppose to be in this vehicle by comparing the address of where the vehicle is going and where the item is suppose to be shipped. If these items have identical address the item should be able to go on the truck; otherwise the system should indicate a flag and tell the worker that it should not be loaded.

Warehouse receives an order to fulfill however has no transport vehicles available as all are in use. The system saves the order to a list which will be prompted to the warehouse workers when a vehicle becomes available for loading.

If the product quantity in the database is incorrect the loaders will not be able to find items needed for shipment. This should be fixed by manually updating the database to its correct quantity. If the order is no longer able to be fulfilled at the current warehouse due to stock change it can be transferred elsewhere.
