package com.example.contactapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import androidx.recyclerview.widget.RecyclerView
import com.example.contactapp.R
import com.example.contactapp.model.Contact

class ContactAdapter(private var context: Context, private var dataset: List<Contact>) :
    ArrayAdapter<Contact>(context, R.layout.contact_item, dataset) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val contact = dataset[position]
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.contact_item, parent, false)
        val name = view.findViewById<TextView>(R.id.name)
        val avatar = view.findViewById<TextView>(R.id.avatar)

        name.text = contact.name
        avatar.text = contact.name[0].toString()
        return view
    }
}