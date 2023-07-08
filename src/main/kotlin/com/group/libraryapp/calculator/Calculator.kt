package com.group.libraryapp.calculator

import java.lang.IllegalArgumentException

class Calculator (
        var number: Int
) {

    fun add(operand: Int){
        this.number += operand
    }

    fun minus(operand: Int){
        this.number -= operand
    }

    fun multiply(operand: Int){
        this.number *= operand
    }

    fun divide(operand: Int){
        if(operand == 0){
            throw IllegalArgumentException("0 으로 나눌 수 없습니다.") // new 지시어를 사용하지 않음
        }
        this.number /= operand
    }
}