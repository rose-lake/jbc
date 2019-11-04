/**
 * The Ingredient class is an abstract class which serves as parent to two subclasses:
 *      Topping (boolean) and Filling (options)
 * The Ingredient class will have a cost. This represents the cost of that ingredient.
 *      if a subclasses extends Ingredient and can actually consist of zero, one, or many components,
 *      then Ingredient's cost will represent the full cost of that Ingredient,
 *      it can be zero (if the Ingredient is empty), it can be the cost of one, or the cost of many...
 * The Ingredient class interface will be...
 *      getCost(), but not setCost, because that is done internally depending on its actual contents
 *      note that cost is set by the child class, once its contents are set
 *
 */
public class Ingredient {

}
