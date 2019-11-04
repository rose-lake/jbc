/**
 * The Topping class is a subclass of Ingredient
 *      as a subclass, it has a cost [float] which is the overall cost of that ingredient
 * A Topping constructor accepts...
 *      a list that is size one
 *      from which one or none are selected
 * Once a Topping is "set" (constructed), it is immutable, and it has...
 *      a list which can contain zero or one elements [String]
 *      a getter method to return the list of elements [returns ArrayList of String, either empty or has one element]
 * Topping does not override or add any cost component (unlike Filling, which does add a costPerElement).
 *      Topping will set the [protected] cost attribute of the parent class
 *      Topping will use the getCost method of the parent class
 */

public class Topping extends Ingredient {
}
