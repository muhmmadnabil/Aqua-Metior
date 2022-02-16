package com.muhmmad.aqua

import android.util.Log
import com.google.firebase.database.FirebaseDatabase

class MyFirebase {
    private val TAG = "Firebase"
    private val database = FirebaseDatabase.getInstance().reference

    fun addingUser(user: User) {
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
    }

    fun readData(userId: Int): User {
        var user: User? = null
        database.child(userId.toString()).get().addOnSuccessListener {
            user = it.value as User
            Log.i(TAG, "user is $user")
        }
        return user!!
    }

}