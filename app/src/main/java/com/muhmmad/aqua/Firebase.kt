package com.muhmmad.aqua

import android.util.Log
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MyFirebase(private val contract: Contract) {
    private val TAG = "Firebase"
    private val database = FirebaseDatabase.getInstance()

    fun addingUser(user: User) {
        /*

        database.child(user.id.toString()).child("First name").setValue(user.firstName)
        database.child(user.id.toString()).child("Second name").setValue(user.secondName)
        database.child(user.id.toString()).child("E-mail").setValue(user.email)
        database.child(user.id.toString()).child("Password").setValue(user.password)
        database.child(user.id.toString()).child("PH").setValue(user.phValue)
        database.child(user.id.toString()).child("RGB").setValue(user.rgbValue)
        database.child(user.id.toString()).child("salt").setValue(user.saltValue)
        database.child(user.id.toString()).child("iron").setValue(user.ironValue)
        database.child(user.id.toString()).child("nitrate").setValue(user.nitrateValue)
        database.child(user.id.toString()).child("manganese").setValue(user.manganeseValue)
         */
        database.getReference("/data").setValue(user)
    }

    fun readData() {

        database.getReference("/data/")
            .addValueEventListener(object : ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    val data = snapshot.getValue(User::class.java)!!
                    contract.onSuccess(data)
                    Log.d("Ahmed", snapshot.value.toString())
                }

                override fun onCancelled(error: DatabaseError) {
                    TODO("Not yet implemented")
                }
            })

    }

}