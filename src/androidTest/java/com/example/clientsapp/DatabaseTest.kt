package com.example.clientsapp

import androidx.room.Room
import androidx.test.runner.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.example.clientsapp.data.UserDao
import com.example.clientsapp.data.UserDatabase
import com.example.clientsapp.model.User
import org.junit.After
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
class DatabaseTest {
    private lateinit var userDao: UserDao
    private lateinit var db: UserDatabase

    @Before
    fun createDb() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        // Using an in-memory database because the information stored here disappears when the
        // process is killed.
        db = Room.inMemoryDatabaseBuilder(context, UserDatabase::class.java)
            .allowMainThreadQueries()
            .build()
        userDao = db.userDao()
    }
    //
    @After
    @Throws(IOException::class)
    fun closeDb() {
        db.close()
    }
    //
    @Test
    @Throws(Exception::class)
     fun insertUser() {
        val item = User(0, "John", "Snow", "+3852055248", "test122@gmail.com")
        userDao.addUser(item)
        val user = userDao.readAllData()
        assertNotNull(user)
    }
}