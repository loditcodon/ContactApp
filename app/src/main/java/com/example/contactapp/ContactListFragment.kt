package com.example.contactapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.contactapp.adapter.ContactAdapter

class ContactListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.contact_list_fragment, container, false);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var contactList = view.findViewById<ListView>(R.id.contact_list)
        val items = MainActivity.contactList.map { it }.toMutableList()
        contactList.adapter = ContactAdapter(requireContext(), items)

        contactList.setOnItemClickListener { parent, view, position, id ->
            val item = items[position]
            val params: Bundle = Bundle()
            params.putString("name", item.name)
            params.putString("phone", item.phone)
            params.putString("mail", item.email)
            view.findNavController().navigate(R.id.action_contact_list_to_contact_detail, params)
        }
    }
}