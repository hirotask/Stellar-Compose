package com.github.hirotask

@MustBeDocumented
@Retention(AnnotationRetention.BINARY)
@Target(
    // @Composable fun foo() { ... }
    AnnotationTarget.FUNCTION,
    // foo: @Composable () -> Unit
    AnnotationTarget.TYPE,
    // foo: (@Composable () -> Unit) -> Unit
    AnnotationTarget.TYPE_PARAMETER,
    // val foo: Int @Composable get() { ... }
    AnnotationTarget.PROPERTY_GETTER
)
annotation class Composable
