package com.example.mpkt.ui

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mpkt.R
import com.example.mpkt.utils.requestPermission
import com.example.mpkt.utils.checkPermission

class MainActivity : AppCompatActivity() {

    companion object {
        const val PERMISSION_REQUEST_CODE = 99
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (!checkPermission(applicationContext)) {
            requestPermission(this)
        }else{
            showSuccessToast()
        }
    }

    private fun showSuccessToast() {
        Toast.makeText(this, "SUCSECC PERMISSIONS", Toast.LENGTH_LONG).show()
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        when (requestCode) {
            PERMISSION_REQUEST_CODE -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    showSuccessToast()
                } else {
                    requestPermission(this)
                }
            }
        }
    }

}
