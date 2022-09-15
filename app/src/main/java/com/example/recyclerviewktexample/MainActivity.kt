package com.example.recyclerviewktexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        val arrContact = ArrayList<ContactModel>()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        arrContact.add(ContactModel(R.drawable.f, "Alfred", "999999999"))
        arrContact.add(ContactModel(R.drawable.b, "Bob", "999999999"))
        arrContact.add(ContactModel(R.drawable.c, "Cath", "999999999"))
        arrContact.add(ContactModel(R.drawable.d, "David", "999999999"))
        arrContact.add(ContactModel(R.drawable.e, "Eli", "999999999"))
        arrContact.add(ContactModel(R.drawable.f, "Frank", "999999999"))
        arrContact.add(ContactModel(R.drawable.g, "Gwen", "999999999"))
        arrContact.add(ContactModel(R.drawable.h, "Henry", "999999999"))
        arrContact.add(ContactModel(R.drawable.f, "Alfred", "999999999"))
        arrContact.add(ContactModel(R.drawable.b, "Bob", "999999999"))
        arrContact.add(ContactModel(R.drawable.c, "Cath", "999999999"))
        arrContact.add(ContactModel(R.drawable.d, "David", "999999999"))
        arrContact.add(ContactModel(R.drawable.e, "Eli", "999999999"))
        arrContact.add(ContactModel(R.drawable.f, "Frank", "999999999"))
        arrContact.add(ContactModel(R.drawable.g, "Gwen", "999999999"))
        arrContact.add(ContactModel(R.drawable.h, "Henry", "999999999"))

        recyclerView.layoutManager = LinearLayoutManager(this)
        val recyclerAdapter = RecyclerContactAdapter(this, arrContact)
        recyclerView.adapter = recyclerAdapter

    }
}