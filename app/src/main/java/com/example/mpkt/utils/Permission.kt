package com.example.mpkt.utils

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.mpkt.App
import com.example.mpkt.ui.MainActivity

fun checkPermission(context: Context = App.instance): Boolean {
    val write = ContextCompat.checkSelfPermission(
        context,
        Manifest.permission.WRITE_EXTERNAL_STORAGE
    )
    val camera =
        ContextCompat.checkSelfPermission(context, Manifest.permission.CAMERA)
    val read = ContextCompat.checkSelfPermission(
        context,
        Manifest.permission.READ_EXTERNAL_STORAGE
    )
    return write == PackageManager.PERMISSION_GRANTED &&
            camera == PackageManager.PERMISSION_GRANTED &&
            read == PackageManager.PERMISSION_GRANTED
}


fun requestPermission(activity: Activity) {
    ActivityCompat.requestPermissions(
        activity,
        arrayOf(
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.CAMERA,
            Manifest.permission.READ_EXTERNAL_STORAGE
        ),
        MainActivity.PERMISSION_REQUEST_CODE
    )
}