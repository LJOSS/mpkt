package com.example.mpkt.ui

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mpkt.App
import com.example.mpkt.R
import com.example.mpkt.utils.requestPermission
import com.example.mpkt.utils.checkPermission
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val PERMISSION_REQUEST_CODE = 99
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // можно вынести в отдельный метод, а потом вызвать в OnCreate
        if (!checkPermission(applicationContext)) {
            requestPermission(this)
        } else {
            showSuccessToast()
        }
        //

        // тоже самое
        download.setOnClickListener {
            downloadAll()
        }
        upload.setOnClickListener {
            uploadAll()
        }
        //
    }

    private fun downloadAll() {
        App.downloadController.downloadAll()
    }

    private fun uploadAll() {
        App.uploadController.convertAndUploadAll()
    }

    private fun showSuccessToast() {
        Toast.makeText(this, "SUCCESS PERMISSIONS", Toast.LENGTH_LONG).show()
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        // какой смысл от when, если константа всегда равна 99?
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
