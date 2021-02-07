package com.example.savingssystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a = 3
        val b = 5
        val c = 7
        ok.setOnClickListener {
            if (salary.text.toString() != "") {
                var salary = salary.text.toString().toDouble()
                var aa: Double = salary * a / 100
                var bb: Double = aa + salary
                var cc = bb * a / 100
                var dd: Double = cc + bb
                var ee = dd * a / 100
                var ff: Double = ee + dd
                var gg = ff * b / 100
                var hh: Double = gg + ff
                var ii = hh * b / 100
                var jj: Double = ii + hh
                var kk = jj * b / 100
                var ll: Double = kk + jj
                var mm = ll * b / 100
                var nn: Double = mm + ll
                var oo = nn * c / 100
                var pp: Double = oo + nn
                var qq = pp * c / 100
                var rr: Double = qq + pp
                var ss = rr * c / 100
                var tt: Double = ss + rr
                var interr = aa+cc+ee+gg+ii+kk+mm+oo+qq+ss
                inter.setText("$interr")
                result.setText("$tt")
            }
        }
        reset.setOnClickListener(){
            salary.setText(null)
            inter.setText(null)
            result.setText(null)
        }
    }
}