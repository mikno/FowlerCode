/**
 *
 *19.05.2014
 *Refactoring-refactoring-Price.java
 * 
 */
package refactoring;

/**
 * @author Michael Knöppler
 * 
 */
abstract class Price {
	abstract int getPriceCode();
}

class ChildrensPrice extends Price {
	@Override
	int getPriceCode() {
		return Movie.CHILDRENS;
	}
}

class NewReleasePrice extends Price {
	@Override
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
}

class RegularPrice extends Price {
	@Override
	int getPriceCode() {
		return Movie.REGULAR;
	}
}