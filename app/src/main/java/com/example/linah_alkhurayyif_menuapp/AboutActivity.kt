package com.example.linah_alkhurayyif_menuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }
    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        val item:MenuItem = menu!!.getItem(0)
        item.setTitle("Home")
        val item2:MenuItem = menu!!.getItem(1)
        item2.setTitle("Help")
        val item3:MenuItem = menu!!.getItem(2)
        item3.setTitle("Main")
        return super.onPrepareOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1 -> {
                startActivity(Intent(this,HomeActivity::class.java))
                return true
            }
            R.id.item2 -> {
                startActivity(Intent(this,HelpActivity::class.java))
                return true
            }
            R.id.item3 -> {
                startActivity(Intent(this,MainActivity::class.java))
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}