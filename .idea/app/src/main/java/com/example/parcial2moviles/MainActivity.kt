package com.example.parcial2moviles

import android.content.ClipData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        val btnSave: Button=findViewById(R.id.btnSave)
        btnSave.setOnClickListener{lookvalue()}
    }
    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId){
        R.id.settings_menu-> {
            MaterialAlertDialogBuilder(this)
                .setMessage("Developer Group")
                .setTitle("Oscar/Federico")
                .setPositiveButton("OK") { dialog, which ->
                }
                .setNegativeButton("Cancel") { dialog, which ->
                }
                .show()
            true
        }
        R.id.add_client-> {
            MaterialAlertDialogBuilder(this)
                .setMessage("Developer Group")
                .setTitle("Oscar/Federico")
                .setPositiveButton("OK") { dialog, which ->
                }
                .setNegativeButton("Cancel") { dialog, which ->
                }
                .show()
            true
        }else -> super.onOptionsItemSelected(item)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
    fun lookvalue(){
        val etName = findViewById<EditText>(R.id.etName)
        if (etName.text.isNotEmpty()){
           val intent = Intent(this,PedidoActivity::class.java)
            intent.putExtra("INTENT_NAME", etName.text)
            startActivity(intent)
            }else{
            showError()
        }
    }
fun showError(){
    Toast.makeText(this,"Error Text",Toast.LENGTH_SHORT).show()
}

}