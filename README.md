# Warehousing

The exercise template contains a class Warehouse, which has the following constructors and methods:

public Warehouse(double capacity) - Creates an empty warehouse, which has the capacity provided as a parameter; an invalid capacity (<=0) creates a useless warehouse, with the the capacity 0.
public double getBalance() - Returns the balance of the warehouse, i.e. the capacity which is taken up by the items in the warehouse.
public double getCapacity() - Returns the total capacity of the warehouse (i.e. the one that was provided in the constructor).
public double howMuchSpaceLeft() - Returns a value telling how much space is left in the warehouse.
public void addToWarehouse(double amount) - Adds the desired amount to the warehouse; if the amount is negative, nothing changes, and if everything doesn't fit, then the warehouse is filled up and the rest is "thrown away" / "overflows".
public double takeFromWarehouse(double amount) - Take the desired amount from the warehouse. The method returns much we actually get. If the desired amount is negative, nothing changes and we return 0. If the desired amount is greater than the amount the warehouse contains, we get all there is to take and the warehouse is emptied.
public String toString() - Returns the state of the object represented as a string like this balance = 64.5, space left 123.5
