package com.example.calcultorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var one:Button
    private lateinit var two:Button
    private lateinit var three:Button
    private lateinit var four:Button
    private lateinit var fife :Button
    private lateinit var six : Button
    private lateinit var seven:Button
    private lateinit var eight :Button
    private lateinit var nine :Button
    private lateinit var zero :Button
    private lateinit var equel:Button
    private lateinit var sum : Button
    private lateinit var min : Button
    private lateinit var mult : Button
    private lateinit var div : Button
    private lateinit var del : Button
    private lateinit var c : Button
    private lateinit var point : Button
    private lateinit var posAndneg : Button
    private lateinit var result :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        one = findViewById(R.id.oneButton)
        two = findViewById(R.id.twoButton)
        three = findViewById(R.id.treeButton)
        four = findViewById(R.id.fourButton)
        fife= findViewById(R.id.fifeButton)
        six = findViewById(R.id.sixButton)
        seven = findViewById(R.id.sevenButton)
        eight= findViewById(R.id.eightButton)
        nine = findViewById(R.id.ninButton)
        zero=findViewById(R.id.zeroButton)
        equel=findViewById(R.id.equelButton)
        sum = findViewById(R.id.sumButton)
        min = findViewById(R.id.minsButton)
        mult = findViewById(R.id.miltButton)
        div = findViewById(R.id.divButton)
        c = findViewById(R.id.CButton)
        del = findViewById(R.id.delButton)
        posAndneg = findViewById(R.id.posAndnegButton)
        point = findViewById(R.id.pointButton)


        result = findViewById(R.id.resulttv)

        var calcultorModel = ViewModelProvider(this).get(CalcultorModel::class.java)
        result.text = calcultorModel.resultTV
          // display number
        one.setOnClickListener { calcultorModel.setNum('1')
            result.text = calcultorModel.resultTV }
        two.setOnClickListener { calcultorModel.setNum('2')
            result.text = calcultorModel.resultTV }
        three.setOnClickListener { calcultorModel.setNum('3')
            result.text = calcultorModel.resultTV }
        four.setOnClickListener { calcultorModel.setNum('4')
            result.text = calcultorModel.resultTV }
        fife.setOnClickListener { calcultorModel.setNum('5')
            result.text = calcultorModel.resultTV }
        six.setOnClickListener { calcultorModel.setNum('6')
            result.text = calcultorModel.resultTV }
        seven.setOnClickListener { calcultorModel.setNum('7')
            result.text = calcultorModel.resultTV }
        eight.setOnClickListener { calcultorModel.setNum('8')
            result.text = calcultorModel.resultTV }
        nine.setOnClickListener { calcultorModel.setNum('9')
            result.text = calcultorModel.resultTV }
        zero.setOnClickListener { calcultorModel.setNum('0')
            result.text = calcultorModel.resultTV }


        // display operator
        sum.setOnClickListener { calcultorModel.operator('+')
                 result.text = calcultorModel.resultTV  }
        min.setOnClickListener { calcultorModel.operator('-')
            result.text = calcultorModel.resultTV  }
        mult.setOnClickListener { calcultorModel.operator('*')
            result.text = calcultorModel.resultTV  }
        div.setOnClickListener { calcultorModel.operator('/')
            result.text = calcultorModel.resultTV  }

        //display calculator
        equel.setOnClickListener {  calcultorModel.calculote()
            result.text = calcultorModel.resultTV }

    // deleted from textview
       del.setOnClickListener { calcultorModel.deleteLast()
       result.text = calcultorModel.resultTV}


        c.setOnClickListener { calcultorModel.clearAll()
        result.text = calcultorModel.resultTV}

    }
}