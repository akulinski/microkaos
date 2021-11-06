package pl.akulinski

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("pl.akulinski")
		.start()
}

