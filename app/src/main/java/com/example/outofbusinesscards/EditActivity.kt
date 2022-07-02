package com.example.outofbusinesscards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.Button
import android.widget.TextView
import java.util.function.Predicate

class EditActivity : AppCompatActivity() {

    var companyEdit: TextView = findViewById(R.id.companyEdit)
    var postalEdit: TextView = findViewById(R.id.postalEdit)
    var addressEdit: TextView = findViewById(R.id.addressEdit)
    var telEdit: TextView = findViewById(R.id.telEdit)
    var faxEdit: TextView = findViewById(R.id.faxEdit)
    var emailEdit: TextView = findViewById(R.id.emailEdit)
    var urlEdit: TextView = findViewById(R.id.urlEdit)
    var positionEdit: TextView = findViewById(R.id.positionEdit)
    var nameEdit: TextView = findViewById(R.id.nameEdit)
    var saveBtn: Button = findViewById(R.id.saveBtn)
    var cancelBtn: Button = findViewById(R.id.cancelBtn)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        PreferenceManager.getDefaultSharedPreferences(this).apply {
            val company = getString("company","")
            val postal = getString("postal","")
            val address = getString("address","")
            val tel = getString("tel","")
            val fax = getString("fax","")
            val email = getString("email","")
            val url = getString("url","")
            val position = getString("position","")
            val name = getString("name","")

            companyEdit.setText(company)
            positionEdit.setText(postal)
            addressEdit.setText(address)
            telEdit.setText(tel)
            faxEdit.setText(fax)
            emailEdit.setText(email)
            urlEdit.setText(url)
            positionEdit.setText(position)
            nameEdit.setText(name)
        }
        saveBtn.setOnClickListener {
            saveData()
            finish()
        }
        cancelBtn.setOnClickListener {
            finish()
        }





    }
    private fun saveData(){
        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = pref.edit()

        editor.putString("company",companyEdit.text.toString())
            .putString("postal",postalEdit.text.toString())
            .putString("address",addressEdit.text.toString())
            .putString("tel",telEdit.text.toString())
            .putString("email",faxEdit.text.toString())
            .putString("url",emailEdit.text.toString())
            .putString("position",urlEdit.text.toString())
            .putString("name",positionEdit.text.toString())
            .putString("company",nameEdit.text.toString())
            .apply()


    }
}