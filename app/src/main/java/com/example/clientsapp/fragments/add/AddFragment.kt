package com.example.clientsapp.fragments.add

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.clientsapp.R
import com.example.clientsapp.data.UserDatabase
import com.example.clientsapp.model.User
import com.example.clientsapp.viewmodel.UserViewModel
import com.example.clientsapp.viewmodel.UserViewModelFactory
import kotlinx.android.synthetic.main.fragment_add.*
import kotlinx.android.synthetic.main.fragment_add.view.*

class AddFragment : Fragment() {

    private lateinit var mUserViewModelFactory: UserViewModelFactory
    private lateinit var mUserViewModel: UserViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add, container, false)

        val application = requireNotNull(this.activity).application
        val dataSource = UserDatabase.getDatabase(application).userDao()

        mUserViewModelFactory = UserViewModelFactory(dataSource, application)
        mUserViewModel = ViewModelProviders.of(this, mUserViewModelFactory).get(UserViewModel::class.java)

        view.add_btn.setOnClickListener {
            insertDataToDatabase()
        }

        return view
    }

    private fun insertDataToDatabase() {
        val firstName = addFirstName_et.text.toString()
        val lastName = addLastName_et.text.toString()
        val phone = addPhone_et.text.toString()
        val email = addEmail_et.text.toString()

        if(inputCheck(firstName, lastName, phone, email)){
            // Create User Object
            val user = User(
                0,
                firstName,
                lastName,
                phone,
                email
            )
            // Add Data to Database
            mUserViewModel.addUser(user)
            Toast.makeText(requireContext(), "Successfully added!", Toast.LENGTH_LONG).show()
            // Navigate Back
            findNavController().navigate(R.id.action_addFragment_to_listFragment)
        }else{
            Toast.makeText(requireContext(), "Please fill out all fields.", Toast.LENGTH_LONG).show()
        }
    }

    private fun inputCheck(firstName: String, lastName: String, phone: String, email: String): Boolean {
        return !(TextUtils.isEmpty(firstName) && TextUtils.isEmpty(lastName) && TextUtils.isEmpty(phone) && TextUtils.isEmpty(email))
    }

}