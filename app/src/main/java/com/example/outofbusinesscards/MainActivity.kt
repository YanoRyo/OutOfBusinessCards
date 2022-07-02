package com.example.outofbusinesscards

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

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
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
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

            companyEdit.text = company
            positionEdit.text = postal
            addressEdit.text = address
            telEdit.text = "tel:" + tel
            faxEdit.text = "fax:" + fax
            emailEdit.text = email
            urlEdit.text = url
            positionEdit.text = position
            nameEdit.text = name
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.edit -> {
//                kotlinではクラス名::class.javaでクラスのインスタンスを取得
                val intent = Intent(this,EditActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}