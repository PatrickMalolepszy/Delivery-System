### Contract C01: scanItem

#### Operation: scanItem(itemID)

#### Cross References: 

Use Cases: Warehouse Delivery Arrival

#### Preconditions: 

- A customer or manager from another warehouse requests a shipment.
- Requested stock is quantity checked

#### Postcondition:

- Item are loaded on the truck successfully
- Inventory has been correctly updated to reflect new quantity totals
- Item is now associated with the current Transport Vehicle