package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import com.example.calculadora.utils.constants.Companion.EMPTY
import com.example.calculadora.utils.constants.Companion.INTERLIN
import com.example.calculadora.utils.constants.Companion.SPACE

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var value1 = EMPTY
        var value2 = EMPTY
        var total_view = EMPTY
        var flag = 0
        var operator = 0
        var total1 = 0.0
        var total2 = 0.0



        b_equal.setOnClickListener {
            if (flag == 0){
                screen.text = value1
                value1 = EMPTY
            }
            total2 = value2.toDouble()
            if (flag == 1 && operator == 1) {
                total2 = value2.toDouble()
                screen.text = (total1 + total2).toString()
                value1 = EMPTY
                value2 = EMPTY
                flag = 0
                operator = 0
                total1 = 0.0
                total2 = 0.0
            }

            if (flag == 1 && operator == 2) {
                total2 = value2.toDouble()
                screen.text = (total1 - total2).toString()
                value1 = EMPTY
                value2 = EMPTY
                flag = 0
                operator = 0
                total1 = 0.0
                total2 = 0.0
            }

            if (flag == 1 && operator == 3) {
                total2 = value2.toDouble()
                screen.text = (total1 * total2).toString()
                value1 = EMPTY
                value2 = EMPTY
                flag = 0
                operator = 0
                total1 = 0.0
                total2 = 0.0
            }

            if (flag == 1 && operator == 4) {
                total2 = value2.toDouble()
                screen.text = (total1 / total2).toString()
                value1 = EMPTY
                value2 = EMPTY
                flag = 0
                operator = 0
                total1 = 0.0
                total2 = 0.0
            }
        }

        b_plus.setOnClickListener {
            operator = 1
            if (flag == 1) {
                Toast.makeText(
                    this,
                    getString(R.string.msg_info), Toast.LENGTH_SHORT).show()
            }
            if (flag == 0){
                total1 = value1.toDouble()
                value1 = value1 + SPACE + "+" + SPACE
                total_view = value1 + value2
                screen.text = total_view
                flag = 1
            }
        }

        b_min.setOnClickListener {
            operator = 2
            if (flag == 1) {
                Toast.makeText(
                    this,
                    getString(R.string.msg_info), Toast.LENGTH_SHORT).show()
            }
            if (flag == 0){
                total1 = value1.toDouble()
                value1 = value1 + SPACE + "-" + SPACE
                total_view = value1 + value2
                screen.text = total_view
                flag = 1
            }
        }

        b_times.setOnClickListener {
            operator = 3
            if (flag == 1) {
                Toast.makeText(
                    this,
                    getString(R.string.msg_info), Toast.LENGTH_SHORT).show()
            }
            if (flag == 0){
                total1 = value1.toDouble()
                value1 = value1 + SPACE + "*" + SPACE
                total_view = value1 + value2
                screen.text = total_view
                flag = 1
            }
        }

        b_div.setOnClickListener {
            operator = 4
            if (flag == 1) {
                Toast.makeText(
                    this,
                    getString(R.string.msg_info), Toast.LENGTH_SHORT).show()
            }
            if (flag == 0){
                total1 = value1.toDouble()
                value1 = value1 + SPACE + "/" + SPACE
                total_view = value1 + value2
                screen.text = total_view
                flag = 1
            }
        }

        b_point.setOnClickListener {
            if (flag == 0){
                value1 = value1 + "."
            }

            if (flag == 1) {
                value2 = value2 + "."
            }

            total_view = value1 + value2
            screen.text = total_view
        }

        b_0.setOnClickListener {
            if (flag == 0){
                value1 = value1 + "0"
            }

            if (flag == 1) {
                value2 = value2 + "0"
            }

            total_view = value1 + value2
            screen.text = total_view
        }

        b_1.setOnClickListener {
            if (flag == 0){
                value1 = value1 + "1"
            }

            if (flag == 1) {
                value2 = value2 + "1"
            }

            total_view = value1 + value2
            screen.text = total_view
        }

        b_2.setOnClickListener {
            if (flag == 0){
                value1 = value1 + "2"
            }

            if (flag == 1) {
                value2 = value2 + "2"
            }

            total_view = value1 + value2
            screen.text = total_view
        }

        b_3.setOnClickListener {
            if (flag == 0){
                value1 = value1 + "3"
            }

            if (flag == 1) {
                value2 = value2 + "3"
            }

            total_view = value1 + value2
            screen.text = total_view
        }

        b_4.setOnClickListener {
            if (flag == 0){
                value1 = value1 + "4"
            }

            if (flag == 1) {
                value2 = value2 + "4"
            }

            total_view = value1 + value2
            screen.text = total_view
        }

        b_5.setOnClickListener {
            if (flag == 0){
                value1 = value1 + "5"
            }

            if (flag == 1) {
                value2 = value2 + "5"
            }

            total_view = value1 + value2
            screen.text = total_view
        }

        b_6.setOnClickListener {
            if (flag == 0){
                value1 = value1 + "6"
            }

            if (flag == 1) {
                value2 = value2 + "6"
            }

            total_view = value1 + value2
            screen.text = total_view
        }

        b_7.setOnClickListener {
            if (flag == 0){
                value1 = value1 + "7"
            }

            if (flag == 1) {
                value2 = value2 + "7"
            }

            total_view = value1 + value2
            screen.text = total_view
        }

        b_8.setOnClickListener {
            if (flag == 0){
                value1 = value1 + "8"
            }

            if (flag == 1) {
                value2 = value2 + "8"
            }

            total_view = value1 + value2
            screen.text = total_view
        }

        b_9.setOnClickListener {
            if (flag == 0){
                value1 = value1 + "9"
            }

            if (flag == 1) {
                value2 = value2 + "9"
            }

            total_view = value1 + value2
            screen.text = total_view
        }




    }
}
