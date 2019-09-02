package com.example.mpkt.utils

object DB_Constants {

    // DB Const
    const val DATABASE_NAME = ""
    const val DATABASE_VERSION_1 = 1

    const val CURRENT_DB_VERSION = DATABASE_VERSION_1

    // TABLE NAME
    const val TEMPERATURE_TABLE = "temperature_table"
    const val NURSE_PATIENT_TABLE = "nurse_patient_table"
    const val NURSE_TABLE = "nurse_table"
    const val PATIENT_TABLE = "patient_table"
    const val BLOOD_TABLE = "blood_table"
    const val URINE_TABLE = "urine_table"
    const val MEASURE_TABLE = "measure_table"

    // TABLE FIELDS
    const val ID = "id"
    const val NURSE_ID = "nurse_id"
    const val PATIENT_ID = "patient_id"

    const val NAME = "name"
    const val WEIGHT = "weight"
    const val IMAGE = "image"
    const val AGE = "age"
    const val EMAIL = "email"
    const val PATIENTS = "patients"

    // Количество пациентов
    const val COUNT_OF_PATIENT = "count_of_patients"

    // Время записи
    const val TIME = "time"

    ////////////////ДАВЛЕНИЕ/////////////////////////
    const val UPPER = "upper"
    const val LOWER = "lower"
    const val PULSE = "pulse"
    ////////////////ДАВЛЕНИЕ/////////////////////////

    ////////////////МОЧА/////////////////////////
    // ЦветМочи
    const val COLOR = "color"
    // Прозрачность мочи
    const val TRANSPARENCY = "transparency"
    // Плотность
    const val DENSITY = "density"
    // Кислотность
    const val ACIDITY = "acidity"
    // Белок
    const val PROTEIN = "protein"
    ////////////////МОЧА/////////////////////////

    ////////////////ТЕМПЕРАТУРА/////////////////////////
    // Температура
    const val TEMPERATURE = "temperature"
    ////////////////ТЕМПЕРАТУРА/////////////////////////

    ////////////////КРОВЬ/////////////////////////
    // Гемоглобин
    const val HEMOGLOBIN = "hemoglobin"
    // Эритроциты
    const val ERYTHROCYTE = "erythrocyte"
    // Цветовой показатель
    const val COLOR_INDICATOR = "color_indicator"
    // Ретикулоциты
    const val RETICULOCYTES = "reticulocytes"
    // Тромбоциты
    const val PLATELETS = "platelets"
    // СОЭ
    const val SDE = "sde"
    // Лейкоциты
    const val LEUKOCYTE = "leukocyte"
    // Лимфоциты
    const val LYMPHOCYTES = "lymphocytes"
    ////////////////КРОВЬ/////////////////////////
}