package com.kotlin.specs

fun main(args: Array<String>) {
    println("Hello, World")
    somthing()
}

fun somthing() {
    /**
     * Spec #1: No type promotion allowed in Kotlin
     * As an example, Int can't be assigned to Long, only explicit types can be assigned
     */
    val x = 42
    val l: Long = x.toLong()

    /**
     * Spec #2: Kotlin encodes nullability into the type system, so by default null is not allowed
     */
//    val s: String = null // Compiler error null cannot be a value of non-null type String

    /**
     * Spec #3: Null value into a type can be assigned explicitly with '?'
     * Giving the hint that this property can be null
     */
    val s1: String? = "It's me" // To allow null
    if (s1 != null)
        println(s1)

    /**
     * Spec #4: Do something only when not null
     */
    val s2: String? = "blah"
    val s3 = s2?.toUpperCase()
    println(s3)

    val s4: String? = null
    s4?.let { it ->
        val s5 = it
        print(s5)
    }

    /**
     * Spec #5: Print without concatenation and by embedding
     */
    val age = 100
    println("My age is $age")  // no curly braces required

    val something = 100
    println("My age is ${something.toLong()}") // curly braces required

    /**
     * Spec #6: Multi line printing
     */
    println("""This is me.
        |And am doing kotlin programming there
        |See you soon !
    """.trimMargin())

    /**
     * Spec #7: Arrays
     */
    val array = arrayOf(3,3,2)
    val array1 = arrayOf(2L, 3.toDouble())

    /**
     * Spec #8: Kotlin property has two major prefix - val and var
     * var is mutable
     * val is immutable
     */
    var s = 10
}