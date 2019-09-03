package com.example.mpkt.utils

import android.os.Environment
import android.util.Log
import com.example.mpkt.utils.Constants.TAG
import java.io.*

fun createFile(type: String): String {
    var path = ""
    try {
        val pathname =
            Environment.getExternalStorageDirectory().toString() + "/MP/Jsons/"
        val dir = File(pathname)
        if (!dir.exists()) {
            if (!dir.mkdirs()) {
                Log.e(
                    TAG,
                    "ERROR: Creation of directory $pathname failed, check does Android Manifest have permission to write to external storage."
                )
            }
        } else {
            Log.i(TAG, "Created directory $pathname")
        }
        path = "$pathname$type.json"

    } catch (e: Exception) {
        Log.e("QWE", e.localizedMessage)
    }

    return path
}

fun fileToString(file: File): String? {
    try {
        val fileInputStream = FileInputStream(file)
        val buf = BufferedReader(InputStreamReader(fileInputStream))
        var line: String? = buf.readLine()
        val sb = StringBuilder()
        while (line != null) {
            sb.append(line).append("\n")
            line = buf.readLine()
        }
        return sb.toString()

    } catch (e: FileNotFoundException) {
        e.printStackTrace()
    } catch (e: IOException) {
        e.printStackTrace()
    }

    return null
}