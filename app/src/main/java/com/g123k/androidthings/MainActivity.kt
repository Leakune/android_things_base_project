package com.g123k.androidthings

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.things.contrib.driver.button.Button
import com.google.android.things.contrib.driver.rainbowhat.RainbowHat
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.time.toDuration


// import the RainbowHat driver


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        // Gérer la pression
//        GlobalScope.launch { // launch a new coroutine and continue
//            val BAROMETER_RANGE_LOW = 700f
//            val BAROMETER_RANGE_HIGH = 712f
//            fun getWeatherStripColors(pressure: Float): IntArray {
//                val sRainbowColors = IntArray(7)
//                for (i in 0 until sRainbowColors.size) {
//                    val hsv = floatArrayOf(i * 360f / sRainbowColors.size, 1.0f, 1.0f)
//                    sRainbowColors[i] = Color.HSVToColor(255, hsv)
//                }
//
//                val t =
//                    (pressure - BAROMETER_RANGE_LOW) / (BAROMETER_RANGE_HIGH - BAROMETER_RANGE_LOW)
//                var n = Math.ceil((sRainbowColors.size * t).toDouble()).toInt()
//                n = Math.max(0, Math.min(n, sRainbowColors.size))
//
//                val colors = IntArray(sRainbowColors.size)
//                for (i in 0 until n) {
//                    val ri = sRainbowColors.size - 1 - i
//                    colors[ri] = sRainbowColors[ri]
//                }
//
//                return colors
//            }
//
//            val ledstrip = RainbowHat.openLedStrip()
//            val rainbow = IntArray(RainbowHat.LEDSTRIP_LENGTH)
//            ledstrip.brightness = 1
//            val sensor = RainbowHat.openSensor()
//            sensor.temperatureOversampling = Bmx280.OVERSAMPLING_1X
//            sensor.pressureOversampling = Bmx280.OVERSAMPLING_1X
//            while (true) {
//                Log.d(
//                    "TAG",
//                    "getWeatherStripColors(sensor.readPressure())[1]:" + getWeatherStripColors(
//                        sensor.readPressure()
//                    )[0]
//                )
//                Log.d("TAG", "pressure:" + sensor.readPressure())
//
//                for (i in rainbow.indices) {
//                    rainbow[i] = getWeatherStripColors(sensor.readPressure())[i];
//                }
//                ledstrip.write(rainbow)
//
//                delay(1000)
//            }
//        }

        // Afficher la température
//        GlobalScope.launch { // launch a new coroutine and continue
//            val sensor = RainbowHat.openSensor()
//            sensor.temperatureOversampling = Bmx280.OVERSAMPLING_1X
//
//            val segment = RainbowHat.openDisplay()
//            segment.setBrightness(Ht16k33.HT16K33_BRIGHTNESS_MAX)
//            segment.setEnabled(true)
//            while (true) {
//                Log.d("TAG", "temperature:" + sensor.readTemperature())
//                segment.display(sensor.readTemperature().toString())
//                delay(2000)
//
//            }
//        }

        // Effet arc-en-ciel
//        GlobalScope.launch { // launch a new coroutine and continue
//            val ledstrip = RainbowHat.openLedStrip()
//            val rainbow = IntArray(RainbowHat.LEDSTRIP_LENGTH)
//            ledstrip.brightness = 1
//            var t = 0
//            while (true) {
//                t++
//                for (i in rainbow.indices) {
//                    rainbow[i] = Color.HSVToColor(
//                        255,
//                        floatArrayOf((((360f / rainbow.size - 1) * i + t) % 360f), 1.0f, 1.0f)
//                    )
//                }
//                ledstrip.write(rainbow)
//
//                delay(1)
//            }
//        }


        //AFFICHER DU TEXTE
//    val segment = RainbowHat.openDisplay()
//    segment.setBrightness(Ht16k33.HT16K33_BRIGHTNESS_MAX)
//    var text: String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//    segment.setEnabled(true)
//
//      GlobalScope.launch {
//        var text2 = text
//        while(true) {
//            for (i in 0..text.length){
//              segment.display(text2.substring(i))
//              delay(2000)
//            }
//
//        }
//      }

        //Jouer un son
//    GlobalScope.launch {
//      val buzzer = RainbowHat.openPiezo()
//      val frequences = arrayOf(261.0, 294.0, 329.0, 349.0, 392.0, 440.0, 493.0, 523.0)
//        for (i in frequences){
//          buzzer.play(i)
//
//          delay(300)
//        }
//
//      buzzer.stop();
//    }
        // Defining frequency of each music note


        GlobalScope.launch {
            val NOTE_C4 = 262
            val NOTE_D4 = 294
            val NOTE_E4 = 330
            val NOTE_F4 = 349
            val NOTE_G4 = 392
            val NOTE_A4 = 440
            val NOTE_B4 = 494
            val NOTE_C5 = 523
            val NOTE_D5 = 587
            val NOTE_E5 = 659
            val NOTE_F5 = 698
            val NOTE_G5 = 784
            val NOTE_A5 = 880
            val NOTE_B5 = 988

            val notes = intArrayOf(NOTE_E4, NOTE_G4, NOTE_A4, NOTE_A4, 0, NOTE_A4, NOTE_B4, NOTE_C5, NOTE_C5, 0,NOTE_C5, NOTE_D5, NOTE_B4, NOTE_B4, 0, NOTE_A4, NOTE_G4, NOTE_A4, 0,NOTE_E4, NOTE_G4, NOTE_A4, NOTE_A4, 0,NOTE_A4, NOTE_B4, NOTE_C5, NOTE_C5, 0,NOTE_C5, NOTE_D5, NOTE_B4, NOTE_B4, 0,NOTE_A4, NOTE_G4, NOTE_A4, 0,NOTE_E4, NOTE_G4, NOTE_A4, NOTE_A4, 0,NOTE_A4, NOTE_C5, NOTE_D5, NOTE_D5, 0,NOTE_D5, NOTE_E5, NOTE_F5, NOTE_F5, 0,NOTE_E5, NOTE_D5, NOTE_E5, NOTE_A4, 0,NOTE_A4, NOTE_B4, NOTE_C5, NOTE_C5, 0,NOTE_D5, NOTE_E5, NOTE_A4, 0,NOTE_A4, NOTE_C5, NOTE_B4, NOTE_B4, 0,NOTE_C5, NOTE_A4, NOTE_B4, 0,NOTE_A4, NOTE_A4, NOTE_A4, NOTE_B4, NOTE_C5, NOTE_C5, 0,NOTE_C5, NOTE_D5, NOTE_B4, NOTE_B4, 0,NOTE_A4, NOTE_G4, NOTE_A4, 0,NOTE_E4, NOTE_G4, NOTE_A4, NOTE_A4, 0,NOTE_A4, NOTE_B4, NOTE_C5, NOTE_C5, 0,NOTE_C5, NOTE_D5, NOTE_B4, NOTE_B4, 0,NOTE_A4, NOTE_G4, NOTE_A4, 0,NOTE_E4, NOTE_G4, NOTE_A4, NOTE_A4, 0,NOTE_A4, NOTE_C5, NOTE_D5, NOTE_D5, 0,NOTE_D5, NOTE_E5, NOTE_F5, NOTE_F5, 0,NOTE_E5, NOTE_D5, NOTE_E5, NOTE_A4, 0,NOTE_A4, NOTE_B4, NOTE_C5, NOTE_C5, 0,NOTE_D5, NOTE_E5, NOTE_A4, 0,NOTE_A4, NOTE_C5, NOTE_B4, NOTE_B4, 0,NOTE_C5, NOTE_A4, NOTE_B4, 0,NOTE_E5, 0, 0, NOTE_F5, 0, 0,NOTE_E5, NOTE_E5, 0, NOTE_G5, 0, NOTE_E5, NOTE_D5, 0, 0,NOTE_D5, 0, 0, NOTE_C5, 0, 0,NOTE_B4, NOTE_C5, 0, NOTE_B4, 0, NOTE_A4,NOTE_E5, 0, 0, NOTE_F5, 0, 0,NOTE_E5, NOTE_E5, 0, NOTE_G5, 0, NOTE_E5, NOTE_D5, 0, 0,NOTE_D5, 0, 0, NOTE_C5, 0, 0,NOTE_B4, NOTE_C5, 0, NOTE_B4, 0, NOTE_A4)

            val durations = intArrayOf(
                125, 125, 250, 125, 125,
                125, 125, 250, 125, 125,
                125, 125, 250, 125, 125,
                125, 125, 375, 125,
                125, 125, 250, 125, 125,
                125, 125, 250, 125, 125,
                125, 125, 250, 125, 125,
                125, 125, 375, 125,
                125, 125, 250, 125, 125,
                125, 125, 250, 125, 125,
                125, 125, 250, 125, 125,
                125, 125, 125, 250, 125,
                125, 125, 250, 125, 125,
                250, 125, 250, 125,
                125, 125, 250, 125, 125,
                125, 125, 375, 375,
                250, 125,  //Rpeat of First Part
                125, 125, 250, 125, 125,
                125, 125, 250, 125, 125,
                125, 125, 375, 125,
                125, 125, 250, 125, 125,
                125, 125, 250, 125, 125,
                125, 125, 250, 125, 125,
                125, 125, 375, 125,
                125, 125, 250, 125, 125,
                125, 125, 250, 125, 125,
                125, 125, 250, 125, 125,
                125, 125, 125, 250, 125,
                125, 125, 250, 125, 125,
                250, 125, 250, 125,
                125, 125, 250, 125, 125,
                125, 125, 375, 375,  //End of Repeat
                250, 125, 375, 250, 125, 375,
                125, 125, 125, 125, 125, 125, 125, 125, 375,
                250, 125, 375, 250, 125, 375,
                125, 125, 125, 125, 125, 500,
                250, 125, 375, 250, 125, 375,
                125, 125, 125, 125, 125, 125, 125, 125, 375,
                250, 125, 375, 250, 125, 375,
                125, 125, 125, 125, 125, 500
            )
            val buzzer = RainbowHat.openPiezo()
            for (i in 0..notes.size) {
                Log.d("Notes", notes[i].toString())
                Log.d("Duration", durations[i].toString())

                if(notes[i] == 0){
                    buzzer.stop();
                }else{
                    buzzer.play(notes[i].toDouble())
                }
                delay(durations[i].toLong())
            }
            buzzer.stop();

        }


// Close the device when done.
        // buzzer.close();


        setContentView(TextView(this).apply {
            val localIpAddress = Utils.getLocalIpAddress()
            text = localIpAddress
            Log.d("MYIP", localIpAddress)
        })
        // Detect when button 'C' is pressed.
        val button: Button = RainbowHat.openButtonC()
        button.setOnButtonEventListener(fun(button, pressed) {
            Log.d(
                "tag",
                "C clicked"
            );onDestroy()
        })
        //button.close();
    }

}
