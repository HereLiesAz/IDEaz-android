package com.example.helloworld

import android.os.Bundle
import com.hereliesaz.aznavrail.updates.AzUpdateChecker
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AzUpdateChecker.check(this, "HereLiesAz/IDEaz-android")
        setContentView(R.layout.activity_main)
    }
}
