@file:Suppress("JAVA_MODULE_DOES_NOT_READ_UNNAMED_MODULE" /* TODO remove once https://youtrack.jetbrains.com/issue/KT-35343 is fixed */)

package ch.tutteli.atrium.api.fluent.en_GB.jdk8

import ch.tutteli.atrium.creating.Expect
import ch.tutteli.atrium.domain.builders.ExpectImpl
import java.io.File
import java.nio.file.Path

/**
 * Turns `Expect<File>` into `Expect<Path>`.
 *
 * The transformation as such is not reflected in reporting.
 * Use `feature(File::toPath)` if you want to show the transformation in reporting.
 *
 * @return The newly created [Expect] for the transformed subject.
 *
 * @since 0.9.0
 */
@Deprecated(
    "Use the function from the normal jvm module; the jdk8 extension will be removed with 1.0.0",
    ReplaceWith("this.asPath()", "ch.tutteli.atrium.api.fluent.en_GB.asPath")
)
fun <T : File> Expect<T>.asPath(): Expect<Path> =
    ExpectImpl.changeSubject(this).unreported { it.toPath() }

/**
 * Expects that the subject of the assertion holds all assertions the given [assertionCreator] creates for
 * the subject as [Path].
 *
 * The transformation as such is not reflected in reporting.
 * Use `feature(File::toPath, assertionCreator)` if you want to show the transformation in reporting.
 *
 * @return An [Expect] for the current subject of the assertion.
 *
 * @since 0.9.0
 */
@Suppress("DEPRECATION")
@Deprecated(
    "Use the function from the normal jvm module; the jdk8 extension will be removed with 1.0.0",
    ReplaceWith("this.asPath()", "ch.tutteli.atrium.api.fluent.en_GB.asPath")
)
fun <T : File> Expect<T>.asPath(assertionCreator: Expect<Path>.() -> Unit): Expect<T> =
    apply { asPath().addAssertionsCreatedBy(assertionCreator) }
