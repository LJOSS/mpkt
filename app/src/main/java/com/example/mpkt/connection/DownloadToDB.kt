package com.example.mpkt.connection

import com.example.mpkt.App
import com.example.mpkt.db.entity.Nurse
import com.example.mpkt.db.entity.Patient
import com.example.mpkt.db.entity.NP
import com.example.mpkt.db.entity.analyzes.Blood
import com.example.mpkt.db.entity.analyzes.Measure
import com.example.mpkt.db.entity.analyzes.Temperature
import com.example.mpkt.db.entity.analyzes.Urine
import com.example.mpkt.utils.Constants.BLOOD
import com.example.mpkt.utils.Constants.MEASURE
import com.example.mpkt.utils.Constants.NP
import com.example.mpkt.utils.Constants.NURSE
import com.example.mpkt.utils.Constants.PATIENTS
import com.example.mpkt.utils.Constants.TEMPERATURE
import com.example.mpkt.utils.Constants.URINE
import com.example.mpkt.utils.DBConstants.ACIDITY
import com.example.mpkt.utils.DBConstants.AGE
import com.example.mpkt.utils.DBConstants.COLOR
import com.example.mpkt.utils.DBConstants.COLOR_INDICATOR
import com.example.mpkt.utils.DBConstants.DENSITY
import com.example.mpkt.utils.DBConstants.EMAIL
import com.example.mpkt.utils.DBConstants.ERYTHROCYTE
import com.example.mpkt.utils.DBConstants.HEMOGLOBIN
import com.example.mpkt.utils.DBConstants.ID
import com.example.mpkt.utils.DBConstants.LEUKOCYTE
import com.example.mpkt.utils.DBConstants.LOWER
import com.example.mpkt.utils.DBConstants.LYMPHOCYTES
import com.example.mpkt.utils.DBConstants.NAME
import com.example.mpkt.utils.DBConstants.NURSE_ID
import com.example.mpkt.utils.DBConstants.PATIENT_ID
import com.example.mpkt.utils.DBConstants.PLATELETS
import com.example.mpkt.utils.DBConstants.PROTEIN
import com.example.mpkt.utils.DBConstants.PULSE
import com.example.mpkt.utils.DBConstants.RETICULOCYTES
import com.example.mpkt.utils.DBConstants.SDE
import com.example.mpkt.utils.DBConstants.TEMPERATURE_C
import com.example.mpkt.utils.DBConstants.TIME
import com.example.mpkt.utils.DBConstants.TRANSPARENCY
import com.example.mpkt.utils.DBConstants.UPPER
import com.example.mpkt.utils.DBConstants.WEIGHT
import com.example.mpkt.utils.debugLog
import com.example.mpkt.utils.fileToString
import org.json.JSONArray
import java.io.File

class DownloadToDB(file: File) {

    init {
        val jsonArray = JSONArray(fileToString(file))

        when {
            file.toString().contains(NURSE) -> {
                App.nurseController.deleteAll()
                downloadNurse(jsonArray)
            }
            file.toString().contains(NP) -> {
                App.nursePersonController.deleteAllNP()
                downloadNP(jsonArray)
            }
            file.toString().contains(PATIENTS) -> {
                App.patientController.deleteAll()
                downloadPatients(jsonArray)
            }
            file.toString().contains(BLOOD) -> {
                App.bloodController.deleteAll()
                downloadBlood(jsonArray)
            }
            file.toString().contains(TEMPERATURE) -> {
                App.temperatureController.deleteAll()
                downloadTemp(jsonArray)
            }
            file.toString().contains(URINE) -> {
                App.urineController.deleteAll()
                downloadUrine(jsonArray)
            }
            file.toString().contains(MEASURE) -> {
                App.measureController.deleteAll()
                downloadMeasure(jsonArray)
            }
        }
    }

    private fun downloadBlood(jsonArray: JSONArray) {
        for (i in 0 until jsonArray.length()) {
            val body = jsonArray.getJSONObject(i)
            val id = body.getInt(ID)
            val time = body.getString(TIME)
            val patientId = body.getInt(PATIENT_ID)
            val colorIndicator = body.getDouble(COLOR_INDICATOR)
            val erythrocyte = body.getDouble(ERYTHROCYTE)
            val hemoglobin = body.getInt(HEMOGLOBIN)
            val leukocyte = body.getInt(LEUKOCYTE)
            val lymphocytes = body.getInt(LYMPHOCYTES)
            val platelets = body.getInt(PLATELETS)
            val reticulocytes = body.getDouble(RETICULOCYTES)
            val sde = body.getInt(SDE)

            App.bloodController.addBlood(
                Blood(
                    id = id,
                    hemoglobin = hemoglobin,
                    erythrocyte = erythrocyte,
                    color_indicator = colorIndicator,
                    reticulocytes = reticulocytes,
                    platelets = platelets,
                    sde = sde,
                    leukocyte = leukocyte,
                    lymphocytes = lymphocytes,
                    patient_id = patientId,
                    time = time
                )
            )
        }
        debugLog("$BLOOD - ${jsonArray.length()}")
    }

    private fun downloadTemp(jsonArray: JSONArray) {
        for (i in 0 until jsonArray.length()) {
            val body = jsonArray.getJSONObject(i)
            val id = body.getInt(ID)
            val time = body.getString(TIME)
            val patientId = body.getInt(PATIENT_ID)
            val temp = body.getDouble(TEMPERATURE_C)
            App.temperatureController.addTemperature(Temperature(id, temp, patientId, time))
        }
        debugLog("$TEMPERATURE - ${jsonArray.length()}")
    }

    private fun downloadUrine(jsonArray: JSONArray) {
        for (i in 0 until jsonArray.length()) {
            val body = jsonArray.getJSONObject(i)
            val id = body.getInt(ID)
            val colorUrine = body.getString(COLOR)
            val time = body.getString(TIME)
            val transparency = body.getString(TRANSPARENCY)
            val patientId = body.getInt(PATIENT_ID)
            val acidity = body.getInt(ACIDITY)
            val density = body.getDouble(DENSITY)
            val protein = body.getDouble(PROTEIN)

            App.urineController.addUrine(
                Urine(
                    id = id,
                    ColorUrine = colorUrine,
                    Transparency = transparency,
                    density = density,
                    patient_id = patientId,
                    acidity = acidity,
                    protein = protein,
                    time = time
                )
            )
        }
        debugLog("$URINE - ${jsonArray.length()}")
    }

    private fun downloadMeasure(jsonArray: JSONArray) {
        for (i in 0 until jsonArray.length()) {
            val body = jsonArray.getJSONObject(i)
            val id = body.getInt(ID)
            val time = body.getString(TIME)
            val patientId = body.getInt(PATIENT_ID)
            val lower = body.getInt(LOWER)
            val pulse = body.getInt(PULSE)
            val upper = body.getInt(UPPER)

            App.measureController.addMeasure(
                Measure(
                    id = id,
                    upper = upper,
                    lower = lower,
                    pulse = pulse,
                    patient_id = patientId,
                    time = time
                )
            )
        }
        debugLog("$MEASURE - ${jsonArray.length()}")
    }

    private fun downloadPatients(jsonArray: JSONArray) {
        for (i in 0 until jsonArray.length()) {
            val body = jsonArray.getJSONObject(i)
            val id = body.getInt(ID)
            val name = body.getString(NAME)
            val age = body.getString(AGE)
            val weight = body.getInt(WEIGHT)
            App.patientController.addPatient(
                Patient(
                    id = id,
                    name = name,
                    weight = weight,
                    age = age,
                    image = null
                )
            )
        }
        debugLog("$PATIENTS - ${jsonArray.length()}")
    }

    private fun downloadNurse(jsonArray: JSONArray) {
        for (i in 0 until jsonArray.length()) {
            val body = jsonArray.getJSONObject(i)
            val id = body.getInt(NURSE_ID)
            val name = body.getString(NAME)
            val age = body.getString(AGE)
            val weight = body.getInt(WEIGHT)
            val email = body.getString(EMAIL)
            App.nurseController.addNurse(
                Nurse(
                    nurseid = id,
                    name = name,
                    weight = weight,
                    age = age,
                    image = null,
                    email = email
                )
            )
        }
        debugLog("$NURSE - ${jsonArray.length()}")
    }

    private fun downloadNP(jsonArray: JSONArray) {
        for (i in 0 until jsonArray.length()) {
            val body = jsonArray.getJSONObject(i)
            val id = body.getInt(ID)
            val nurseId = body.getInt(NURSE_ID)
            val patientId = body.getInt(PATIENT_ID)

            App.nursePersonController.addNP(
                NP(
                    id = id,
                    id_nurse = nurseId,
                    id_user = patientId
                )
            )
        }
        debugLog("$NP - ${jsonArray.length()}")
    }
}