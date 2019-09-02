package com.example.mpkt.connection

import com.dropbox.core.DbxRequestConfig
import com.dropbox.core.v2.DbxClientV2
import com.example.mpkt.utils.ServerConstants.APP_ACCESSTOKEN

object Connection {
    private fun makeConnection(): DbxClientV2 {
        val config = DbxRequestConfig.newBuilder("dropbox/MeasurePreasure").build()
        return DbxClientV2(config, APP_ACCESSTOKEN)
    }
}