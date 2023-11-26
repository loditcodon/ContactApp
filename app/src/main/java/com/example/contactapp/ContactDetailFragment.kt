package com.example.contactapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ContactDetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.contact_detail_fragment, container, false);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name = arguments?.getString("name")
        val phone = arguments?.getString("phone")
        val mail = arguments?.getString("mail")

        view.findViewById<TextView>(R.id.detail_name).text = name
        view.findViewById<TextView>(R.id.detail_phone_number).text = phone
        view.findViewById<TextView>(R.id.detail_email).text = mail

    }

}