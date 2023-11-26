package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.findNavController
import com.example.contactapp.model.Contact

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.new_contact_menu -> {
                val navController = findNavController(R.id.nav_host_fragment)
                navController.navigate(R.id.nav_new_contact)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    companion object {
        val contactList: MutableList<Contact> = mutableListOf<Contact>(
            Contact("John Doe", "123-456-7890", "john.doe@example.com", 1),
            Contact("Jane Smith", "987-654-3210", "jane.smith@example.com", 2),
            Contact("Bob Johnson", "555-123-4567", "bob.johnson@example.com", 3),
            Contact("Alice Lee", "789-456-1230", "alice.lee@example.com", 4),
            Contact("Alex Wang", "456-789-0123", "alex.wang@example.com", 5),
            Contact("Emily Chen", "321-555-7777", "emily.chen@example.com", 6),
            Contact("David Brown", "234-567-8901", "david.brown@example.com", 7),
            Contact("Sarah Miller", "876-543-2109", "sarah.miller@example.com", 8),
            Contact("Michael Davis", "999-888-7777", "michael.davis@example.com", 9),
            Contact("Olivia White", "333-444-5555", "olivia.white@example.com", 10)
        )
    }
}