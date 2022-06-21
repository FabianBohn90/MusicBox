package com.example.musicbox

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // trage die ID des Buttons hier ein
        var playButton = findViewById<ImageButton>(R.id.play_button)
        playButton.setOnClickListener {
            createSongText()
        }
    }

    /**
     * diese Funktion gibt den Wert des ausgewählten RadioButtons zurück
     **/
    fun getGenreFromRadios(): Int {
        //TODO speichere die Id des ausgewählten Genres in einer Variable und gib diese im return
        // Statement zurück
        // nutze hierfür die .checkedRadioButtonId der RadioGroup

        return 0
    }

    /**
     * diese Funktion gibt den Wert des Sliders zurück
     **/
    fun getSongLength(): Float {
        //TODO speichere die Value des Sliders in einer Variable und gib diese im return
        // Statement zurück
        // nutze hierfür die .value des Sliders

        return 0f
    }


    /**
     * Diese Funktion liest die EditText Felder aus und gibt den Wert zurück
     **/
    fun getStringFromInput(editViewId: Int): String {
        // TODO speichere die Texteingabe des InputFelds in einer Variable
        //  und gib diese im return Statement zurück
        //  nutze hierfür die .text des Inputfelds (vergiss nicht .toString())

        return ""
    }

    /**
     * Diese Funktion  führt Verse und Refrain zusammen und wiederholt je nach songLength
     **/
    fun createSongString(genreVerse: String, genreChorus: String, songLength: Int): String {
        //TODO Füge Verse und Refrain zusammen und wiederhole den Songtext (songLength) - mal
        // mittels .repeat(ANZAHL) kann ein String wiederholt werden

        // TODO speichere einen zusammengesetzten String in einer Variable und gib dies
        //  im return Statement zurück
        //  der String setzt sich wie folgt zusammen (verse + chorus.repeat(3)).repeat(length)
        //  mittels .repeat(Int) lässt sich ein String wiederholen
        return ""
    }


    /**
     * diese Funktion führ die vorher implementierten Funktionen aus, um die Infos asuzulesen und zusammenzuführen
     * Außerdem wird der erstellte songString in der entsprechenden View dargestellt
     **/
    fun createSongText() {

        // TODO Lese die Textfelder aus und speichere die Strings in  Variablen

        // TODO Lese das Genre aus speichere den String in einer Variable
        //  (getGenreFromRadios())

        // TODO Lese die Songlänge aus speichere den Integer in einer Variable
        //  (getSongLength())

        // TODO speichere je nach Genre die richtigen Strings in Variablen für verse und chorus
        //  erstelle hierfür eine when Bedingung und lade je nach RadioButtonId die richtigen Strings mittels getString(STRINGID)



        //TODO nun kannst du createSongString mit verse, chorus und length füttern und das
        // Ergebniss in einer Variable speichern
        // createSongString()


        // TODO zu guter letzt setze die .text deiner Ausgabe TextView auf den den SongString


        // nutzte <TextView>.setMovementMethod(ScrollingMovementMethod()), um TextView scrollable zu machen
        // Achtung: im Layout  muss folgendes in der Textview enthalten sein
        //        android:scaleType="fitXY"
        //        android:scrollbars="vertical"

    }
}
