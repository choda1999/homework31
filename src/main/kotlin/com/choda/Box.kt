package com.choda.kotlin

import java.util.*


fun main(args: Array<String>) {
    val box3 = Box3()
    val box5 = Box5()
    val scanner = Scanner(System.`in`)
    print("Please enter the object's length:")
    val length = scanner.nextFloat()
    print("Please enter the object's width:")
    val width = scanner.nextFloat()
    print("please enter the object's height:")
    val height = scanner.nextInt()

    if (box3.validate(length, width, height)) {
        println("Box3")
    }else if (box5.validate(length, width, height)) {
        println("Box5")
    }else{
        println("no box")
    }
}

open class Box(var length: Float,var width: Float,var height: Int){

    fun validate(L: Float,W: Float,H: Int):Boolean{

        var length = L
        var width = W
        var height = H

        while (length < width || width < height){
            if (length < width) {
                val p = length
                length = width
                width = p
            }else if (width < height){
                val p = width
                width = height.toFloat()
                height = Math.ceil(p.toDouble()).toInt()
            }
        }
//        println("length:$length,width:$width,height:$height")
        return (this.length>=length && this.width>=width && this.height>=height)
    }
}

class Box3():Box(24.0f, 14.0f, 13){

}

class  Box5():Box(39.5f,27.5f,23){

}