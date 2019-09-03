package com.example.mpkt.connection

import android.app.ProgressDialog
import android.os.AsyncTask
import com.dropbox.core.DbxException
import com.dropbox.core.v2.files.UploadErrorException
import com.dropbox.core.v2.files.WriteMode
import com.example.mpkt.App
import com.example.mpkt.utils.Constants.DOWNLOAD
import com.example.mpkt.utils.Constants.UPLOAD
import com.example.mpkt.utils.debugLog
import java.io.*


class Network(private val jsonFile: File, private val type: String) :
    AsyncTask<String, Void, FileOutputStream?>() {
    //TODO удали комментарии и неиспользуемые переменные
    lateinit var progressDialog: ProgressDialog

    override fun onPreExecute() {
        super.onPreExecute()
        /*progressDialog = ProgressDialog(App.instance)
        progressDialog.setTitle("Wait plz")
        progressDialog.setMessage("Wait plz")
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER)
        progressDialog.show()*/
    }

    override fun doInBackground(vararg strings: String): FileOutputStream? {
        try {
            when (type) {
                DOWNLOAD -> {
                    val outputStream = FileOutputStream(jsonFile)
                    val finalURL = "/MP/" + strings[0] + ".json"
                    Connection.makeConnection().files()
                        .download(finalURL)
                        .download(outputStream)
                    return outputStream
                }
                UPLOAD -> {
                    val fileInputStream = FileInputStream(jsonFile)
                    Connection.makeConnection().files()
                        .uploadBuilder("/MP/" + strings[0] + ".json")
                        .withMode(WriteMode.OVERWRITE)
                        .uploadAndFinish(fileInputStream)
                    return null
                }
                else -> {
                    return null
                }
            }
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        } catch (e: UploadErrorException) {
            e.printStackTrace()
        } catch (e: DbxException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return null
    }

    override fun onPostExecute(result: FileOutputStream?) {
        super.onPostExecute(result)
        if (result != null) {
            DownloadToDB(file = jsonFile)
        }
        //progressDialog.hide()
    }
}