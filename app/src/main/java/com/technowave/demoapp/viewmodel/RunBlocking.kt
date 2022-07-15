package com.technowave.demoapp.viewmodel


import kotlin.reflect.KProperty


fun main() {



    val name:String by MyDelegate("syed")
    println(name)

}

class MyDelegate(private val name:String){

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}


