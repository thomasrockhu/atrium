// TODO remove file with 1.0.0
@file:Suppress("DEPRECATION", "TYPEALIAS_EXPANSION_DEPRECATION")

package ch.tutteli.atrium.assertions

import ch.tutteli.atrium.creating.AssertionPlant
import ch.tutteli.atrium.domain.builders.AssertImpl
import ch.tutteli.atrium.domain.builders.bigDecimal
import java.math.BigDecimal

@Deprecated("Use AssertImpl.bigDecimal.isNumericallyEqualTo; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.bigDecimal.isNumericallyEqualTo(plant, expected)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : BigDecimal> _isNumericallyEqualTo(plant: AssertionPlant<T>, expected: T)
    = AssertImpl.bigDecimal.isNumericallyEqualTo(plant, expected)

@Deprecated("Use AssertImpl.bigDecimal.isNotNumericallyEqualTo; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.bigDecimal.isNotNumericallyEqualTo(plant, expected)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : BigDecimal> _isNotNumericallyEqualTo(plant: AssertionPlant<T>, expected: T)
    = AssertImpl.bigDecimal.isNotNumericallyEqualTo(plant, expected)

@Deprecated("Use AssertImpl.bigDecimal.isEqualIncludingScale; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.bigDecimal.isEqualIncludingScale(plant, expected, nameOfIsNumericallyEqualTo)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : BigDecimal> _isEqualIncludingScale(plant: AssertionPlant<T>, expected: T, nameOfIsNumericallyEqualTo: String): Assertion
    = AssertImpl.bigDecimal.isEqualIncludingScale(plant, expected, nameOfIsNumericallyEqualTo)

@Deprecated("Use AssertImpl.bigDecimal.isNotEqualIncludingScale; will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.bigDecimal.isNotEqualIncludingScale(plant, expected)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : BigDecimal> _isNotEqualIncludingScale(plant: AssertionPlant<T>, expected: T)
    = AssertImpl.bigDecimal.isNotEqualIncludingScale(plant, expected)
