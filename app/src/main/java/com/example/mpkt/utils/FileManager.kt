package com.example.mpkt.utils

import android.os.Environment
import android.util.Log
import com.example.mpkt.utils.Constants.TAG
import com.example.mpkt.utils.FileManager.DIRECTORY_JSONS
import java.io.*

object FileManager {
    const val DIRECTORY_JSONS = "/MP/Jsons/"
}

fun createFile(type: String): String {
    var path = ""
    try {
        val pathname = "${Environment.getExternalStorageDirectory()} $DIRECTORY_JSONS"
        val dir = File(pathname)
        if (!dir.exists()) {
            if (!dir.mkdirs()) {
                debugLog(
                    "ERROR: Creation of directory $pathname failed, check does Android Manifest have permission to write to external storage."
                )
            }
        } else {
            Log.i(TAG, "Created directory $pathname")
        }
        path = "$pathname$type.json"

    } catch (e: Exception) {
        debugLog(e.localizedMessage)
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