/**
 * The Filling class is a subclass of Ingredient
 *      as a subclass, it has a cost [float] which is the overall cost of that ingredient
 *      it also has getCost for that attribute.
 * A Filling begins as...
 *      a list of options
 *      from which one, none, or all are selected
 * Once a Filling is "set" (constructed), it is immutable, and it has...
 *      a cost per element [a float] [protected]
 *      a list which can contain zero, one, or many elements [each is a String]
 *      a getter method to return the list of elements [returns ArrayList of String]
 *      a getter method to return the cost per element [returns float]
 * Elements must all be the same cost per element, otherwise they should be defined as another Ingredient sub-class
 */
public class Filling extends Ingredient {
}
